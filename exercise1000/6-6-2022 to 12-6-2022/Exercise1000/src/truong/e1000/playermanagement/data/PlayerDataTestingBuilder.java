/*833. Viết chương trình thực hiện các yêu cầu sau:
a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các cầu
thủ. Biết rằng một cầu thủ gồm những thành phần như sau:
- Mã cầu thủ: chuỗi tối đa 10 ký tự.
- Tên cầu thủ: chuỗi tối đa 30 ký tự.
- Ngày sinh: kiểu dữ liệu ngày.
b. Nhập danh sách.
c. Xuất danh sách.
d. Liệt kê danh sách các cầu thủ nhỏ tuổi nhất trong danh sách.
e. Sắp xếp các cầu thủ giảm dần theo ngày sinh.*/

package truong.e1000.playermanagement.data;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.playermanagement.model.Player;

public class PlayerDataTestingBuilder {
    public static List<Player> getPlayerList() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("49349-785", "Consolata Betteriss", "09/09/2001"));
        playerList.add(new Player("53590-102", "Fin Lemmers", "15/04/1998"));
        playerList.add(new Player("43063-023", "Sofie Denizet", "12/10/2001"));
        playerList.add(new Player("36000-010", "Shurlocke Hayen", "09/08/2001"));
        playerList.add(new Player("68084-355", "Dewey Wasson", "09/03/1998"));
        playerList.add(new Player("31722-421", "Vi Longega", "31/08/2001"));
        playerList.add(new Player("30142-923", "Tan Francescuzzi", "09/09/2001"));
        playerList.add(new Player("37000-853", "Alejoa Kubek", "15/03/1998"));
        playerList.add(new Player("64778-0377", "Rozamond Rathjen", "05/11/2001"));
        playerList.add(new Player("46708-112", "Conney Karpov", "26/03/1998"));
        playerList.add(new Player("59779-699", "Hiram Volet", "31/05/1998"));
        playerList.add(new Player("54868-5971", "Ellerey Najafian", "12/10/2001"));
        playerList.add(new Player("44911-0005", "Kati Aughtie", "13/04/1998"));
        playerList.add(new Player("49288-0576", "Adel Hawker", "16/10/2001"));
        playerList.add(new Player("0924-5603", "Cherin Barlee", "13/09/2001"));
        playerList.add(new Player("48951-5019", "Kalie Castelin", "29/01/1998"));
        playerList.add(new Player("0007-4891", "Bethina Foord", "19/08/2001"));
        playerList.add(new Player("68047-252", "Ag Flaherty", "22/07/2001"));
        playerList.add(new Player("65371-025", "Valentine Bruton", "20/07/2001"));
        playerList.add(new Player("54575-181", "Florida Godspeede", "06/04/1998"));
        playerList.add(new Player("36987-3150", "Fleurette Atkirk", "01/11/2001"));
        playerList.add(new Player("55316-117", "Reuben Greneham", "06/08/2001"));
        playerList.add(new Player("0268-6109", "Frankie Ovize", "12/11/2001"));
        playerList.add(new Player("36987-1669", "Ainslee Hargitt", "22/11/2001"));
        playerList.add(new Player("21695-361", "Verne Rohloff", "18/07/2001"));
        playerList.add(new Player("36800-468", "Allan Faucherand", "26/10/2001"));
        playerList.add(new Player("66184-530", "Mordecai Leate", "09/11/2001"));
        playerList.add(new Player("64159-7700", "Basia Pibsworth", "09/05/1998"));
        playerList.add(new Player("37012-523", "Giffie Tice", "27/10/2001"));
        playerList.add(new Player("11822-5744", "Khalil Benko", "12/09/2001"));
        playerList.add(new Player("63323-202", "Micheline Firle", "15/04/1998"));
        playerList.add(new Player("42291-626", "Christopher Lawfull", "01/02/1998"));
        playerList.add(new Player("54949-002", "Orel Long", "08/06/1998"));
        playerList.add(new Player("68084-401", "Fernando Tackell", "14/03/1998"));
        playerList.add(new Player("55115-2041", "Guilbert Jzhakov", "08/11/2001"));
        playerList.add(new Player("13668-003", "Rosemary Scading", "05/01/1998"));
        playerList.add(new Player("52584-614", "Gerianne Misken", "08/01/1998"));
        playerList.add(new Player("23155-227", "Urbanus Stronack", "27/02/1998"));
        playerList.add(new Player("43406-0019", "Brien Scaddon", "11/11/2001"));
        playerList.add(new Player("42291-693", "Mal Kloisner", "15/12/2001"));
        playerList.add(new Player("58468-0160", "Adiana Showte", "08/09/2001"));
        playerList.add(new Player("51824-037", "Gerick Vittle", "21/10/2001"));
        playerList.add(new Player("14783-450", "Paten Andri", "12/07/2001"));
        playerList.add(new Player("63739-691", "Batsheva Playdon", "16/06/2001"));
        playerList.add(new Player("52544-189", "Olimpia McMillam", "26/11/2001"));
        playerList.add(new Player("43857-0172", "Rancell Kentwell", "27/12/2001"));
        playerList.add(new Player("25021-803", "Kanya Case", "13/02/1998"));
        playerList.add(new Player("66993-024", "Leslie Capehorn", "28/01/1998"));
        playerList.add(new Player("55154-4558", "Lena Glen", "23/08/2001"));
        playerList.add(new Player("49349-903", "Licha Gligori", "11/05/1998"));
        playerList.add(new Player("0409-0805", "Marja Malamore", "17/07/2001"));
        playerList.add(new Player("55154-1483", "Almeria Creamer", "08/08/2001"));
        playerList.add(new Player("36987-2214", "Fania MacConnel", "17/10/2001"));
        playerList.add(new Player("55111-180", "Katine Huard", "07/09/2001"));
        playerList.add(new Player("0049-5460", "Marlie Moughton", "06/02/1998"));
        playerList.add(new Player("51801-014", "Lilian Hodgin", "27/09/2001"));
        playerList.add(new Player("36800-498", "Asher Piatkow", "08/07/2001"));
        playerList.add(new Player("0002-7623", "Arleyne Levane", "24/11/2001"));
        playerList.add(new Player("23155-149", "Patience Marcussen", "03/04/1998"));
        playerList.add(new Player("13630-0008", "Neala Harkins", "25/06/2001"));
        playerList.add(new Player("43857-0205", "Vincent Hemerijk", "06/04/1998"));
        playerList.add(new Player("54575-908", "Emmott Naris", "11/10/2001"));
        playerList.add(new Player("60899-040", "Alexia Stroobant", "05/03/1998"));
        playerList.add(new Player("62011-0112", "Corbett Tweedie", "13/09/2001"));
        playerList.add(new Player("49999-908", "Sybil Hughman", "12/10/2001"));
        playerList.add(new Player("42254-335", "Helen Buckell", "19/07/2001"));
        playerList.add(new Player("59088-114", "Rosaline O\"\"Kerin", "23/06/2001"));
        playerList.add(new Player("68428-076", "Malissa Windridge", "22/07/2001"));
        playerList.add(new Player("68382-354", "Vidovic Bulteel", "29/09/2001"));
        playerList.add(new Player("63824-462", "Gerome Beedham", "04/01/1998"));
        playerList.add(new Player("27281-001", "Cristina Basillon", "14/10/2001"));
        playerList.add(new Player("50804-230", "Maddie Hards", "24/10/2001"));
        playerList.add(new Player("55289-393", "Shaylah Metzig", "05/02/1998"));
        playerList.add(new Player("63629-5052", "Elianore Bruhnicke", "08/08/2001"));
        playerList.add(new Player("68391-267", "Rudy Packwood", "11/08/2001"));
        playerList.add(new Player("43857-0100", "Fianna Beynke", "30/04/1998"));
        playerList.add(new Player("45802-050", "Maisey Campsall", "28/07/2001"));
        playerList.add(new Player("43386-551", "Cad Sproston", "03/04/1998"));
        playerList.add(new Player("21695-988", "Selina Izzat", "25/02/1998"));
        playerList.add(new Player("55289-257", "Jody Duffree", "18/02/1998"));
        playerList.add(new Player("60760-410", "Orbadiah Babonau", "11/05/1998"));
        playerList.add(new Player("36987-2890", "Kelcey Jorat", "06/04/1998"));
        playerList.add(new Player("68016-111", "Grove Sainsberry", "16/08/2001"));
        playerList.add(new Player("65517-0001", "Beryl Switsur", "14/04/1998"));
        playerList.add(new Player("52244-429", "Meriel Harlock", "14/08/2001"));
        playerList.add(new Player("68428-725", "Maggee Songhurst", "24/02/1998"));
        playerList.add(new Player("0069-2180", "Elvin Paddick", "28/10/2001"));
        playerList.add(new Player("68428-078", "Karly Hannaway", "21/11/2001"));
        playerList.add(new Player("0310-0132", "Pavel Olifard", "20/06/2001"));
        playerList.add(new Player("64117-205", "Anastassia Mathissen", "27/10/2001"));
        playerList.add(new Player("66949-880", "Karlis Biddlestone", "01/07/2001"));

        return playerList;
    }
}
