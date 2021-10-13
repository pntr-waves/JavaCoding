package model;

import java.util.Date;

public class Transaction {
	private int id;
	private Customer customer;
	private Date date;
	private int numberTicket;
	private int numberFreeTicket;

	public Transaction(int id, Customer customer, Date date, int numberTicket, int numberFreeTicket) {
		this.id = id;
		this.setCustomer(customer);
		this.setDate(date);
		this.numberTicket = numberTicket;
		this.numberFreeTicket = numberFreeTicket;
	}

	public Transaction(Customer customer, Date date, int numberTicket, int numberFreeTicket) {
		this.setCustomer(customer);
		this.setDate(date);
		this.numberTicket = numberTicket;
		this.numberFreeTicket = numberFreeTicket;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberTicket() {
		return numberTicket;
	}

	public void setNumberTicket(int numberTicket) {
		this.numberTicket = numberTicket;
	}

	public int getNumberFreeTicket() {
		return numberFreeTicket;
	}

	public void setNumberFreeTicket(int numberFreeTicket) {
		this.numberFreeTicket = numberFreeTicket;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
