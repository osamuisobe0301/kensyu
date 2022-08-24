package search_factory;
import java.util.Map;

import search.Search;
import searchImpl.AllOutput;
import searchImpl.SearchCompanyId;
import searchImpl.SearchPostId;

import java.util.HashMap;

/**
 * @author t,takagi 
 * 検索機能を入力された番号に基づいて呼び出す
 */
public class SearchFactory{
    
    Map<String,Search> SearchMap = new HashMap<>();
    
    /**
     * 各検索機能にメニュー番号を割り当て初期化する
     */
    public SearchFactory(){
    	
    	//各検索機能にメニュー番号を割り当てる
        SearchMap.put("1", new SearchCompanyId());
        SearchMap.put("2", new SearchPostId());
        SearchMap.put("3", new AllOutput());
    }
    
    /**
     * 入力されたメニュー番号に基づいた検索機能を返す
     * @param choiseMenu 選択した検索機能のメニュー番号
     * @return Service 選択された検索機能
     */
    public Search create(String choiseMenu){
        return SearchMap.get(choiseMenu);
    }
}