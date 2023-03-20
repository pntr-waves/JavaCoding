//Viết chương trình thực hiện các yêu cầu sau:
//a. Khai báo cấu trúc dữ liệu của một danh sách liên kết đơn các quyển
//sách. Biết rằng thông tin của một quyển sách bao gồm: tên sách (50
//ký tự), tên tác giả (30 ký tự) và năm xuất bản.
//b. Cài đặt tất cả các thao tác cơ bản cho danh sách liên kết các quyển
//sách.
//c. Tìm quyển sách cũ nhất trong danh sách liên kết.
//d. Tìm một năm có nhiều sách xuất bản nhất và liệt kê tất cả các quyển
//sách xuất bản trong năm đó.

package truong.e1000.bookmanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import truong.e1000.bookmanagement.data.DataTestingBuilder;
import truong.e1000.bookmanagement.model.Book;

public class ManageBookService {
    long getOldestPublicationYear (List<Book> bookList) {
        sortByPublicationYear(bookList, 0, bookList.size() - 1);        
        return bookList.get(0).getPublicationYear();
    }
    
    public List<Book> getListOldestPublicationYearBook () {
        List<Book> bookList = DataTestingBuilder.getBookList();
        long oldestPublicationYear = getOldestPublicationYear(bookList);
        List<Book> result = getListBookByPublicationYear(oldestPublicationYear);
       
        return result;
    }
    
    public List<Book> getListBookByPublicationYear (long publicationYear) {
        List<Book> bookList = DataTestingBuilder.getBookList();
        List<Book> result = new ArrayList<>();
        
        for (Book book : bookList) {
            if (book.getPublicationYear() == publicationYear) {
                result.add(book);
            }
        }
        return result;
    }
    
    Map<Long, Integer> countBooksByPublicationYear () {
        Map<Long, Integer> bookCounter = new HashMap<>();
        List<Book> bookList = DataTestingBuilder.getBookList();
        
        for (Book book : bookList) {
            if (bookCounter.containsKey(book.getPublicationYear())) {
                int count = bookCounter.get(book.getPublicationYear());                
                bookCounter.replace(book.getPublicationYear(), count + 1);
            } else {
                bookCounter.put(book.getPublicationYear(), 1);
            }
        }
        return bookCounter; 
    }
    
    public List<Long> getYearsWithMostBookPublished () {
        Map<Long, Integer> bookCount = countBooksByPublicationYear();
        List<Long> rs = new ArrayList<Long>();
        long max = 0;
        
        for (Map.Entry<Long, Integer> entry : bookCount.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        
        for (Map.Entry<Long, Integer> entry : bookCount.entrySet()) {
            if (entry.getValue() == max) {
                rs.add(entry.getKey());
            }
        }
        
        return rs;
    }
        
    public void printBookList (List<Book> bookList) {
        System.out.println("\nList of Book");
        for (Book book : bookList) {
            System.out.println("------------------------------------------------");
            System.out.println(String.format("Book Name: %s", book.getBookName()));
            System.out.println(String.format("Author Name: %s", book.getAuthorName()));
            System.out.println(String.format("Publication Year: %d", book.getPublicationYear()));

        }
    }
    
    void sortByPublicationYear (List<Book> bookList, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            sortByPublicationYear(bookList, left, mid);
            sortByPublicationYear(bookList, mid + 1, right);
            
            mergeByPublicationYear(bookList, left, mid, right);
        }
    }
    
    void mergeByPublicationYear (List<Book> bookList, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        List<Book> lArr = new ArrayList<>();
        List<Book> rArr = new ArrayList<>();
        
        for (int i = 0; i < n1; i++) {
            lArr.add(bookList.get(left + i));
        }
        
        for (int i = 0; i < n2; i++) {
            rArr.add(bookList.get(mid + 1 + i));
        }
        
        int i, j;
        i = j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (lArr.get(i).getPublicationYear() < rArr.get(j).getPublicationYear()) {
                bookList.set(k, lArr.get(i));
                i++;
            } else {
                bookList.set(k, rArr.get(j));
                j++;
            }
            
            k++;
        }
        
        while (i < n1) {
            bookList.set(k, lArr.get(i));
            i++;
            k++;
        }
        
        while (j < n2) {
            bookList.set(j, rArr.get(j));
            j++;
            k++;
        }
    }
    
}
