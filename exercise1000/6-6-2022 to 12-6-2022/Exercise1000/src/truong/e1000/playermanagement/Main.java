/*833. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các cầu
thủ. Biết rằng một cầu thủ gồm những thành phần như sau:
- Mã cầu thủ: chuỗi tối đa 10 ký tự.
- Tên cầu thủ: chuỗi tối đa 30 ký tự.
- Ngày sinh: kiểu dữ liệu ngày.
b. Nhập danh sách.
c. Xuất danh sách.
d. Liệt kê danh sách các cầu thủ nhỏ tuổi nhất trong danh sách.
e. Sắp xếp các cầu thủ giảm dần theo ngày sinh*/
package truong.e1000.playermanagement;

import truong.e1000.playermanagement.service.PlayerManagementService;

public class Main {
    public static void main(String[] args) {
        PlayerManagementService service = new PlayerManagementService();
        System.out.println("1. List of youngest player: ");
        System.out.println("=======================================================");
        service.printPlayerList(service.getYoungestPlayerList());
        System.out.println("\n2. sort player list: ");
        System.out.println("=======================================================");
        service.printPlayerList(service.sortPlayerListByBirthDay());

    }
}
