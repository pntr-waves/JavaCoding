/*
 * 834. Viết chương trình thực hiện các yêu cầu sau:
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

package truong.e1000.employeemanagement.model;

public class Employee {
    private String employeeCode;
    private String employeeName;
    private double salary;
    
    public Employee (String employeeCode, String employeeName, double salary) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
