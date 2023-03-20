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

package truong.e1000.provincemanagement.service;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.provincemanagement.data.ProvinceTestingBuilder;
import truong.e1000.provincemanagement.model.Province;

public class ProvinceManageService {
   public double getTotalArea () {
       List<Province> provinceList = ProvinceTestingBuilder.getProvinceList();
       double totalArea = 0;
       for (Province p : provinceList) {
           totalArea += p.getArea();
       }
       
       return totalArea;
   }
   
   public List<Province> getGreatestAreaProvinceList () {
       List<Province> provinceList = ProvinceTestingBuilder.getProvinceList();
       sortProvinceByArea(provinceList, 0, provinceList.size() - 1);
       
       double greatestArea = provinceList.get(provinceList.size() - 1).getArea();
       
       List<Province> rs = new ArrayList<>();
       for (int i = provinceList.size() - 1; i >= 0; i--) {
           if (provinceList.get(i).getArea() == greatestArea) {
               rs.add(provinceList.get(i));
           }
       }
       
       return rs;
   }
   
   public List<Province> getGreatestPopulationProvinceList () {
       List<Province> provinceList = ProvinceTestingBuilder.getProvinceList();
       sortProvinceByPopulation(provinceList, 0, provinceList.size() - 1);
       
       long greatestPopulation = provinceList.get(provinceList.size() - 1).getPopulation();
       
       List<Province> rs = new ArrayList<>();
       for (int i = provinceList.size() - 1; i >= 0; i--) {
           if (provinceList.get(i).getPopulation() == greatestPopulation) {
               rs.add(provinceList.get(i));
           }
       }
       
       return rs;
   }
   
   public void printProvinceList (List<Province> provinceList) {
       System.out.println("\nList of Province");
       for (Province province : provinceList) {
           System.out.println("--------------------------------");
           System.out.println("Province name: " + province.getProvinceName());
           System.out.println("Area: " + province.getArea());
           System.out.println("Population: " + province.getPopulation());
       }
   }
   
   void sortProvinceByPopulation (List<Province> provinceList, int left, int right) {
       if (left < right) {
           int mid = (left + right) / 2;
           
           sortProvinceByPopulation(provinceList, left, mid);
           sortProvinceByPopulation(provinceList, mid + 1, right);
           
           mergeByPopulation(provinceList, left, mid, right);
       }
   }
   
   
   private void mergeByPopulation(List<Province> provinceList, int left, int mid, int right) {
      int n1 = mid - left + 1;
      int n2 = right - mid;
      
      List<Province> lArr = new ArrayList<>();
      List<Province> rArr = new ArrayList<>();
      
      for (int i = 0; i < n1; i++) {
          lArr.add(provinceList.get(i + left));
      }
      
      for (int i = 0; i < n2; i++) {
          rArr.add(provinceList.get(i + mid + 1));
      }
      
      int i, j;
      i = j = 0;
      int k = left;
      
      while (i < n1 && j < n2) {
          if (lArr.get(i).getPopulation() < rArr.get(j).getPopulation()) {
              provinceList.set(k, lArr.get(i));
              i++;
          } else {
              provinceList.set(k, rArr.get(j));
              j++;
          }
          k++;
      }
      
      while (i < n1) {
          provinceList.set(k, lArr.get(i));
          i++;
          k++;
      }
      
      while (j < n2) {
          provinceList.set(k, rArr.get(j));
          j++;
          k++;
      }
   }

   public List<Province> sortProvinceByArea() {
       List<Province> provinceList = ProvinceTestingBuilder.getProvinceList();
       sortProvinceByArea(provinceList, 0, provinceList.size() - 1);
       
       return provinceList;
   }
   
   void sortProvinceByArea (List<Province> provinceList, int left, int right) {
       if (left < right) {
           int mid = (left + right) / 2;
           
           sortProvinceByArea(provinceList, left, mid);
           sortProvinceByArea(provinceList, mid + 1, right);
           
           mergeByArea(provinceList, left, mid, right);
       }
   }
   
   void mergeByArea (List<Province> provinceList, int left, int mid, int right) {
       int n1 = mid - left + 1;
       int n2 = right - mid;
       
       List<Province> lArr = new ArrayList<>();
       List<Province> rArr = new ArrayList<>();
       
       
       for (int i = 0; i < n1; i++) {
           lArr.add(provinceList.get(i + left));
       }
       
       for (int i = 0; i < n2; i++) {
           rArr.add(provinceList.get(mid + i + 1));
       }
       
       int i, j;
       i = j = 0;
       int k = left;
       
       while (i < n1 && j < n2) {
           if (lArr.get(i).getArea() < rArr.get(j).getArea()) {
               provinceList.set(k, lArr.get(i));
               i++;
           } else {
               provinceList.set(k, rArr.get(j));
               j++;
           }
           k++;
       }
       
       while (i < n1) {
           provinceList.set(k, lArr.get(i));
           i++;
           k++;
       }
       
       while (j < n2) {
           provinceList.set(k, rArr.get(j));
           j++;
           k++;
       }
       
   }
}
