//831. Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các mặt
//hàng (MATHANG). Biết rằng một mặt hàng gồm những thành
//phần như sau:
//- Tên mặt hàng: chuỗi tối đa 20 ký tự.
//- �?ơn giá: kiểu số nguyên 4 byte.
//- Số lượng tồn: kiểu số nguyên 4 byte.
//b. Nhập danh sách.
//c. Xuất danh sách.
//d. Tìm mặt hàng có tổng giá trị tồn là lớn nhất.
//e. �?ếm số lượng mặt hàng có số lượng tồn lớn hơn 1.000

package truong.e1000.productmanagement.data;

import java.util.ArrayList;
import java.util.List;

import truong.e1000.productmanagement.model.Product;

public class ProductDataTestingBuilder {
    public static List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Table Cloth 144x90 White", 45.88, 4224));
        productList.add(new Product("Pasta - Spaghetti, Dry", 34.43, 7637));
        productList.add(new Product("Onions - Vidalia", 77.67, 7468));
        productList.add(new Product("Canada Dry", 6.94, 3893));
        productList.add(new Product("Sloe Gin - Mcguinness", 98.75, 4560));
        productList.add(new Product("Juice - Happy Planet", 6.26, 2466));
        productList.add(new Product("Soho Lychee Liqueur", 94.57, 9235));
        productList.add(new Product("Nut - Chestnuts, Whole", 77.67, 2960));
        productList.add(new Product("Sauce Tomato Pouch", 78.98, 7915));
        productList.add(new Product("Nougat - Paste / Cream", 95.16, 1913));
        productList.add(new Product("Iced Tea Concentrate", 34.24, 1119));
        productList.add(new Product("Gooseberry", 73.74, 6818));
        productList.add(new Product("Stainless Steel Cleaner Vision", 15.4, 7540));
        productList.add(new Product("Olives - Morracan Dired", 83.03, 2850));
        productList.add(new Product("Chicken - Breast, 5 - 7 Oz", 99.49, 2729));
        productList.add(new Product("Beer - Sleemans Cream Ale", 23.43, 8490));
        productList.add(new Product("Mushroom - Morels, Dry", 69.03, 3680));
        productList.add(new Product("Wood Chips - Regular", 93.27, 1224));
        productList.add(new Product("Beer - Mill St Organic", 26.0, 9028));
        productList.add(new Product("Calypso - Black Cherry Lemonade", 2.16, 4260));
        productList.add(new Product("Orange - Tangerine", 84.11, 9640));
        productList.add(new Product("Wine - White Cab Sauv.on", 12.69, 2596));
        productList.add(new Product("Lettuce - Romaine", 57.94, 8556));
        productList.add(new Product("Appetizer - Tarragon Chicken", 58.73, 8840));
        productList.add(new Product("Turkey - Breast, Smoked", 15.55, 6198));
        productList.add(new Product("Bread - Rosemary Focaccia", 61.74, 4650));
        productList.add(new Product("Water - Spring Water 500ml", 15.96, 4250));
        productList.add(new Product("Tart Shells - Savory, 2", 91.8, 2710));
        productList.add(new Product("Chef Hat 25cm", 81.16, 6796));
        productList.add(new Product("Wine - Red, Wolf Blass, Yellow", 78.49, 3113));
        productList.add(new Product("Coconut - Creamed, Pure", 85.47, 8975));
        productList.add(new Product("Buttons", 33.51, 2600));
        productList.add(new Product("Crackers - Melba Toast", 77.37, 2125));
        productList.add(new Product("Eel - Smoked", 39.61, 6334));
        productList.add(new Product("Pepper - Green Thai", 83.59, 6592));
        productList.add(new Product("Island Oasis - Banana Daiquiri", 20.16, 3852));
        productList.add(new Product("Contreau", 20.3, 4075));
        productList.add(new Product("Irish Cream - Baileys", 11.22, 8310));
        productList.add(new Product("Egg - Salad Premix", 51.6, 2898));
        productList.add(new Product("Muffin Hinge Container 6", 67.88, 8463));
        productList.add(new Product("Chips Potato All Dressed - 43g", 11.86, 6617));
        productList.add(new Product("Soup - Beef, Base Mix", 14.44, 8285));
        productList.add(new Product("Flour - Bran, Red", 71.62, 9323));
        productList.add(new Product("Apples - Spartan", 13.19, 3470));
        productList.add(new Product("Carbonated Water - Lemon Lime", 38.18, 4819));
        productList.add(new Product("Cardamon Ground", 3.76, 6884));
        productList.add(new Product("Beans - Black Bean, Dry", 46.71, 3870));
        productList.add(new Product("Cheese - Brie, Triple Creme", 39.05, 4865));
        productList.add(new Product("Carbonated Water - Blackberry", 20.01, 5910));
        productList.add(new Product("Oil - Hazelnut", 99.17, 3082));
        productList.add(new Product("Arizona - Green Tea", 97.41, 8403));
        productList.add(new Product("Truffle Shells - Semi - Sweet", 35.17, 6959));
        productList.add(new Product("Flour Dark Rye", 13.02, 1928));
        productList.add(new Product("Compound - Pear", 86.05, 5262));
        productList.add(new Product("Uniform Linen Charge", 34.86, 9623));
        productList.add(new Product("Soup V8 Roasted Red Pepper", 59.82, 5019));

        return productList;
    }
}
