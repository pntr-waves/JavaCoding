package service;

import java.util.List;

import model.Customer;
import model.Membership;

public interface ICustomerService {
	public List<Customer> findCustomer(String name, String gender, String phoneNumber, String membership, String minPoint, String maxPoint);
	public void updateCustomer(int id, String newName, String newGender, String newPhoneNumber, int newPoint, String newAddress, String newEmail);
//	public Customer getCustomerById(int id, List<Customer> list);
	public void deleteCustomer(int id);
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
//	public boolean isLevelExistInCustomer(List<Customer> list, int id);
	public boolean isLevelExistInCustomer(int id);
	public List<Customer> getCustomersbyLevelId(int id);
	public Customer getCustomerById(int id);
	public void updateCustomerByMembership(Customer customer, Membership membership, int point, int freeTicket);
	public void updateAllCustomerFromMembership(int levelId, int levelPoint);
	public void updateCustomerByTransaction(int customerId, int numberTicket, int numberFreeTicket);
	public List<Customer> getCustomerGreaterThanPoint(int point, int levelId);
}
