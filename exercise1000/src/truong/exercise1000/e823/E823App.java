package truong.exercise1000.e823;

import java.util.List;

import truong.exercise1000.e823.Data.E823TestDataBuilder;
import truong.exercise1000.e823.model.Employee;
import truong.exercise1000.e823.service.E823Service;

public class E823App {
//	Viết chương trình thực hiện các yêu cầu sau trên danh sách liên kết đơn
//	các nhân viên:
//	a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các nhân
//	viên. Biết rằng thông tin của một nhân viên bao gồm: họ tên (30 ký
//	tự), ngày sinh (kiểu ngày), lương (số thực), giới tính (0. Nữ, 1.
//	Nam).
//	b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các nhân
//	viên.
//	c. Liệt kê các nhân viên trên 40 tuổi trong danh sách.
//	d. Đếm số lượng nhân viên có lương lớn hơn 1.000.000 đồng trong
//	danh sách.
//	e. Viết hàm sắp xếp các nhân viên giảm dần theo năm sinh (không
//	quan tâm ngày và tháng sinh).
	
	public static void main(String[] args) {
		final int COMPARE_AGE = 40;
		final double COMPARE_SALARY = 1000000;
		List<Employee> listEmployee = E823TestDataBuilder.getTestingData();
		E823Service service = new E823Service();
		System.out.println("list employee has age great than 40");
		System.out.println("======================================");
		service.printListEmployee(service.listEmployeesHasAgeGreatThanAge(listEmployee, COMPARE_AGE));
		System.out.println("list employee has salary great than 1M");
		System.out.println("======================================");
		service.printListEmployee(service.listEmployeesHasSalaryGreatThan(listEmployee, COMPARE_SALARY));
		System.out.println("sort employee descending by year of birth");
		System.out.println("======================================");
		service.printListEmployee(service.sortListEmployee(listEmployee));
	}
}
