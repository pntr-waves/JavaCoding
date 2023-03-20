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
package truong.e1000.essaymanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import truong.e1000.essaymanagement.data.EssayDataTestingBuilder;
import truong.e1000.essaymanagement.model.Essay;

public class EssayManagementService {
    public Map<Long, Integer> getCountEssayMap (List<Essay> essayList) {
        Map<Long, Integer> counter = new HashMap<>();
        
        for (Essay essay : essayList) {
            if (counter.containsKey(essay.getYear())) {
                int count = counter.get(essay.getYear());
                counter.replace(essay.getYear(), count + 1);
            } else {
                counter.put(essay.getYear(), 1);
            }
        }
        
        return counter;
    }
    
    public long getMostEssayYear () {
        List<Essay> essayList = EssayDataTestingBuilder.getEssayList();
        Map<Long, Integer> counter = getCountEssayMap(essayList);
        int max = 0;
        long result = 0;
        
        for (Map.Entry<Long, Integer> set : counter.entrySet()) {
            if (set.getValue() > max) {
                result = set.getKey();
            }
        }
        
        return result;
    }
    
    public List<Essay> getListEssayByYear (long year) {
        List<Essay> essayList = EssayDataTestingBuilder.getEssayList();
        List<Essay> result = new ArrayList<>();
        
        for (Essay essay : essayList) {
            if (essay.getYear() == year) {
                result.add(essay);
            }
        }
        
        return result;
    }
    
    public void printEssayList (List<Essay> essayList) {
        System.out.println("Essay List: ");
        
        for (Essay essay : essayList) {
            System.out.println("--------------------------------------------------");
            System.out.println("Code: " + essay.getCode());
            System.out.println("Essay Name: " + essay.getEssayName());
            System.out.println("Student: " + essay.getStudentName());
            System.out.println("Teacher: " + essay.getTeacherName());
            System.out.println("Year: " + essay.getYear() );
        }
    }
}
