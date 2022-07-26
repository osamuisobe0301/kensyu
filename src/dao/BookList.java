package dao;

import java.util.ArrayList;
import java.util.List;

import dto.BookData;

public class BookList {

	public static List<BookData> bookList = new ArrayList<>();
	
	public void addBook(String name,int price) {
		bookList.add(new BookData(name,price));
	}
	
	public static List<BookData> getAllBook() {
		return bookList;
	}
	
}
