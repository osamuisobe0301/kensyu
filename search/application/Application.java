package search.application;
import search.summarize.SearchMain;
import constants.Constants;
import exception.InputException;

/**
 * @author T.takagi
 *
 */

/**
 * 起動クラス
 */
public class Application {

	/**
	 * メインメソッド
	 */
	public static void main(String args[]){

		try {
			//　検索機能を起動するメソッドを呼び出す
			SearchMain search = new SearchMain();
			search.start();
		}catch(InputException e) {
		}catch (Exception e){

		}
	}
}