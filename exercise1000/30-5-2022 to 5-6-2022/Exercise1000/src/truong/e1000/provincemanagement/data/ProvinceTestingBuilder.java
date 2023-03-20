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

package truong.e1000.provincemanagement.data;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.provincemanagement.model.Province;

public class ProvinceTestingBuilder {
    public static List<Province> getProvinceList () {
        List<Province> provinceList = new ArrayList<>();
        provinceList.add(new Province ("Landscaping & Irrigation", 10.1414, 81118));
        provinceList.add(new Province ("Framing (Steel)", 74.4389, 58009));
        provinceList.add(new Province ("EIFS", 62.97, 33542));
        provinceList.add(new Province ("Wall Protection", 9.112, 7815));
        provinceList.add(new Province ("Doors, Frames & Hardware", 40.3358, 87441));
        provinceList.add(new Province ("Elevator", 56.3729, 16574));
        provinceList.add(new Province ("Epoxy Flooring", 48.6663, 90381));
        provinceList.add(new Province ("Structural and Misc Steel (Fabrication)", 73.7696, 43196));
        provinceList.add(new Province ("Structural & Misc Steel Erection", 61.9914, 66260));
        provinceList.add(new Province ("Doors, Frames & Hardware", 16.5295, 24745));
        provinceList.add(new Province ("Marlite Panels (FED)", 35.6538, 76757));
        provinceList.add(new Province ("EIFS", 70.9467, 89293));
        provinceList.add(new Province ("Landscaping & Irrigation", 10.0642, 10174));
        provinceList.add(new Province ("Drywall & Acoustical (MOB)", 31.0928, 9657));
        provinceList.add(new Province ("Painting & Vinyl Wall Covering", 88.8888, 84332));
        provinceList.add(new Province ("Drilled Shafts", 84.0733, 50154));
        provinceList.add(new Province ("RF Shielding", 56.4, 27662));
        provinceList.add(new Province ("Elevator", 96.3843, 46255));
        provinceList.add(new Province ("Framing (Steel)", 29.0141, 18057));
        provinceList.add(new Province ("Termite Control", 89.3494, 11185));
        provinceList.add(new Province ("Masonry & Precast", 58.8713, 69667));
        provinceList.add(new Province ("Framing (Steel)", 71.5429, 10859));
        provinceList.add(new Province ("Structural & Misc Steel Erection", 8.8105, 5742));
        provinceList.add(new Province ("Wall Protection", 98.6468, 66371));
        provinceList.add(new Province ("Plumbing & Medical Gas", 65.6609, 13864));
        provinceList.add(new Province ("Framing (Steel)", 88.0361, 16677));
        provinceList.add(new Province ("Structural & Misc Steel Erection", 18.1336, 32689));
        provinceList.add(new Province ("Ornamental Railings", 20.2455, 35098));
        provinceList.add(new Province ("Roofing (Metal)", 28.3809, 96503));
        provinceList.add(new Province ("Drywall & Acoustical (FED)", 90.1923, 10542));
        provinceList.add(new Province ("Drilled Shafts", 76.33, 62644));
        provinceList.add(new Province ("Structural & Misc Steel Erection", 84.2703, 95997));
        provinceList.add(new Province ("Drywall & Acoustical (FED)", 97.3055, 67010));
        provinceList.add(new Province ("Drywall & Acoustical (MOB)", 10.1663, 90531));
        provinceList.add(new Province ("Masonry & Precast", 58.0762, 5839));
        provinceList.add(new Province ("Structural & Misc Steel Erection", 88.4348, 93637));
        provinceList.add(new Province ("Plumbing & Medical Gas", 45.7609, 77258));
        provinceList.add(new Province ("Rebar & Wire Mesh Install", 66.3639, 99517));
        provinceList.add(new Province ("Overhead Doors", 95.2544, 33707));    
        
        return provinceList;
    }
}
