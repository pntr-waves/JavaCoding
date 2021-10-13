package exercise1014;

public abstract class Employees{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employees(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
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

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public abstract double earning();
	
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName() ;
	}

}
