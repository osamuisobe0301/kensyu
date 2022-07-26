package repository.dto;

import java.io.IOException;
import java.util.List;
import exception.InputException;

/**検索機能のインターフェース
 */
public interface Search {
	
	/**
	 * 処理区分によって社員情報を出力するメソッド
	 * @param　社員リスト
	 */
	void search(List<Shain> shainList)throws IOException, InputException;
}
