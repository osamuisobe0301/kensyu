package serviceImpl;

import java.util.List;

import dto.BookData;

public class OutputService {

	public void showOutput(List<BookData> bookList) {
		
		System.out.println("=========================");
		System.out.println("■購入本一覧");
		
		int i = 1;
		for(BookData book : bookList) {
			System.out.println(i + "冊目");
			System.out.println("名前：" + book.getBookName());
			System.out.println("価格:" + book.getBookPrice());
			System.out.println("=========================");
			i++;
		}
		
	}
	
	
}
