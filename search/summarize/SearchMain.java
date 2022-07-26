package search.summarize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;
import repository.factory.EmpFactory;
import repository.factory.SearchFactory;

/**
 * @author t.takagi
 *
 */

/**
 *　検索をスタートするクラス
 */
public class SearchMain {
	
	/**
	 *　検索をスタートするメソッド
	 */
	public void start() throws IOException, InputException {
	Constants.Message.MESSAGE_SHORIKUBUN01.showMessage();
	
	
	// 処理区分を入力させる
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String shoriKubun = br.readLine();
	
	// 処理区分によって検索機能を呼び出す
	Search search = SearchFactory.createService(shoriKubun);
	
	// 社員ファクトリーを生成し、社員リストを戻す
	EmpFactory empFactory = new EmpFactory();
	List<Shain> shainList = empFactory.createListReturn();
	
	
	// 呼び出された検索機能の検索するメソッド
	search.search(shainList);
	}
}
