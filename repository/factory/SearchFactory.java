package repository.factory;

import java.util.HashMap;
import java.util.Map;

import repository.dto.Search;
import search.parts.AllOutput;
import search.parts.IdSearch;
import search.parts.PostSearch;

/**
 *　検索機能を生成し返すクラス
 */
public class SearchFactory {

	/**処理区分のマップを渡すメソッド
	 * @param 処理区分
	 * @return 検索機能
	 */
	public static Search createService(String shoriKubun){
		//マップを生成
		Map<String, Search> searchMap = new HashMap<>();
		searchMap.put("0", new IdSearch());
		searchMap.put("1", new PostSearch());
		searchMap.put("2", new AllOutput());
		
		//受け取った処理区分に該当する検索機能を返す
		return searchMap.get(shoriKubun);
	}
}
