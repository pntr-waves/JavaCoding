package truong.exercise1000.e826.model;

import java.time.LocalDate;

public class MilkBottle {
	private String brand;
	private double weight;
	private LocalDate manufactureTime;
	private LocalDate expirationTime;

	public MilkBottle(String brand, double weight, LocalDate manufactureTime, LocalDate expirationTime) {
		this.brand = brand;
		this.weight = weight;
		this.manufactureTime = manufactureTime;
		this.expirationTime = expirationTime;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public LocalDate getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(LocalDate expirationTime) {
		this.expirationTime = expirationTime;
	}

	public LocalDate getManufactureTime() {
		return this.manufactureTime;
	}

	public void setManufactureTime(LocalDate manufactureTime) {
		this.manufactureTime = manufactureTime;
	}
}
