package constants;

/**
*
* FunctionData 機能データクラス
* @author nakama
*
*/
public enum FunctionData{

	SHAIN_SEARCH("1","社員情報検索システム(社員ID)"),
	YAKUSHOKU_SEARCH("2","社員情報検索システム(役職ID)"),
	CALC_SALARY("3","給与計算システム"),
    END("99","システム終了");

	
	//機能番号
	private String functionNum;
    
    //機能名
	private String functionName;
	
	private FunctionData(String functionNum,String functionName){
	
		this.functionNum = functionNum;
		this.functionName = functionName;
	
	}

	public String getFunctionNum(){
	
		return this.functionNum = functionNum;
	
	}
	
	public String getFunctionName(){
	
		return this.functionName = functionName;
	
	}
}