package truong.exercise1000.e824;

import truong.exercise1000.e824.Data.E824DataTestBuilder;
import truong.exercise1000.e824.model.Student;
import truong.exercise1000.e824.service.E824Service;

public class E824App {
	public static void main(String[] args) {
		Student[] listStudent = E824DataTestBuilder.getListStudent();
		E824Service service = new E824Service();
		
		
		System.out.println("list student has math mark < 5");
		System.out.println("======================================");
		service.printListStudent(service.getListStudentHasMathMarkLessThan5(listStudent));
		System.out.println("how many student has math and liteture mark > 8 in list?");
		System.out.print("=>");
		System.out.println(service.countStudentHasMathAndLitetureMarkGreatThan8(listStudent));
		System.out.println("sort student ascending by average mark");
		System.out.println("======================================");
		service.printListStudent(service.sortListStudentByAverageMark(listStudent));
	}
}
