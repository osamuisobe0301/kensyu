package table;


import java.util.Arrays;
import java.util.List;

import dao.Shain;


/**
 *　@author t.takagi
 */

/**
 *　社員情報を管理するクラス
 */
public class ShainTable {


	/**
	 *　社員情報リストを渡す
	 * @return shainList 社員リスト
	 */
	public List<Shain> ReturnShainList(){
		
		//社員情報リストを初期化
		List<Shain> shainList = Arrays.asList(
				
		//社員情報を初期化
		new Shain("001", "佐藤", "1"),
		new Shain("002", "山田", "2"),
		new Shain("003", "工藤", "3"));
		
		return shainList;
	}

}
