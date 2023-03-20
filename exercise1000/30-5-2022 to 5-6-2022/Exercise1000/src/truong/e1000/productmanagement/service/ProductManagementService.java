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

package truong.e1000.productmanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.productmanagement.data.ProductDataTestingBuilder;
import truong.e1000.productmanagement.model.Product;

public class ProductManagementService {

	public void printProductList (List<Product> productList) {
		System.out.println("List of Product"); 
		
		for (Product product : productList) {
			System.out.println("---------------------------------------------------");
			System.out.println("Product Name: " + product.getProductName());
			System.out.println("Unit Price: " + product.getUnitPrice());
			System.out.println("Quantity: " + product.getQuantity());
		}
	}
	
	public int countProductsHasQuantityGreaterthan1000 () {
		List<Product> productList = ProductDataTestingBuilder.getProductList();
		int counter = 0;
		
		for (Product product : productList) {
			if (product.getQuantity() >= 1000) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public List<Product> getBiggestQuantityProductList () {
		List<Product> productList = ProductDataTestingBuilder.getProductList();
		sortByQuantity(productList, 0, productList.size() - 1);
		int mostQuantity = productList.get(productList.size() - 1).getQuantity();
		
		List<Product> rs = new ArrayList<>();
		for (Product product : productList) {
			if (product.getQuantity() == mostQuantity) {
				rs.add(product);
			}
		}
		
		return rs;
	}
	
	void sortByQuantity (List<Product> productList, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			
			sortByQuantity(productList, left, mid);
			sortByQuantity(productList, mid + 1, right);
			
			mergeByQuantity(productList, left, mid, right);
		}
	}

	private void mergeByQuantity(List<Product> productList, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		List<Product> lArr = new ArrayList<>();
		List<Product> rArr = new ArrayList<>();
		
		for (int i = 0; i < n1; i++) {
			lArr.add(productList.get(i + left));
		}
		
		for (int i = 0; i < n2; i++) {
			rArr.add(productList.get(i + mid + 1));
		}
		
		int i = 0, j = 0;
		int k = left;
		
		while (i < n1 && j < n2) {
			if (lArr.get(i).getQuantity() < rArr.get(j).getQuantity()) {
				productList.set(k, lArr.get(i));
				i++;
			} else {
				productList.set(k, rArr.get(j));
				j++;
			}
			
			k++;
		}
		
		while (i < n1) {
			productList.set(k, lArr.get(i));
			i++;
			k++;
		}
		
		while (j < n2) {
			productList.set(k, rArr.get(j));
			j++;
			k++;
		}
	}
}
