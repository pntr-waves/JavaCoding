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
package truong.e1000.playermanagement.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import truong.e1000.playermanagement.data.PlayerDataTestingBuilder;
import truong.e1000.playermanagement.model.Player;

public class PlayerManagementService {
    
    int getYoungestAge (List<Player> playerList) {
        sortPlayerListByAge(playerList);
        return getPlayerAge(playerList.get(0).getBirthDay());
    }
    
    public List<Player> getYoungestPlayerList () {
        List<Player> playerList = PlayerDataTestingBuilder.getPlayerList();
        int yougestAge = getYoungestAge(playerList);
        System.out.println(yougestAge);
        List<Player> result = new ArrayList<>();
        
        for (Player player : playerList) {
            if (getPlayerAge(player.getBirthDay()) == yougestAge) {
                result.add(player);
            }
        }
        
        return result;
    }
    
    public List<Player> sortPlayerListByBirthDay() {
        List<Player> playerList = PlayerDataTestingBuilder.getPlayerList();
        sortPlayerListByBirthDay(playerList);
        return playerList;
    }
    
    public void printPlayerList (List<Player> playerList) {
        System.out.println("Player List: ");
        for (Player player : playerList) {
            System.out.println("--------------------------------------------------");
            System.out.println("Player Code: " + player.getPlayerCode());
            System.out.println("Player Name: " + player.getPlayerName());
            System.out.println("Birthday: " + player.getBirthDay());
            System.out.println("Age:" + getPlayerAge(player.getBirthDay()));
        }
    }
    
    void sortPlayerListByAge (List<Player> playerList) {
        int length = playerList.size();
        
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyByAge(playerList, length, i);
        }
        
        for (int i = length - 1; i > 0; i--) {
            Player temp = playerList.get(0);
            playerList.set(0, playerList.get(i));
            playerList.set(i, temp);
            heapifyByAge(playerList, i, 0);
        }
    }
    
    void heapifyByAge (List<Player> playerList, int length, int index) {
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        
        if (left < length && getPlayerAge(playerList.get(largest).getBirthDay()) < getPlayerAge(playerList.get(left).getBirthDay())) {
            largest = left;
        }
        
        if (right < length && getPlayerAge(playerList.get(largest).getBirthDay()) < getPlayerAge(playerList.get(right).getBirthDay())) {
            largest = right;
        }
        
        if (index != largest) {
            Player temp = playerList.get(largest);
            playerList.set(largest, playerList.get(index));
            playerList.set(index, temp);
            heapifyByAge(playerList, length, largest);
        }
    }

    void sortPlayerListByBirthDay(List<Player> playerList) {
        int length = playerList.size();

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapifyByBirthDay(playerList, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            Player temp = playerList.get(0);
            playerList.set(0, playerList.get(i));
            playerList.set(i, temp);
            heapifyByBirthDay(playerList, i, 0);
        }
    }

    void heapifyByBirthDay(List<Player> playerList, int length, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < length && playerList.get(largest).getBirthDay().isAfter(playerList.get(left).getBirthDay())) {
            largest = left;
        }

        if (right < length && playerList.get(largest).getBirthDay().isAfter(playerList.get(right).getBirthDay())) {
            largest = right;
        }

        if (largest != index) {
            Player temp = playerList.get(index);
            playerList.set(index, playerList.get(largest));
            playerList.set(largest, temp);

            heapifyByBirthDay(playerList, length, largest);
        }
    }

    public int getPlayerAge(LocalDate birthDay) {
        if (birthDay != null) {
            return Period.between(birthDay, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

}
