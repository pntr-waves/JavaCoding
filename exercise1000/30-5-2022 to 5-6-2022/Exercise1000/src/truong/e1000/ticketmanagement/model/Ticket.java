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

package truong.e1000.ticketmanagement.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String filmName;
    private double price;
    private LocalTime showtime;
    private LocalDate showdate;

    public Ticket(String filmName, double price, String showtime, String showdate) {
        this.filmName = filmName;
        this.price = price;
        this.showtime = LocalTime.parse(showtime, DateTimeFormatter.ofPattern("HH:mm"));
        this.showdate = LocalDate.parse(showdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalTime getShowtime() {
        return showtime;
    }

    public void setShowtime(LocalTime showtime) {
        this.showtime = showtime;
    }

    public LocalDate getShowdate() {
        return showdate;
    }

    public void setShowdate(LocalDate showdate) {
        this.showdate = showdate;
    }
}
