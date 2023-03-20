package truong.e1000.bookmanagement.model;
//Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các quyển
//sách. Biết rằng thông tin của một quyển sách bao gồm: tên sách (50
//ký tự), tên tác giả (30 ký tự) và năm xuất bản.
//b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các quyển
//sách.
//c. Tìm quyển sách cũ nhất trong danh sách liên kết.
//d. Tìm một năm có nhiều sách xuất bản nhất và liệt kê tất cả các quyển
//sách xuất bản trong năm đó.


public class Book {
    private String bookName;
    private String authorName;
    private long publicationYear;
    
    public Book(String bookName, String authorName, long publicationYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public long getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(long publicationYear) {
        this.publicationYear = publicationYear;
    }
}
