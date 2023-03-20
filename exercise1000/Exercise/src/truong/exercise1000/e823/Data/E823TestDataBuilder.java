package truong.exercise1000.e823.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.e823.constant.Gender;
import truong.exercise1000.e823.model.Employee;

public class E823TestDataBuilder {

	final static int BASE_SALARY = 1000000;

	public static List<Employee> getTestingData() {
		List<Employee> listEmployee = new ArrayList<Employee>();
		listEmployee.add(new Employee("Jonh", "Nik", 3 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1992, 3, 22)));
		listEmployee.add(new Employee("Jac", "Lee", 4 * BASE_SALARY, Gender.MALE, LocalDate.of(1980, 1, 31)));
		listEmployee.add(new Employee("Jax", "Sirv", 5 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1970, 2, 21)));
		listEmployee.add(new Employee("Talm", "Yasu", 0.1 * BASE_SALARY, Gender.MALE, LocalDate.of(1998, 11, 11)));
		listEmployee.add(new Employee("Yu", "Na", 0.2 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1992, 12, 13)));
		listEmployee.add(new Employee("Jayce", "Kata", 0.8 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1992, 5, 1)));
		listEmployee.add(new Employee("Nauti", "Ali", 4 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1980, 7, 3)));
		listEmployee.add(new Employee("Syn", "Lux", 0.2 * BASE_SALARY, Gender.MALE, LocalDate.of(1992, 8, 4)));
		listEmployee.add(new Employee("Twits", "Grave", 0.3 * BASE_SALARY, Gender.MALE, LocalDate.of(1970, 3, 6)));
		listEmployee.add(new Employee("jinx", "Kaisa", 0.7 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1982, 2, 11)));
		listEmployee.add(new Employee("Jhin", "Lili", 0.3 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1992, 4, 16)));
		listEmployee.add(new Employee("Luci", "Sena", 0.1 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1998, 6, 17)));
		listEmployee.add(new Employee("Mal", "Fiora", 0.1 * BASE_SALARY, Gender.MALE, LocalDate.of(1988, 7, 23)));
		listEmployee.add(new Employee("Aka", "Xin", 4 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1980, 8, 29)));
		listEmployee.add(new Employee("Braum", "Zac", 0.8 * BASE_SALARY, Gender.MALE, LocalDate.of(1992, 9, 27)));
		listEmployee.add(new Employee("Seju", "Lissan", 4 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1993, 1, 17)));
		listEmployee.add(new Employee("Ashe", "Kasa", 0.8 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1991, 3, 16)));
		listEmployee.add(new Employee("Sin", "Kathus", 5 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1990, 2, 18)));
		listEmployee.add(new Employee("Miss", "Fortu", 4 * BASE_SALARY, Gender.MALE, LocalDate.of(1989, 4, 11)));
		listEmployee.add(new Employee("Ezeal", "Arshan", 5 * BASE_SALARY, Gender.MALE, LocalDate.of(1993, 5, 1)));
		listEmployee.add(new Employee("Aatrox", "Ahri", 0.3 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1994, 3, 2)));
		listEmployee.add(new Employee("Bard", "Fizz", 4 * BASE_SALARY, Gender.FEMALE, LocalDate.of(1992, 3, 3)));

		return listEmployee;
	}
}
