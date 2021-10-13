package service;

import java.util.List;

import model.Membership;

public interface IMembershipService {
	public List<Membership> getAllMembership();
	public Membership getMembershipByPoint(List<Membership> list, int point);
	public Membership getMembershipByPoint(int point);
	public void addMembership(Membership membership);
	public void deleteMembership(int id);
	public Membership getMembershipById(List<Membership> list, int id);
	public Membership getMembershipById(int id);
	public void updateMembership(Membership membership);
}
