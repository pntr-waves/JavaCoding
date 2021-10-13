package truong.exercise1000.e828.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import truong.exercise1000.e828.model.Book;

public class E828Service {
	public List<Book> getListBookHasOldestPublishDate(List<Book> listBook) {
		List<Book> listOldestBook = new ArrayList<>();
		int oldest = this.getOldesPublishDateInList(listBook);

		for (Book book : listBook) {
			if (book.getPublishDate() == oldest) {
				listOldestBook.add(book);
			}
		}

		return listOldestBook;

	}

	public int getOldesPublishDateInList(List<Book> listBook) {
		int oldest = listBook.get(0).getPublishDate();

		for (Book book : listBook) {
			if (oldest > book.getPublishDate()) {
				oldest = book.getPublishDate();
			}
		}

		return oldest;
	}

	public int getPublishDateOwnedMostBook(List<Book> listBook) {
		Map<Integer, Integer> mapPublishDate = new HashMap<>();
		for (Book book : listBook) {
			if (mapPublishDate.containsKey(book.getPublishDate())) {
				int count = mapPublishDate.get(book.getPublishDate());
				mapPublishDate.put(book.getPublishDate(), count + 1);
			} else {
				mapPublishDate.put(book.getPublishDate(), 1);
			}
		}

		Set<Integer> keyPublishDate = mapPublishDate.keySet();

		int countBook = 0;
		int year = 0;

		Iterator<Integer> itPublishDate = keyPublishDate.iterator();
		while (itPublishDate.hasNext()) {
			int key = itPublishDate.next();
			if(mapPublishDate.get(key) > countBook) {
				countBook = mapPublishDate.get(key);
				year = key;
			}
		}
		return year;
	}

	public List<Book> getListMostBookHasSamePublishDate(List<Book> listBook) {
		List<Book> listMostBook = new ArrayList<>();
		int year = this.getPublishDateOwnedMostBook(listBook);
		System.out.println(year);
		for (Book book : listBook) {
			if (book.getPublishDate() == year) {
				listMostBook.add(book);
			}
		}

		return listMostBook;
	}

	public void printListBook(List<Book> listBook) {
		for (Book book : listBook) {
			System.out.println(String.format("Book: %s, Author: %s, year: %d", book.getBookName(), book.getAuthorName(),
					book.getPublishDate()));
		}
	}
}
