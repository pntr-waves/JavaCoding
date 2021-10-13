package exercise1014;

public class App {

//	1014 - Modify the payroll system of Figs. 10.4–10.9 to include an
//	additional Employee subclass PieceWorker that represents an employee whose pay is based on the
//	number of pieces of merchandise produced. Class PieceWorker should contain private instance
//	variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
//	produced). Provide a concrete implementation of method earnings in class PieceWorker that cal-
//	culates the employee’s earnings by multiplying the number of pieces produced by the wage per
//	piece. Create an array of Employee variables to store references to objects of each concrete class in
//	the new Employee hierarchy. For each Employee, display its String representation and earnings.

	public static void main(String[] args) {
		PieceWorker worker1 = new PieceWorker("A", "B", "12415112", 1232131, 43);
		PieceWorker worker2 = new PieceWorker("C", "D", "33300000", 2123133, 22);
		PieceWorker worker3 = new PieceWorker("E", "F", "20202020", 1000000, 10);

		Employees[] listOfEmployees = { worker1, worker2, worker3 };
		
		for(Employees currentEmployee : listOfEmployees) {
			if(currentEmployee instanceof PieceWorker) {
				PieceWorker worker = (PieceWorker) currentEmployee;
				System.out.println(worker.toString() + " " + worker.earning());
			}
		}
	}
}
