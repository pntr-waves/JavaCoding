package exercise1012;

public class App {

//	1012 - Modify the payroll system of Figs. 10.4–10.9 to include pri-
//	vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//	ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//	Create an array of Employee variables to store references to the various employee objects. In a loop,
//	calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//	payroll amount if the current month is the one in which the Employee’s birthday occurs.4


	public static void main(String[] args) {

		SalariedEmployee employee1 = new SalariedEmployee("A", "B", "123456", new Date(3, 4, 1991), 1455);
		SalariedEmployee employee2 = new SalariedEmployee("C", "D", "123456", new Date(3, 8, 1991), 2000);
		SalariedEmployee employee3 = new SalariedEmployee("E", "F", "123456", new Date(3, 10, 1991), 4000);

		SalariedEmployee[] listOfEmployees = { employee1, employee2, employee3 };
		
		for(Payable currentEmployee: listOfEmployees) {
			if(currentEmployee instanceof SalariedEmployee) {
				SalariedEmployee salariedEmployee = (SalariedEmployee) currentEmployee;
				
				System.out.println(salariedEmployee.getFirstName() + " " + salariedEmployee.getLastName() + " -> " + salariedEmployee.getPaymentAmount() );
			}
		}
	}
}
