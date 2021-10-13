package truong.exercise1000.e823.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.e823.model.Employee;

public class E823Service {
	public int calculateAge(LocalDate birthDay, LocalDate currentDate) {
		if (birthDay != null && currentDate != null) {
			return Period.between(birthDay, currentDate).getYears();
		} else {
			return 0;
		}
	}

	public List<Employee> listEmployeesHasAgeGreatThanAge(List<Employee> listEmployee, int age) {
		List<Employee> resultList = new ArrayList<Employee>();
		for (Employee employee : listEmployee) {
			if (calculateAge(employee.getBirthDay(), LocalDate.now()) > 40) {
				resultList.add(employee);
			}
		}
		return resultList;
	}

	public List<Employee> listEmployeesHasSalaryGreatThan(List<Employee> listEmployee, double compareSalary) {
		List<Employee> resultList = new ArrayList<Employee>();
		for (Employee employee : listEmployee) {
			if (employee.getSalary() > compareSalary) {
				resultList.add(employee);
			}
		}
		return resultList;
	}

	public List<Employee> sortListEmployee(List<Employee> listEmployee) {
		int length = listEmployee.size();
		for (int i = 1; i < length; i++) {
			Employee last = listEmployee.get(i);
			int j = i;
			while (j > 0 && (listEmployee.get(j - 1).getBirthDay().getYear() > last.getBirthDay().getYear())) {
				listEmployee.set(j, listEmployee.get(j - 1));
				j--;
			}
			listEmployee.set(j, last);
		}

		return listEmployee;
	}
	
	public void printListEmployee(List<Employee> listEmployee) {
		for (Employee employee : listEmployee) {
			System.out.println(String.format("name: %s %s, salary: %f, birthday: %s%n", employee.getFirstName(), employee.getLastName(), employee.getSalary(), employee.getBirthDay()));
		}
	}
}
