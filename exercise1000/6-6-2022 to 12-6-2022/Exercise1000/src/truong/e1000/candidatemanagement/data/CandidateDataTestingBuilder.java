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
package truong.e1000.candidatemanagement.data;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.candidatemanagement.model.Candidate;

public class CandidateDataTestingBuilder {
    public static List<Candidate> getCandidateList () {
        List<Candidate> candidateList = new ArrayList<>();
        candidateList.add(new Candidate("57955-5082", "Thorsten La Torre", 4.2, 9.0, 1.4));
        candidateList.add(new Candidate("68084-082", "Kyrstin McLanaghan", 3.3, 3.1, 3.5));
        candidateList.add(new Candidate("61703-423", "Arel Arnet", 4.1, 7.3, 7.5));
        candidateList.add(new Candidate("76354-203", "Lola Lait", 4.5, 4.4, 7.4));
        candidateList.add(new Candidate("54575-445", "Florance Tuxill", 8.8, 5.1, 9.3));
        candidateList.add(new Candidate("0363-0081", "Tuckie Treadaway", 8.3, 7.6, 3.1));
        candidateList.add(new Candidate("54868-2472", "Xaviera Ladd", 2.7, 1.5, 2.7));
        candidateList.add(new Candidate("33992-1402", "Isabelle Tomowicz", 4.2, 9.2, 2.2));
        candidateList.add(new Candidate("68180-445", "Georgy Churchman", 6.8, 4.7, 2.6));
        candidateList.add(new Candidate("60505-0597", "Mia Marlon", 1.7, 5.4, 1.9));
        candidateList.add(new Candidate("36987-2461", "Martainn Rugieri", 8.1, 9.5, 10.0));
        candidateList.add(new Candidate("67938-2010", "Sheila-kathryn Sherrock", 3.8, 2.3, 4.6));
        candidateList.add(new Candidate("36987-3114", "Spenser Fricker", 1.2, 1.7, 8.2));
        candidateList.add(new Candidate("61369-101", "Nial Oxbury", 6.7, 2.9, 9.4));
        candidateList.add(new Candidate("58414-3508", "Cosimo Rymill", 8.4, 4.9, 7.1));
        candidateList.add(new Candidate("35356-760", "Kinsley Wild", 8.3, 3.4, 5.0));
        candidateList.add(new Candidate("21695-816", "Olivette Burle", 2.8, 4.2, 7.8));
        candidateList.add(new Candidate("60793-854", "Rafaela Twatt", 5.0, 2.3, 3.3));
        candidateList.add(new Candidate("42254-319", "Carina Kleisel", 5.5, 3.9, 5.9));
        candidateList.add(new Candidate("55289-606", "Ebony Sottell", 3.2, 2.4, 1.3));
        candidateList.add(new Candidate("62211-340", "Gert Rubenov", 8.9, 2.1, 9.6));
        candidateList.add(new Candidate("0093-8343", "Ericka O\"\"Growgane", 5.4, 4.1, 7.1));
        candidateList.add(new Candidate("58118-1513", "Dorie Burker", 7.5, 8.7, 6.6));
        candidateList.add(new Candidate("61734-203", "Zarah Gilogly", 2.2, 2.8, 6.0));
        candidateList.add(new Candidate("0378-1713", "Lorena Varian", 9.9, 4.8, 2.4));
        candidateList.add(new Candidate("0206-3100", "Palm Millhouse", 8.8, 6.8, 9.6));
        candidateList.add(new Candidate("59779-141", "Norma Scintsbury", 9.9, 4.1, 1.5));
        candidateList.add(new Candidate("49884-323", "Vivi Pittway", 9.8, 7.2, 3.8));
        candidateList.add(new Candidate("0409-1890", "Adelaide Dorkens", 3.8, 5.9, 2.6));
        candidateList.add(new Candidate("62670-4792", "Toby Sebrook", 4.4, 4.1, 8.3));
        candidateList.add(new Candidate("49230-206", "Mechelle Buckthought", 5.1, 5.4, 8.7));
        candidateList.add(new Candidate("51852-100", "Heath Spaughton", 4.4, 4.4, 7.2));
        candidateList.add(new Candidate("49288-0196", "Vi Thoresby", 9.4, 2.2, 9.8));
        candidateList.add(new Candidate("50967-317", "Rahel Fraschetti", 4.7, 7.2, 9.7));
        candidateList.add(new Candidate("13668-005", "Kingsly Elverstone", 3.9, 9.8, 5.5));
        candidateList.add(new Candidate("57520-0646", "Dag Holliar", 2.1, 4.2, 9.5));
        candidateList.add(new Candidate("51460-0502", "Kay Ceney", 1.0, 5.2, 6.2));
        candidateList.add(new Candidate("68788-9728", "Birgit Ivannikov", 8.5, 3.8, 2.5));
        candidateList.add(new Candidate("64117-962", "Nial Bridie", 2.1, 2.0, 1.2));
        candidateList.add(new Candidate("43419-513", "Faustine Thowes", 3.1, 7.2, 2.6));
        candidateList.add(new Candidate("54569-6543", "Corilla Moniker", 2.1, 7.0, 3.6));
        candidateList.add(new Candidate("51531-2825", "Laura Pavek", 9.9, 5.5, 5.5));
        candidateList.add(new Candidate("16590-689", "Alyssa Mossbee", 3.1, 3.4, 9.3));
        candidateList.add(new Candidate("57520-0407", "Marney Mart", 7.4, 9.3, 9.7));
        candidateList.add(new Candidate("0179-0094", "Randi Blessed", 1.9, 5.5, 8.0));
        candidateList.add(new Candidate("13668-011", "Thea Monini", 9.8, 8.6, 5.2));
        candidateList.add(new Candidate("43857-0053", "Natalina Snoad", 4.2, 6.9, 3.3));
        candidateList.add(new Candidate("64980-134", "Joseph Chettoe", 4.9, 4.8, 2.5));
        candidateList.add(new Candidate("48951-8129", "Bent Belshaw", 8.1, 9.8, 5.7));
        candidateList.add(new Candidate("11673-174", "Yetty Wildbore", 5.0, 1.0, 9.5));
        candidateList.add(new Candidate("98132-141", "Haroun Oulett", 8.5, 4.7, 1.7));
        candidateList.add(new Candidate("41190-047", "Jethro Stones", 6.2, 4.4, 3.1));
        candidateList.add(new Candidate("49349-862", "Priscella Ownsworth", 1.2, 5.8, 6.8));
        candidateList.add(new Candidate("16590-306", "Teressa Basilone", 5.4, 5.9, 5.2));
        candidateList.add(new Candidate("0168-0337", "Hollyanne Sirett", 5.0, 9.6, 8.9));
        candidateList.add(new Candidate("60505-0751", "Forest Cello", 5.8, 8.2, 2.6));
        candidateList.add(new Candidate("30142-123", "Windham Carren", 2.5, 4.7, 5.3));
        candidateList.add(new Candidate("59726-224", "Luis Aleksidze", 8.0, 2.5, 6.3));
        candidateList.add(new Candidate("65162-607", "Jeanette Ringrose", 1.4, 9.0, 9.4));
        candidateList.add(new Candidate("41250-014", "Erv Germann", 7.2, 3.8, 8.3));
        candidateList.add(new Candidate("63304-845", "Brandea Howle", 6.9, 8.9, 3.0));
        candidateList.add(new Candidate("48664-001", "Daveen Janc", 6.7, 8.4, 7.1));
        candidateList.add(new Candidate("68016-111", "Oswell De Marchi", 4.7, 9.6, 2.2));
        candidateList.add(new Candidate("55154-4219", "Nettie Stodhart", 2.4, 1.6, 4.9));
        candidateList.add(new Candidate("46437-001", "Dredi McCluskey", 2.8, 1.1, 2.8));
        candidateList.add(new Candidate("68604-237", "Keri Messruther", 2.8, 5.7, 5.8));
        candidateList.add(new Candidate("51285-047", "Jillene Shelsher", 5.0, 2.3, 3.4));
        candidateList.add(new Candidate("34645-5028", "Germaine Gonnin", 1.3, 9.2, 1.9));
        return candidateList;
    }
}
