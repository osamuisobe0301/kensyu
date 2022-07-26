package dto;

public class BookData {
	
	String bookName;
	int bookPrice;
	
	public BookData(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

}
