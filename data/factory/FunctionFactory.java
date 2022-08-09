package data.factory;

/**
*
*FunctionFactory 機能クラスのファクトリー
*@author nakama
*
*/

import service.FunctionAll;
import service.serviceImpl.SearchShainId;
import service.serviceImpl.SearchYakushokuId;
import service.serviceImpl.CalcSalary;

import java.util.Map;
import java.util.HashMap;

public class FunctionFactory{

	public static final FunctionAll create(String key){
	
		Map<String,FunctionAll> functionMap = new HashMap<>();
	    functionMap.put("1",new SearchShainId());
	    functionMap.put("2",new SearchYakushokuId());
	    functionMap.put("3",new CalcSalary());
	
	    return functionMap.get(key);
	}

}