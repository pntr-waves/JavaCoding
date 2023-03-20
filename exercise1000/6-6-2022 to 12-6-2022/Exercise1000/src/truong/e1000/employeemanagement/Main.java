/*834. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các nhân
viên (NHANVIEN). Biết rằng một nhân viên gồm những thành
phần như sau:
- Mã nhân viên: chuỗi tối đa 5 ký tự.
- Tên nhân viên: chuỗi tối đa 30 ký tự.
- Lương nhân viên: kiểu số thực.
b. Nhập danh sách.
c. Xuất danh sách.
d. Tìm một nhân viên có lương cao nhất trong danh sách.
e. Tính tổng lương của các nhân viên.
f. Sắp xếp danh sách tăng dần theo lương nhân viên.*/

package truong.e1000.employeemanagement;

import truong.e1000.employeemanagement.service.EmployeeManagementService;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementService service = new EmployeeManagementService();
        System.out.println("1. List of Greatest salary employee");
        System.out.println("==============================================================");
        service.printEmployeeList(service.getGreatestSalaryEmployeeList());
        System.out.println("\n2. Number of Employee: " + service.countEmployee());
        System.out.println("==============================================================");
        System.out.println("\n3. Sort Employee List by salary asceding");
        System.out.println("==============================================================");
        service.printEmployeeList(service.sortEmployeeListBySalary());
    }
}
