/*835. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các thí
sinh (THISINH). Biết rằng một thí sinh gồm những thành phần như
sau:
- Mã thí sinh: chuỗi tối đa 5 ký tự.
- Họ tên thí sinh: chuỗi tối đa 30 ký tự.
- Điểm toán: kiểu số thực.
- Điểm lý: kiểu số thực.
- Điểm hóa: kiểu số thực.
- Điểm tổng cộng: kiểu số thực.
b. Nhập danh sách.
c. Xuất danh sách.
d. Liệt kê các thí sinh thi đậu trong danh sách. Một thí sinh được gọi là
đậu khi có tổng điểm 3 môn lớn hơn 15 và không có một nào bị
điểm không.
e. Sắp xếp danh sách theo thứ tự giảm dần theo điểm tổng cộng.*/
package truong.e1000.candidatemanagement;

import truong.e1000.candidatemanagement.service.CandidateManagementService;

public class Main {
    public static void main(String[] args) {
        CandidateManagementService service = new CandidateManagementService();
        System.out.println("1. List of pass exam candidate");
        System.out.println("===================================================");
        service.printCandidateList(service.getPassExamCandidateList());
        System.out.println("\n2. Sort candidate list by total mark with asending order");
        System.out.println("===================================================");
        service.printCandidateList(service.sortCandidateListByTotalMark());
    }
}
