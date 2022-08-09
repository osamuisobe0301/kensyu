package constants;
/**
*
*ErrorMessage エラーメッセージのデータクラス
*@author nakama
*
*/
public enum ErrorMessage{

	BLANK("値が入っていません"),
	SELECT("選択肢が誤っています"),
	NULLSHAIN("該当する社員はいません"),
	LENGTHNUM("桁数が誤っています"),
	NUMBER("数値を入力してください。"),
	YAKUSHOKU("該当する役職はありません"),
	WORKTIME("想定外の数値です");
	
	private String message;
	
	private ErrorMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
	
		return this.message;
	
	}
}