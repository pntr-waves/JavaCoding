//Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các quyển
//sách. Biết rằng thông tin của một quyển sách bao gồm: tên sách (50
//ký tự), tên tác giả (30 ký tự) và năm xuất bản.
//b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các quyển
//sách.
//c. Tìm quyển sách cũ nhất trong danh sách liên kết.
//d. Tìm một năm có nhiều sách xuất bản nhất và liệt kê tất cả các quyển
//sách xuất bản trong năm đó.
package truong.e1000.bookmanagement;

import java.util.List;

import truong.e1000.bookmanagement.service.ManageBookService;

public class Main  {
    public static void main(String[] args) {
        ManageBookService service = new ManageBookService();
        System.out.println("1. Oldest Publication Year Book:");
        System.out.println("===================================");
        service.printBookList(service.getListOldestPublicationYearBook());
        System.out.println("\n2. Find Publication Year with the most book published:");
        System.out.println("===================================");
        List<Long> yearList = service.getYearsWithMostBookPublished();
        for (long year : yearList) {
            System.out.println("Most published book in " + year);
            service.printBookList(service.getListBookByPublicationYear(year));
        }
    }
    
}
    