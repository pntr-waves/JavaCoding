//830. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết dơn các vé
//xem phim (VE). Biết rằng một vé xem phim gồm những thành phần
//như sau:
//- Tên phim: chuỗi tối đa 20 ký tự.
//- Giá tiền: kiểu số nguyên 4 byte.
//- Xuất chiếu: kiểu thời gian (THOIGIAN).
//- Ngày xem: kiểu dữ liệu ngày (NGAY).
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tính tổng giá tiền của tất cả các vé trong danh sách.
//e. Sắp xếp các phần tử trong mảng tăng dần theo ngày xem và xuất
//chiếu.
package truong.e1000.ticketmanagement.data;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.ticketmanagement.model.Ticket;

public class TicketDataTestingBuilder {
    public static List<Ticket> getTicketList() {
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(new Ticket("Kroger Company", 28.76, "17:40", "15/06/2021"));
        ticketList.add(new Ticket("GlaxoSmithKline LLC", 51.46, "20:42", "19/02/2022"));
        ticketList.add(new Ticket("Nelco Laboratories, Inc.", 45.18, "06:51", "22/11/2021"));
        ticketList.add(new Ticket("Taro Pharmaceuticals U.S.A., Inc.", 76.74, "02:19", "07/12/2021"));
        ticketList.add(new Ticket("Chattem, Inc.", 90.94, "07:34", "10/08/2021"));
        ticketList.add(new Ticket("Endo Pharmaceuticals Solutions Inc.", 1.73, "14:05", "07/12/2021"));
        ticketList.add(new Ticket("Neutrogena Corporation", 90.53, "22:50", "16/04/2022"));
        ticketList.add(new Ticket("HyVee Inc", 84.97, "07:50", "29/03/2022"));
        ticketList.add(new Ticket("REMEDYREPACK INC.", 19.97, "06:22", "28/12/2021"));
        ticketList.add(new Ticket("Kosan Kozmetik Sanayi ve Ticaret A.S.", 59.35, "04:08", "07/07/2021"));
        ticketList.add(new Ticket("Preferred Pharmaceuticals, Inc.", 61.18, "20:18", "15/08/2021"));
        ticketList.add(new Ticket("Aphena Pharma Solutions - Tennessee, LLC", 80.47, "20:58", "28/11/2021"));
        ticketList.add(new Ticket("Jubilant HollisterStier LLC", 72.52, "18:57", "16/07/2021"));
        ticketList.add(new Ticket("E. FOUGERA & CO., A division of Fougera Pharmaceuticals Inc.", 52.87, "11:49",
                "17/08/2021"));
        ticketList.add(new Ticket("Eastern Century Pharmaceuticals", 15.69, "03:44", "10/03/2022"));
        ticketList.add(new Ticket("NASH-FINCH COMPANY", 18.71, "03:14", "08/06/2021"));
        ticketList.add(new Ticket("American Health Packaging", 11.85, "15:00", "19/06/2021"));
        ticketList.add(new Ticket("Wal-Mart Stores Inc", 23.31, "02:33", "12/03/2022"));
        ticketList.add(new Ticket("KAS Direct LLC dba BabyGanics", 86.07, "14:18", "25/06/2021"));
        ticketList.add(new Ticket("Inel Cosmetics Co., Ltd.", 21.21, "08:33", "25/11/2021"));
        ticketList.add(new Ticket("Gurwitch Products", 45.65, "17:43", "07/07/2021"));
        ticketList.add(new Ticket("Natures Way Holding Co.", 92.2, "05:48", "19/08/2021"));
        ticketList.add(new Ticket("Otsuka America Pharmaceutical, Inc.", 96.7, "18:59", "14/08/2021"));
        ticketList.add(new Ticket("Cadila Healthcare Limited", 74.97, "06:15", "23/11/2021"));
        ticketList.add(new Ticket("Physicians Total Care, Inc.", 54.48, "10:25", "27/12/2021"));
        ticketList.add(new Ticket("PSS World Medical", 62.36, "21:23", "16/06/2021"));
        ticketList.add(new Ticket("Bare Escentuals Beauty Inc.", 5.61, "18:08", "21/05/2022"));
        ticketList.add(new Ticket("OUR FAMILY (Nash Finch Company)", 67.11, "23:58", "03/11/2021"));
        ticketList.add(new Ticket("Medline Industries, Inc.", 18.5, "20:13", "26/09/2021"));
        ticketList.add(new Ticket("Qualitest Pharmaceuticals", 26.57, "20:28", "11/02/2022"));
        ticketList.add(new Ticket("Gavis Pharmaceuticals, LLC.", 88.34, "20:30", "18/05/2022"));
        ticketList.add(new Ticket("Mylan Pharmaceuticals Inc.", 29.81, "17:56", "03/10/2021"));
        ticketList.add(new Ticket("Efficient Laboratories Inc.", 40.85, "10:34", "13/09/2021"));
        ticketList.add(new Ticket("Goldessence, Limited", 18.13, "21:21", "17/06/2021"));
        ticketList.add(new Ticket("Deseret Biologicals, Inc.", 29.93, "12:45", "09/02/2022"));
        ticketList.add(new Ticket("CVS Pharmacy", 75.92, "18:29", "09/10/2021"));
        ticketList.add(new Ticket("Ventura Corporation LTD.", 44.42, "14:29", "04/10/2021"));
        ticketList.add(new Ticket("Gurwitch Products, LLC", 78.7, "04:03", "10/07/2021"));
        ticketList.add(new Ticket("McKesson", 72.98, "09:03", "01/04/2022"));
        ticketList.add(new Ticket("Avon Products, Inc.", 88.76, "07:53", "23/05/2022"));
        ticketList.add(new Ticket("Cardinal Health", 71.09, "11:04", "13/08/2021"));
        ticketList.add(new Ticket("Mylan Pharmaceuticals Inc.", 89.11, "05:01", "23/06/2021"));
        ticketList.add(new Ticket("Preferred Pharmaceuticals, Inc.", 13.74, "03:30", "18/05/2022"));
        ticketList.add(new Ticket("State of Florida DOH Central Pharmacy", 25.99, "13:17", "01/02/2022"));
        ticketList.add(new Ticket("Roxane Laboratories, Inc", 97.76, "20:27", "11/04/2022"));
        ticketList.add(new Ticket("ALK-Abello, Inc.", 30.99, "00:46", "25/12/2021"));
        ticketList.add(new Ticket("CA-BOTANA INTERNATIONAL", 6.39, "05:33", "23/11/2021"));
        ticketList.add(new Ticket("Nelco Laboratories, Inc.", 5.11, "10:24", "03/06/2022"));
        ticketList.add(new Ticket("Jafra Cosmetics International Inc", 85.97, "02:02", "29/11/2021"));
        ticketList.add(new Ticket("The Mentholatum Company", 44.66, "17:38", "16/09/2021"));
        ticketList.add(new Ticket(
                "Johnson & Johnson Consumer Products Company, Division of Johnson & Johnson Consumer Companies, Inc.",
                56.41, "18:13", "13/04/2022"));
        ticketList.add(new Ticket("Antigen Laboratories, Inc.", 35.94, "05:22", "30/01/2022"));
        ticketList.add(new Ticket("NARS COSMETICS", 69.18, "19:32", "05/06/2021"));
        ticketList.add(new Ticket("Orphan Europe, SARL", 96.88, "12:07", "11/04/2022"));
        ticketList.add(new Ticket("GlaxoSmithKline consumer Healthcare LP", 57.33, "06:15", "20/11/2021"));
        ticketList.add(new Ticket("Golden State Medical Supply, Inc.", 80.01, "15:53", "23/01/2022"));
        ticketList.add(new Ticket("Physicians Total Care, Inc.", 5.36, "13:46", "04/02/2022"));
        ticketList.add(new Ticket("Physicians Total Care, Inc", 81.5, "11:37", "16/02/2022"));
        ticketList.add(new Ticket("KJI Industrial Co Ltd", 76.33, "22:14", "22/05/2022"));
        ticketList.add(new Ticket("Apotheca Company", 28.05, "08:11", "24/08/2021"));
        ticketList.add(new Ticket("UCB, Inc.", 4.12, "00:06", "09/01/2022"));
        ticketList.add(new Ticket("SHISEIDO CO., LTD.", 44.06, "16:04", "27/03/2022"));
        ticketList.add(new Ticket("Sandoz Inc", 39.47, "23:37", "03/03/2022"));
        ticketList.add(new Ticket("Rising Pharmaceuticals, Inc.", 93.55, "22:05", "26/04/2022"));
        ticketList.add(new Ticket("Dispensing Solutions, Inc.", 49.87, "19:28", "13/07/2021"));
        ticketList.add(new Ticket("Gerimedix Incorporated", 37.68, "02:42", "21/05/2022"));
        ticketList.add(new Ticket("Cantrell Drug Company", 97.06, "17:38", "07/01/2022"));
        ticketList.add(new Ticket("B. Braun Medical Inc.", 45.16, "21:54", "07/12/2021"));
        ticketList.add(new Ticket("Chattem, Inc.", 34.44, "11:01", "25/01/2022"));
        ticketList.add(new Ticket("WOONSOCKET PRESCRIPTION CENTER,INCORPORATED", 17.2, "03:24", "09/06/2021"));
        ticketList.add(new Ticket("sanofi-aventis U.S. LLC", 89.28, "03:30", "26/09/2021"));
        ticketList.add(new Ticket("DAVA Pharmaceuticals, Inc.", 24.73, "05:12", "02/11/2021"));
        ticketList.add(new Ticket("Medimetriks Pharmaceuticals, Inc.", 16.2, "12:19", "12/11/2021"));
        ticketList.add(new Ticket("Walgreen Company", 73.26, "17:36", "15/09/2021"));
        ticketList.add(new Ticket("Humco holding Group, Inc.", 84.76, "18:01", "19/01/2022"));
        ticketList.add(new Ticket("Sanum Kehlbeck GmbH & Co. KG", 89.45, "04:23", "17/02/2022"));
        ticketList.add(new Ticket("Aurobindo Pharma Limited", 68.4, "07:06", "25/07/2021"));
        ticketList.add(new Ticket("Bristol-Myers Squibb Company", 33.69, "09:13", "26/02/2022"));
        ticketList.add(new Ticket("Cardinal Health", 38.81, "11:36", "09/05/2022"));
        ticketList.add(new Ticket("Global Pharmaceuticals, Division of Impax Laboratories Inc.", 40.88, "11:09",
                "30/07/2021"));
        ticketList.add(new Ticket("Ecolab Inc.", 97.94, "21:17", "21/08/2021"));
        ticketList.add(new Ticket("Cardinal Health", 48.25, "03:13", "27/03/2022"));
        ticketList.add(new Ticket("State of Florida DOH Central Pharmacy", 59.93, "03:07", "19/11/2021"));
        ticketList.add(new Ticket("AuroMedics Pharma LLC", 30.03, "22:22", "25/08/2021"));
        ticketList.add(new Ticket("Golden State Medical Supply, Inc.", 76.11, "00:31", "14/10/2021"));
        ticketList.add(new Ticket("Western Family Foods Inc", 11.78, "23:30", "19/05/2022"));
        ticketList.add(new Ticket("Ventura Corporation LTD", 49.29, "07:34", "18/07/2021"));
        ticketList.add(new Ticket("Shaklee Corporation", 62.78, "23:48", "08/04/2022"));
        ticketList.add(new Ticket("KAISER FOUNDATION HOSPITALS", 18.29, "03:22", "29/01/2022"));

        return ticketList;
    }
}
