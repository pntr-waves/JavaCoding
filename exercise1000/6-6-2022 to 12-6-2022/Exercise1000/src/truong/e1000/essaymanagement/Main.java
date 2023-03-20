/*836. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các luận
văn (LUANVAN). Biết rằng một luận văn gồm những thành phần
như sau:
- Mã luận văn: chuỗi tối đa 10 ký tự.
- Tên luận văn: chuỗi tối đa 100 ký tự.
- Họ tên sinh viên thực hiện: chuỗi tối đa 30 ký tự.
- Họ tên giáo viên hướng dẫn: chuỗi tối đa 30 ký tự.
- Năm thực hiện: kiểu số nguyên 2 byte.
b. Nhập danh sách.
c. Xuất danh sách.
d. Tìm năm có nhiều luận văn nhất.
e. Liệt kê các luận văn thực hiện gần nhất.*/
package truong.e1000.essaymanagement;

import truong.e1000.essaymanagement.service.EssayManagementService;

public class Main {
    public static void main(String[] args) {
        EssayManagementService service = new EssayManagementService();
        System.out.println("1. Year has the most number of essay: " + service.getMostEssayYear());
        System.out.println("=============================================================");
        System.out.println("\n2. List essay in 2022");
        System.out.println("=============================================================");
        service.printEssayList(service.getListEssayByYear(2022));
    }
}
