package service;

import java.sql.SQLException;
import java.util.List;

import connection.MembershipDAO;
import core.ServiceFactory;
import model.Membership;

public class MembershipService implements IMembershipService {

	MembershipDAO membershipDAO = new MembershipDAO();

	@Override
	public List<Membership> getAllMembership() {
		List<Membership> list = null;
		try {
			list = membershipDAO.getAllMembership();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Membership getMembershipByPoint(List<Membership> list, int point) {
		Membership membership = null;
		System.out.println("point " +list.size());
		int length = list.size();
		int index = 0;
		
		while(index < length) {
			if(point >= list.get(index).getPoint()) {
				System.out.println("done");
				if(membership == null) {
					membership = list.get(index);
				}else {
					if(membership.getPoint() < list.get(index).getPoint()) {
						membership=list.get(index);
					}
				}
			}
			index++;
		}
		
		return membership;
	}
	
	@Override
    public Membership getMembershipByPoint(int point) {
       Membership membership = null;
       try {
        membership = membershipDAO.getMembershipByPoint(point);
       } catch (SQLException e) {
        e.printStackTrace();
       }
       return membership;
    }

	@Override
	public void addMembership(Membership membership) {
		try {
			membershipDAO.addMembership(membership);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ServiceFactory.get(ICustomerService.class).updateAllCustomerFromMembership(membership.getId(), membership.getPoint());
	}

	@Override
	public void deleteMembership(int id) {
		try {
			membershipDAO.deleteMembership(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Membership getMembershipById(List<Membership> list, int id) {
		Membership membership = null;
		int length = list.size();
		int index = 0;
		
		while(index<length) {
			if(id == list.get(index).getId()) {
				membership = list.get(index);
			}
			index++;
		}
		return membership;
	}
	
    @Override
    public Membership getMembershipById(int id) {
        Membership membership = null;
        try {
            membership = membershipDAO.getMembershipById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return membership;
    }

	@Override
	public void updateMembership(Membership membership) {
		try {
			membershipDAO.updateMembership(membership);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ServiceFactory.get(ICustomerService.class).updateAllCustomerFromMembership(membership.getId(), membership.getPoint());
	}
}
