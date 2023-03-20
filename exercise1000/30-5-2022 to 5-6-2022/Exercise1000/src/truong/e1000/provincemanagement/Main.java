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

package truong.e1000.provincemanagement;

import truong.e1000.provincemanagement.service.ProvinceManageService;

public class Main {
    public static void main(String[] args) {
        ProvinceManageService service = new ProvinceManageService();
        System.out.println("1. Total Area: " + service.getTotalArea());
        System.out.println("==========================================");
        
        System.out.println("\n2. Provinces have greatest area:");
        System.out.println("==========================================");
        service.printProvinceList(service.getGreatestAreaProvinceList());
        
        System.out.println("\n3. Provinces have greatest population:");
        System.out.println("==========================================");
        service.printProvinceList(service.getGreatestPopulationProvinceList());
        
        System.out.println("\n4. Sort list of province by area with ascending");
        System.out.println("==========================================");
        service.printProvinceList(service.sortProvinceByArea());
    }
}
