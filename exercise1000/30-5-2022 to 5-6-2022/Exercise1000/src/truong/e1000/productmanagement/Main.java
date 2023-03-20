//831. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các mặt
//hàng (MATHANG). Biết rằng một mặt hàng gồm những thành
//phần như sau:
//- Tên mặt hàng: chuỗi tối đa 20 ký tự.
//- Đơn giá: kiểu số nguyên 4 byte.
//- Số lượng tồn: kiểu số nguyên 4 byte.
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tìm mặt hàng có tổng giá trị tồn là lớn nhất.
//e. Đếm số lượng mặt hàng có số lượng tồn lớn hơn 1.000
package truong.e1000.productmanagement;

import truong.e1000.productmanagement.service.ProductManagementService;

public class Main {
	public static void main(String[] args) {
		ProductManagementService service = new ProductManagementService();
		System.out.println("1. List of Product has the biggest amount");
		System.out.println("===================================================");
		service.printProductList(service.getBiggestQuantityProductList());
		
		System.out.println("\n2. The number of product has quantity greater than 1000");
		System.out.println("===================================================");
	}
}
