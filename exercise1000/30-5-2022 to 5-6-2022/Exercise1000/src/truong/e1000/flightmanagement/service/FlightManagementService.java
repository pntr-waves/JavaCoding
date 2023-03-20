//832. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các
//chuyến bay. Biết rằng một chuyến bay gồm những thành phần như
//sau:
//- Mã chuyến bay: chuỗi tối đa 5 ký tự.
//- Ngày bay: kiểu dữ liệu ngày.
//- Giờ bay: kiểu thời gian.
//- Nơi đi: chuỗi tối đa 20 ký tự.
//- Nơi đến: chuỗi tối đa 20 ký tự.
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tìm một ngày có nhiều chuyến bay nhất.
//e. Tìm một chuyến bay trong danh sách theo mã chuyến bay.

package truong.e1000.flightmanagement.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import truong.e1000.flightmanagement.data.FlightDataTestingBuilder;
import truong.e1000.flightmanagement.model.Flight;

public class FlightManagementService {

    public void printFlight(Flight flight) {
        if (flight != null) {
            System.out.println("\t-------------------------------------------------------");
            System.out.println("\tFlight Code: " + flight.getFlightCode());
            System.out.println("\tTime: " + flight.getFlightTime());
            System.out.println("\tDate: " + flight.getFlightDate());
            System.out.println("\tTo: " + flight.getTo());
            System.out.println("\tFrom: " + flight.getFrom());
        }
    }

    public void printFlightList(List<Flight> flightList) {
        for (Flight flight : flightList) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Flight Code: " + flight.getFlightCode());
            System.out.println("Time: " + flight.getFlightTime());
            System.out.println("Date: " + flight.getFlightDate());
            System.out.println("To: " + flight.getTo());
            System.out.println("From: " + flight.getFrom());
        }
    }

    Map<LocalDate, Integer> getCounterByFlightDate() {
        Map<LocalDate, Integer> counter = new HashMap<>();
        List<Flight> flightList = FlightDataTestingBuilder.getFlightList();

        for (Flight flight : flightList) {
            if (counter.containsKey(flight.getFlightDate())) {
                int count = counter.get(flight.getFlightDate());
                counter.replace(flight.getFlightDate(), count + 1);
            } else {
                counter.put(flight.getFlightDate(), 1);
            }
        }

        return counter;
    }

    int getMaxFlightInDay(Map<LocalDate, Integer> counter) {
        int max = 0;
        for (Map.Entry<LocalDate, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        return max;
    }

    public void getDaysHasTheMostFlight() {
        Map<LocalDate, Integer> counter = getCounterByFlightDate();
        int max = getMaxFlightInDay(counter);
        for (Map.Entry<LocalDate, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("\t" + entry.getKey());
            }
        }
    }

    public Flight getFlightByFlightCode(String flightCode) {
        List<Flight> flightList = FlightDataTestingBuilder.getFlightList();
        sortFlightListByFlightCode(flightList, 0, flightList.size() - 1);
        return getFlightByFlightCode(flightList, flightCode, 0, flightList.size() - 1);
    }

    private Flight getFlightByFlightCode(List<Flight> flightList, String flightCode, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (flightList.get(mid).getFlightCode().compareTo(flightCode.trim()) == 0) {
                return flightList.get(mid);
            }

            if (flightList.get(mid).getFlightCode().compareTo(flightCode.trim()) > 0) {
                return getFlightByFlightCode(flightList, flightCode, left, mid - 1);
            }
            return getFlightByFlightCode(flightList, flightCode, mid + 1, right);
        }

        return null;
    }

    void sortFlightListByFlightCode(List<Flight> flightList, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sortFlightListByFlightCode(flightList, left, mid);
            sortFlightListByFlightCode(flightList, mid + 1, right);

            mergeByFlightCode(flightList, left, mid, right);
        }
    }

    private void mergeByFlightCode(List<Flight> flightList, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Flight> lArr = new ArrayList<>();
        List<Flight> rArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            lArr.add(flightList.get(i + left));
        }

        for (int i = 0; i < n2; i++) {
            rArr.add(flightList.get(i + mid + 1));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (lArr.get(i).getFlightCode().compareTo(rArr.get(j).getFlightCode()) < 0) {
                flightList.set(k, lArr.get(i));
                i++;
            } else {
                flightList.set(k, rArr.get(j));
                j++;
            }

            k++;
        }

        while (i < n1) {
            flightList.set(k, lArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            flightList.set(k, rArr.get(j));
            j++;
            k++;
        }
    }
}
