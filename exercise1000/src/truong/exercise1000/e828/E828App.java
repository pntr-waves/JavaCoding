package truong.exercise1000.e828;

import java.util.List;

import truong.exercise1000.e828.Data.E828DataTestBuilder;
import truong.exercise1000.e828.model.Book;
import truong.exercise1000.e828.service.E828Service;

public class E828App {
//	a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các quyển
//	sách. Biết rằng thông tin của một quyển sách bao gồm: tên sách (50
//	ký tự), tên tác giả (30 ký tự) và năm xuất bản.
//	b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các quyển
//	sách.
//	c. Tìm quyển sách cũ nhất trong danh sách liên kết.
//	d. Tìm một năm có nhiều sách xuất bản nhất và liệt kê tất cả các quyển
//	sách xuất bản trong năm đó.
	
	public static void main(String[] args) {
		List<Book> listBook = E828DataTestBuilder.getListBook();
		E828Service service = new E828Service();
		
		System.out.println("List Book have oldest publish date");
		service.printListBook(service.getListBookHasOldestPublishDate(listBook));
		System.out.println("\nPublish date has owned by most book");
		System.out.println(service.getPublishDateOwnedMostBook(listBook));
		System.out.println("\nList most book has same publish date");
		List<Book> listMostBook = service.getListMostBookHasSamePublishDate(listBook);
		service.printListBook(listMostBook);
	}
}
