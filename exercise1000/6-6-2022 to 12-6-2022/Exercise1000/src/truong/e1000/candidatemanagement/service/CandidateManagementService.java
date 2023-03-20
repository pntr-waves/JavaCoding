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
package truong.e1000.candidatemanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.candidatemanagement.data.CandidateDataTestingBuilder;
import truong.e1000.candidatemanagement.model.Candidate;

public class CandidateManagementService {
    boolean checkPassExam (Candidate candidate) {
        if (candidate.getChemistryMark() > 0 && candidate.getMathMark() > 0 && candidate.getPhysicMark() > 0 && candidate.getTotalMark()> 15) {
            return true;
        }
        
        return false;
    }
    
    public List<Candidate> getPassExamCandidateList () {
        List<Candidate> candidateList = CandidateDataTestingBuilder.getCandidateList();
        List<Candidate> result = new ArrayList<>();
       
        for (Candidate candidate : candidateList) {
            if (checkPassExam(candidate)) {
                result.add(candidate);
            }
        }
        
        return result;
    }
    
    public List<Candidate> sortCandidateListByTotalMark () {
        List<Candidate> candidateList = CandidateDataTestingBuilder.getCandidateList();
        sortCandidateListByTotalMark(candidateList, 0, candidateList.size() - 1);
        return candidateList;
    }
    
    void sortCandidateListByTotalMark (List<Candidate> candidateList, int low, int high) {
        if (low < high) {
            int pi = partition(candidateList, low, high);
            
            sortCandidateListByTotalMark(candidateList, low, pi - 1);
            sortCandidateListByTotalMark(candidateList, pi + 1, high);
        }
    }
    
    int partition (List<Candidate> candidateList, int low, int high) {
        Candidate pivot = candidateList.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (candidateList.get(j).getTotalMark() > pivot.getTotalMark()) {
                i++;
                Candidate temp = candidateList.get(j);
                candidateList.set(j, candidateList.get(i));
                candidateList.set(i, temp);
            }
        }
        candidateList.set(high, candidateList.get(i + 1));
        candidateList.set(i + 1, pivot);
        
        return i + 1;
    }
    
    public void printCandidateList (List<Candidate> candidateList) {
        System.out.println("List of Candidate");
        for (Candidate candidate : candidateList) {
            System.out.println("---------------------------------------------------");
            System.out.println("Candidate Code: " + candidate.getCode());
            System.out.println("Full Name: " + candidate.getFullName());
            System.out.println("Math: " + candidate.getMathMark());
            System.out.println("Physic: " + candidate.getPhysicMark());
            System.out.println("Chemistry: " + candidate.getChemistryMark());
            System.out.println("Total: " + candidate.getTotalMark());
        }
    }
}
