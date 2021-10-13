package model;

import constant.Gender;

public class Customer {
	private int id;
	private String name;
	private Gender gender;
	private String phoneNumber;
	private int point;
	private Membership memberShip;
	private String address;
	private String email;
	private int freeTicket;

	public Customer(int id, String name, String gender, String phoneNumber, int point, Membership memberShip, String address,
			String email, int freeTicket) {
		this.id = id;
		this.name = name;
		this.setGender(gender);
		this.phoneNumber = phoneNumber;
		this.point = point;
		this.memberShip = memberShip;
		this.address = address;
		this.email = email;
		this.setFreeTicket(freeTicket);
	}
	
	public Customer(String name, String gender, String phoneNumber, int point, Membership memberShip, String address,
			String email, int freeTicket) {
		this.name = name;
		this.setGender(gender);
		this.phoneNumber = phoneNumber;
		this.point = point;
		this.memberShip = memberShip;
		this.address = address;
		this.email = email;
		this.setFreeTicket(freeTicket);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Membership getMembership() {
		return this.memberShip;
	}

	public void setMembership(Membership memberShip) {
		this.memberShip = memberShip;
	}
	
//	public void setMemberShip(String membership) {
//		switch (membership) {
//		case "silver":
//			this.memberShip= MemberShip.SILVER;
//			break;
//		case "gold":
//			this.memberShip= MemberShip.GOLD;
//			break;
//		default:
//			this.memberShip= MemberShip.PLATINUM;
//			break;
//		}
//	}

	public Gender getGender() {
		return gender;
	}
//
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}
	
	public void setGender(String gender) {
		if (gender.equals("M")) {
			this.gender =  Gender.MALE;
		} else {
			this.gender = Gender.FEMALE;
		}
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFreeTicket() {
		return freeTicket;
	}

	public void setFreeTicket(int freeTicket) {
		this.freeTicket = freeTicket;
	}
}
