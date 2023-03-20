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
package truong.e1000.essaymanagement.model;

public class Essay {
    private String code;
    private String essayName;
    private String studentName;
    private String teacherName;
    private long year;
    
    public Essay (String code, String essayName, String studentName, String teacherName, long year) {
        this.code = code;
        this.essayName = essayName;
        this.studentName = studentName;
        this.teacherName = teacherName;
        this.year = year;
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getEssayName() {
        return essayName;
    }
    public void setEssayName(String essayName) {
        this.essayName = essayName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public long getYear() {
        return year;
    }
    public void setYear(long year) {
        this.year = year;
    }
}
