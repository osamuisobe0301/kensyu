package tools;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import constants.Constants.ProgressionMessage;
import exception.InputException;
import validation.ValidationCheck;


/**
 * @author t.takagi
 * 検索したいメニュー番号を入力する
 * 1.会社IDで検索する　2.役職IDで検索する　3.社員情報を全出力する
 */
public class InputMenuTool{
	
	String menuNumber;

	/**
	 * メニュー番号を入力する
	 * @return menuNumber 入力したメニュー番号
	 */
	public String inputMenu() throws IOException{
		
		//入力値が適切か真偽を定義する
		boolean check = true;
		
		//適切なメニュー番号が入力されるまで入力を繰り返す
		while(check) {
			
			//メニュー番号入力の指示を画面に出力する
			System.out.println(ProgressionMessage.MENU_NUMBER_INPUT.getMessage());

			//検索したメニュー番号を入力する
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputMenu = br.readLine();
			menuNumber = inputMenu;

			//入力されたメニュー番号が１、２、3かチェックする
			try {
				
				//入力値チェック機能呼び出し実行
				ValidationCheck validationCheck = new ValidationCheck();
				validationCheck.checkMenuNumber(inputMenu);
				check = false;
				
			} catch(InputException e) {
				
				//適切でない場合エラーメッセージを画面に出力する
				System.out.println(e.getMessage());
				check = true;
			}
		}
		return menuNumber;
	}
}