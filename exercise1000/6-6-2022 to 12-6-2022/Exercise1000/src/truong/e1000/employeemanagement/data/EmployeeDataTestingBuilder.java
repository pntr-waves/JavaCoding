/*834. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các nhân
viên (NHANVIEN). Biết rằng một nhân viên gồm những thành
phần như sau:
- Mã nhân viên: chuỗi tối đa 5 ký tự.
- Tên nhân viên: chuỗi tối đa 30 ký tự.
- Lương nhân viên: kiểu số thực.
b. Nhập danh sách.
c. Xuất danh sách.
d. Tìm một nhân viên có lương cao nhất trong danh sách.
e. Tính tổng lương của các nhân viên.
f. Sắp xếp danh sách tăng dần theo lương nhân viên.*/
package truong.e1000.employeemanagement.data;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.employeemanagement.model.Employee;

public class EmployeeDataTestingBuilder {
    public static List<Employee> getEmployeeList () {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("10157-9825", "Papaver radicatum Rottb. ssp. radicatum", 1051.53));
        employeeList.add(new Employee("57520-0565", "Pleuridium mexicanum Cardot", 1041.53));
        employeeList.add(new Employee("65044-1831", "Castilleja rubicundula (Jeps.) T.I. Chuang & Heckard", 1385.98));
        employeeList.add(new Employee("54569-0559", "Bambusa tulda Roxb.", 2933.13));
        employeeList.add(new Employee("60637-004", "Oxytropis sericea Nutt. var. sericea", 1734.79));
        employeeList.add(new Employee("49349-550", "Orthotrichum praemorsum Vent.", 1364.82));
        employeeList.add(new Employee("11084-704", "Celosia argentea L.", 2008.62));
        employeeList.add(new Employee("43857-0274", "Mentzelia involucrata S. Watson", 1121.35));
        employeeList.add(new Employee("57520-0307", "Oxyria digyna (L.) Hill", 1912.61));
        employeeList.add(new Employee("62839-2734", "Callitriche longipedunculata Morong", 1939.63));
        employeeList.add(new Employee("63629-2640", "Bacopa repens (Sw.) Wettst.", 1007.5));
        employeeList.add(new Employee("54973-6440", "Leucolepis Lindb.", 1498.44));
        employeeList.add(new Employee("75990-365", "Cotoneaster multiflorus Bunge", 1145.65));
        employeeList.add(new Employee("45802-038", "Vetiveria nigritana (Benth.) Stapf", 1416.0));
        employeeList.add(new Employee("24236-577", "Silene occidentalis S. Watson ssp. occidentalis", 1604.2));
        employeeList.add(new Employee("51329-1001", "Peperomia hirtipetiola C. DC.", 2302.27));
        employeeList.add(new Employee("49349-815", "Anemone edwardsiana Tharp", 1061.97));
        employeeList.add(new Employee("54868-5194", "Dicentra pauciflora S. Watson", 1969.66));
        employeeList.add(new Employee("51630-003", "Galactia floridana Torr. & A. Gray", 2429.55));
        employeeList.add(new Employee("48951-4057", "Alpinia mutica Roxb.", 1107.44));
        employeeList.add(new Employee("66658-105", "Brickellia dentata (DC.) Sch. Bip.", 2803.05));
        employeeList.add(new Employee("59667-0098", "Rhynchosia phaseoloides (Sw.) DC.", 2217.61));
        employeeList.add(new Employee("76420-482", "Psidium sintenisii (Kiaersk.) Alain", 2886.46));
        employeeList.add(new Employee("35356-908", "Dimelaena oreina (Ach.) Norman", 1161.37));
        employeeList.add(new Employee("0172-3926", "Asplenium lobulatum Mett.", 2551.5));
        employeeList.add(new Employee("68382-021", "Sanicula arguta Greene ex J.M. Coult. & Rose", 2988.03));
        employeeList.add(new Employee("57728-0001", "Acanthus L.", 2843.16));
        employeeList.add(new Employee("43353-924", "Arenaria congesta Nutt. var. simulans Maguire", 1883.6));
        employeeList.add(new Employee("42507-742", "Hydrophyllum fendleri (A. Gray) A. Heller", 1749.44));
        employeeList.add(new Employee("51706-302", "Crataegus fragilis Beadle", 2690.07));
        employeeList.add(new Employee("55154-3384", "Lobelia appendiculata A. DC.", 1333.94));
        employeeList.add(new Employee("42291-671", "Escobaria hesteri (Y. Wright) Buxbaum", 1704.11));
        employeeList.add(new Employee("36987-1498", "Phyllanthus pentaphyllus C. Wright ex Griseb. ssp. polycladus (Urb.) G.L. Webster", 2589.4));
        employeeList.add(new Employee("52083-481", "Limnanthes alba Hartw. ex Benth. ssp. versicolor (Greene) C.T. Mason", 1004.7));
        employeeList.add(new Employee("16590-031", "Hypogymnia krogiae Ohlsson", 1513.97));
        employeeList.add(new Employee("61957-1830", "Achnatherum curvifolium (Swallen) Barkworth", 2174.81));
        employeeList.add(new Employee("59762-6712", "Astragalus oophorus S. Watson var. lonchocalyx Barneby", 1888.59));
        employeeList.add(new Employee("49902-3591", "Thaspium pinnatifidum (Buckley) A. Gray", 2268.28));
        employeeList.add(new Employee("0603-5062", "Dorycnium hirsutum (L.) Ser.", 2200.61));
        employeeList.add(new Employee("43063-391", "Lecidea dolodes Nyl.", 1600.09));
        employeeList.add(new Employee("68788-9854", "Chenopodium hians Standl.", 2348.54));
        employeeList.add(new Employee("24571-102", "Rhodiola integrifolia Raf. ssp. leedyi (Rosend. & J.W. Moore) Kartesz", 2186.56));
        employeeList.add(new Employee("51138-039", "Oenothera howardii (A. Nelson) W.L. Wagner", 2680.84));
        employeeList.add(new Employee("0904-6272", "Roccella DC.", 1514.69));
        employeeList.add(new Employee("0378-0318", "Dillenia suffruticosa (Griffith ex Hook. f. & Thomson) Martelli", 1090.41));
        employeeList.add(new Employee("17478-546", "Calamagrostis canadensis (Michx.) P. Beauv.", 1085.77));
        employeeList.add(new Employee("0378-6171", "Campylocentrum fasciolum (Lindl.) Cogn.", 2697.81));
        employeeList.add(new Employee("66689-036", "Placidiopsis pseudocinerea Breuss", 1679.2));
        employeeList.add(new Employee("17156-235", "Achnatherum nevadense (B.L. Johnson) Barkworth", 1076.24));
        employeeList.add(new Employee("37808-003", "Cucumis dipsaceus C.G. Ehrenb. ex Spach", 2502.75));
        employeeList.add(new Employee("55714-2205", "Justicia pectoralis Jacq.", 1971.35));
        employeeList.add(new Employee("36987-2043", "Phacelia bicolor Torr. ex S. Watson", 2672.17));
        employeeList.add(new Employee("63843-520", "Juncus drummondii E. Mey. var. subtriflorus (E. Mey.) C.L. Hitchc.", 1071.84));
        employeeList.add(new Employee("54340-778", "Parmelinopsis swinscowii (Hale) Elix & Hale", 1324.48));
        employeeList.add(new Employee("0924-5000", "Buddleja madagascariensis Lam.", 1709.24));
        employeeList.add(new Employee("68084-287", "Lesquerella cinerea S. Watson", 1105.77));
        employeeList.add(new Employee("55714-2290", "Symphyotrichum ×tardiflorum (L.) Greuter, Aghababian & Wagenitz", 2381.57));
        employeeList.add(new Employee("51346-012", "Aspicilia albopruinosa (Looman) ?, ined.?", 2143.78));
        employeeList.add(new Employee("51824-534", "Fissidens hallii Austin", 1933.41));
        employeeList.add(new Employee("36800-700", "Tephromela testaceoatra (Vain.) Hertel & Rambold", 2608.72));
        employeeList.add(new Employee("17478-719", "Jacquinia L.", 2674.12));
        employeeList.add(new Employee("51060-065", "Linum alatum (Small) Winkl.", 2952.36));
        
        return employeeList;
    }
}
