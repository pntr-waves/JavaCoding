/*
 * 833. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các cầu
thủ. Biết rằng một cầu thủ gồm những thành phần như sau:
- Mã cầu thủ: chuỗi tối đa 10 ký tự.
- Tên cầu thủ: chuỗi tối đa 30 ký tự.
- Ngày sinh: kiểu dữ liệu ngày.
b. Nhập danh sách.
c. Xuất danh sách.
d. Liệt kê danh sách các cầu thủ nhỏ tuổi nhất trong danh sách.
e. Sắp xếp các cầu thủ giảm dần theo ngày sinh.*/

package truong.e1000.playermanagement.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {
    private String playerCode;
    private String playerName;
    private LocalDate birthDay;

    public Player(String playerCode, String playerName, String birthDay) {
        this.playerCode = playerCode;
        this.playerName = playerName;
        this.birthDay = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

}
