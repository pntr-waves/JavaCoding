//830. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết dơn các vé
//xem phim (VE). Biết rằng một vé xem phim gồm những thành phần
//như sau:
//- Tên phim: chuỗi tối đa 20 ký tự.
//- Giá tiền: kiểu số nguyên 4 byte.
//- Xuất chiếu: kiểu thời gian (THOIGIAN).
//- Ngày xem: kiểu dữ liệu ngày (NGAY).
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tính tổng giá tiền của tất cả các vé trong danh sách.
//e. Sắp xếp các phần tử trong mảng tăng dần theo ngày xem và xuất
//chiếu.

package truong.e1000.ticketmanagement;

import truong.e1000.ticketmanagement.service.TicketManagementService;

public class Main {
	public static void main(String[] args) {
		TicketManagementService service = new TicketManagementService();
		System.out.println("1.Total price of ticket list: " + service.getTotalPriceofListTicket());
		System.out.println("===========================================================");
		
		System.out.println("\n2. Arrange ticket list by show time/date with ascending order: ");
		service.printTicketList(service.sortListByShowDateTime());
	}
}
