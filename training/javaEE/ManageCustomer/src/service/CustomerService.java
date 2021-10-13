package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.CustomerDAO;
import core.ServiceFactory;
import model.Customer;
import model.Membership;

public class CustomerService implements ICustomerService {

    CustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> list = new ArrayList<Customer>();
        try {
            list = customerDAO.getAllCustomer();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void addCustomer(Customer customer) {
        try {
            customerDAO.addCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(int id) {
        try {
            customerDAO.deleteCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public Customer getCustomerById(int id, List<Customer> list) {
//        for (Customer c : list) {
//            if (c.getId() == id) {
//                return c;
//            }
//        }
//        return null;
//    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer = null;
        try {
            customer = customerDAO.getCustomerById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void updateCustomer(int id, String newName, String newGender, String newPhoneNumber, int newPoint,
            String newAddress, String newEmail) {

        Customer customer = getCustomerById(id);

        if (customer.getName() != newName) {
            customer.setName(newName);
        }

        if (customer.getGender().getTitle() != newGender) {
            customer.setGender(newGender);
        }

        if (customer.getPhoneNumber() != newPhoneNumber) {
            customer.setPhoneNumber(newPhoneNumber);
        }

        if (customer.getPoint() != newPoint) {
            customer.setPoint(newPoint);
            Membership membership = ServiceFactory.get(IMembershipService.class).getMembershipByPoint(newPoint);
            System.out.println(customer.getMembership().getId() + "-" + membership.getId());
            if (customer.getMembership().getId() != membership.getId()) {
                customer.setFreeTicket(membership.getFreeTicket());
            }
            customer.setMembership(membership);
        }

        if (customer.getAddress() != newAddress) {
            customer.setAddress(newAddress);
        }

        if (customer.getEmail() != newEmail) {
            customer.setEmail(newEmail);
        }

        try {
            customerDAO.updateCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findCustomer(String name, String gender, String phoneNumber, String membership,
            String minPoint, String maxPoint) {
        List<Customer> list = new ArrayList<Customer>();

        try {
            list = customerDAO.findCustomer(name, gender, phoneNumber, membership, minPoint, maxPoint);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

//    @Override
//    public boolean isLevelExistInCustomer(List<Customer> list, int id) {
//        int length = list.size();
//        int index = 0;
//
//        while (index < length) {
//            if (id == list.get(index).getMembership().getId()) {
//                return true;
//            }
//            index++;
//        }
//        return false;
//    }

    @Override
    public boolean isLevelExistInCustomer(int id) {
        boolean exists = false;
        try {
            exists = customerDAO.isLevelExistInCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

    @Override
    public List<Customer> getCustomersbyLevelId(int id) {
        List<Customer> list = null;
        try {
            list = customerDAO.getCustomerFromIdLevel(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public List<Customer> getCustomerGreaterThanPoint(int point, int levelId){
        List<Customer> listCustomer = null;
        try {
            listCustomer = customerDAO.getCustomerGreaterThanPoint(point, levelId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    @Override
    public void updateCustomerByMembership(Customer customer, Membership membership, int point, int freeTicket) {
        customer.setPoint(point);
        if (point >= membership.getPoint()) {
            customer.setMembership(membership);
            customer.setFreeTicket(membership.getFreeTicket());
        } else {
            int newFree = customer.getFreeTicket() - freeTicket;
            customer.setFreeTicket(newFree);
        }

        try {
            customerDAO.updateCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAllCustomerFromMembership(int level, int levelPoint) {
        List<Customer> listCustomer = getCustomerGreaterThanPoint(levelPoint, level);
        int length = listCustomer.size();
        int index = 0;

        while (index < length) {
            int p = listCustomer.get(index).getPoint();
            Membership m = ServiceFactory.get(IMembershipService.class).getMembershipByPoint(p);
            listCustomer.get(index).setMembership(m);
            listCustomer.get(index).setFreeTicket(m.getFreeTicket());
            try {
                customerDAO.updateCustomer(listCustomer.get(index));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            index++;
        }

    }

    @Override
    public void updateCustomerByTransaction(int customerId, int numberTicket, int numberFreeTicket) {
        Customer customer = getCustomerById(customerId);
        int point = customer.getPoint();
        int free = customer.getFreeTicket();

        point += numberTicket * 10;
        Membership membership = ServiceFactory.get(IMembershipService.class).getMembershipByPoint(point);

        if (customer.getMembership().getPoint() < membership.getPoint()) {
            free = (free - numberFreeTicket) + membership.getFreeTicket();
        } else if (customer.getMembership().getPoint() > membership.getPoint()) {
            free = (free - numberFreeTicket) - customer.getMembership().getFreeTicket();
        } else {
            free = free - numberFreeTicket;
        }
        customer.setMembership(membership);
        customer.setPoint(point);
        if (free <= 0) {
            free = 0;
        }
        customer.setFreeTicket(free);

        try {
            customerDAO.updateCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
