//829.Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các tỉnh.
//Biết rằng thông tin của một tỉnh bao gồm: tên tỉnh (tối đa 30 ký tự),
//diện tích (kiểu số thực), dân số (số nguyên dài).
//b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết đơn các
//tỉnh.
//c. Tính tổng diện tích của tất cả các tính trong dslk.
//d. Tìm địa chỉ của node chứa tỉnh có diện tích lớn nhất trong danh
//sách.
//e. Tìm một tỉnh có dân số lớn nhất trong dslk đơn.
//f. Sắp xếp danh sách tăng dần theo diện tích.

package truong.e1000.provincemanagement.model;

public class Province {
    private String provinceName;
    private double area;
    private long population;
    
    public Province (String provinceName, double area, long population) {
        this.provinceName = provinceName;
        this.area = area;
        this.population = population;
    }
    
    public String getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
}
