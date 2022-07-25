package controller;
import java.io.IOException;
import repository.factory.EmpFactory;
import search.summarize.SearchImpl;
import constants.Constants;
import exception.InputError;

/**
 * @author T.takagi
 *
 */

public class Controller {

	/**mainメソッド
	 * @param 使用しない
	 */
	public static void main(String args[]){
		//コンストラクタで社員リストを生成
		try {
		EmpFactory.createList();
		SearchImpl search = new SearchImpl();
		search.start();
		}catch(InputError e) {
			Constants.Message.MESSAGE_ERROR01.showMessageBreak();
		}catch (Exception f){
			Constants.Message.MESSAGE_ERROR01.showMessageBreak();
		}
	}
}