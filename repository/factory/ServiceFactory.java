package repository.factory;

import java.util.HashMap;
import java.util.Map;

import repository.dto.Search;
import search.parts.AllOutput;
import search.parts.IdSearch;
import search.parts.PostSearch;

public class ServiceFactory {
	static Map<String, Search> searchMap = new HashMap<>();
	/**処理区分をマップに格納するメソッド
	 */
	public void ShoriKubunMapCreate(){
	searchMap.put("0", new IdSearch());
	searchMap.put("1", new PostSearch());
	searchMap.put("2", new AllOutput());
	}
	/**処理区分のマップを渡すメソッド
	 * @param 入力された処理区分を引数で渡す 
	 * @return 処理区分をキーにして値の検索機能を返す
	 */
	public static Search createServiceReturn(String shoriKubun){
		return searchMap.get(shoriKubun);
	}
}
