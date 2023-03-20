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
package truong.e1000.candidatemanagement.model;

public class Candidate {
    private String code;
    private String fullName;
    private double mathMark;
    private double physicMark;
    private double chemistryMark;
    private double totalMark;
    
    public Candidate (String code, String fullName, double mathMark, double physicMark, double chemistryMark) {
        this.code = code;
        this.fullName = fullName;
        this.mathMark = mathMark;
        this.physicMark = physicMark;
        this.chemistryMark = chemistryMark;
        this.totalMark = (this.mathMark + this.physicMark + this.chemistryMark);
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getMathMark() {
        return mathMark;
    }
    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }
    public double getPhysicMark() {
        return physicMark;
    }
    public void setPhysicMark(double physicMark) {
        this.physicMark = physicMark;
    }
    public double getChemistryMark() {
        return chemistryMark;
    }
    public void setChemistryMark(double chemistryMark) {
        this.chemistryMark = chemistryMark;
    }
    public double getTotalMark() {
        return totalMark;
    }
    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }
    
    
}
