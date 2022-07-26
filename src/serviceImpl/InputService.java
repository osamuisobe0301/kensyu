package serviceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.BookList;

public class InputService {

	BookList bookList = new BookList();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void showInput() throws IOException, NumberFormatException {

		boolean continueFlag = true;
		while (continueFlag) {
			System.out.println("≪入力システム≫　\n入力開始：0、入力終了：9\n=========================");

			try {
				String continueNum = br.readLine();
				if ("0".equals(continueNum)) {

					System.out.println("購入した本の名前を入力してください。");
					String bookName = br.readLine();

					System.out.println("購入した本の価格を入力してください。");
					String bookPriceStr = br.readLine();

					if ("".equals(bookName) || "".equals(bookPriceStr)) {
						System.out.println("空です。正しく値を入力してください。");
						throw new Exception();
					}

					int bookPrice = Integer.parseInt(bookPriceStr);

					bookList.addBook(bookName, bookPrice);

				} else if ("9".equals(continueNum)) {
					System.out.println("データ入力を終了します。");
					continueFlag = false;
				} else if ("".equals(continueNum)) {
					System.out.println("値を入力してください。");
				} else {
					System.out.println("機能選択のミスです。入力しなおしてください。");
				}

			} catch (NumberFormatException e) {
				System.out.println("数値を入力してください。再度やりなおしてください。");
			} catch (Exception e) {
				System.out.println("入力し直してください。");
			}
			System.out.println("=========================");
		}
	}

}
