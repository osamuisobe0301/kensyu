package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import dao.BookList;
import dto.BookData;
import serviceImpl.InputService;
import serviceImpl.OutputService;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputService input = new InputService();
		OutputService output = new OutputService();
		
		try {
			while(true) {
				System.out.println("機能を選択してください。　0:入力モード　1:出力モード 9:終了");
				String selectNum = br.readLine();
				
				if("0".equals(selectNum)) {
					input.showInput();
				}else if("1".equals(selectNum)) {
					List<BookData> allBook = BookList.getAllBook();
					output.showOutput(allBook);
				}else if("9".equals(selectNum)) {
					System.out.println("システムを終了します。");
					break;
				}else {
					System.out.println("機能選択の入力ミスです。入力しなおしてください。");
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("予期せぬエラーが発生しました。");
			e.printStackTrace();
		}

	}

}
