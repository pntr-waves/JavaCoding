//832. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các
//chuyến bay. Biết rằng một chuyến bay gồm những thành phần như
//sau:
//- Mã chuyến bay: chuỗi tối đa 5 ký tự.
//- Ngày bay: kiểu dữ liệu ngày.
//- Giờ bay: kiểu thời gian.
//- Nơi đi: chuỗi tối đa 20 ký tự.
//- Nơi đến: chuỗi tối đa 20 ký tự.
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tìm một ngày có nhiều chuyến bay nhất.
//e. Tìm một chuyến bay trong danh sách theo mã chuyến bay.
package truong.e1000.flightmanagement;

import java.util.Scanner;

import truong.e1000.flightmanagement.service.FlightManagementService;

public class Main {
    public static void main(String[] args) {
        FlightManagementService service = new FlightManagementService();
        System.out.println("1. Days have the most flight: ");
        System.out.println("=========================================================");
        service.getDaysHasTheMostFlight();

        System.out.println("\n2.Find The Flight: ");
        System.out.println("=========================================================");
        System.out.print("\tEnter Flight Code: ");
        Scanner sc = new Scanner(System.in);
        String flightCode = sc.next();
        service.printFlight(service.getFlightByFlightCode(flightCode));
        ;
    }
}
