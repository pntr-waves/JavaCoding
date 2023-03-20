package truong.exercise1000.e823.model;

import java.time.LocalDate;

import truong.exercise1000.e823.constant.Gender;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private Gender gender;
	private LocalDate birthDay;

	public Employee(String firstName, String lastName, double salary, Gender gender, LocalDate birthDay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
