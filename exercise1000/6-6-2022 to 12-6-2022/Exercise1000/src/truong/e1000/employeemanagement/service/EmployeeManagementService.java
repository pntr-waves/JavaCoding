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
package truong.e1000.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.employeemanagement.data.EmployeeDataTestingBuilder;
import truong.e1000.employeemanagement.model.Employee;

public class EmployeeManagementService {
    
    public void printEmployeeList (List<Employee> employeeList) {
        System.out.println("List of Employee");
        for (Employee employee : employeeList) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Employee Code: " + employee.getEmployeeCode());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Salary: " + employee.getSalary());
        }
    }
    
    public List<Employee> getGreatestSalaryEmployeeList () {
        List<Employee> employeeList = EmployeeDataTestingBuilder.getEmployeeList();
        double greatestSalary = getGreatestSalary(employeeList);
        List<Employee> result = new ArrayList<>();
        
        for (Employee employee : employeeList) {
            if (employee.getSalary() == greatestSalary) {
                result.add(employee);
            }
        }
        
        return result;
    }
    
    double getGreatestSalary (List<Employee> employeeList) {
        sortEmployeeListBySalary(employeeList);
        return employeeList.get(employeeList.size() - 1).getSalary();
    }
    
    public int countEmployee () {
        List<Employee> employeeList = EmployeeDataTestingBuilder.getEmployeeList();
        return employeeList.size();
    }
    
    public List<Employee> sortEmployeeListBySalary () {
        List<Employee> employeeList = EmployeeDataTestingBuilder.getEmployeeList();
        sortEmployeeListBySalary(employeeList);
        
        return employeeList;
    }
    
    void sortEmployeeListBySalary (List<Employee> employeeList) {
        int length = employeeList.size();
        
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyBySalary(employeeList, length, i);
        }
        
        for (int i = length - 1; i > 0; i--) {
            Employee temp = employeeList.get(0);
            employeeList.set(0, employeeList.get(i));
            employeeList.set(i, temp);
            heapifyBySalary(employeeList, i, 0);
        }
    }
    
    void heapifyBySalary (List<Employee> employeeList, int length, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        
        if (left < length && employeeList.get(largest).getSalary() < employeeList.get(left).getSalary()) {
            largest = left;
        }
        
        if (right < length && employeeList.get(largest).getSalary() < employeeList.get(right).getSalary()) {
            largest = right;
        }
        
        if (largest != index) {
            Employee temp = employeeList.get(largest);
            employeeList.set(largest, employeeList.get(index));
            employeeList.set(index, temp);
            
            heapifyBySalary(employeeList, length, largest);
        }
    }
}
