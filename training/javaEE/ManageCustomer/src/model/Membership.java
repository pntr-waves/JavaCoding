package model;

public class Membership {
	private int id;
	private String name;
	private int point;
	private int freeTicket;

	public Membership(int id, String name, int point, int freeTicket) {
		this.id = id;
		this.name = name;
		this.point = point;
		this.freeTicket = freeTicket;
	}

	public Membership(String name, int point, int freeTicket) {
		this.name = name;
		this.point = point;
		this.freeTicket = freeTicket;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getFreeTicket() {
		return freeTicket;
	}

	public void setFreeTicket(int freeTicket) {
		this.freeTicket = freeTicket;
	}

}
