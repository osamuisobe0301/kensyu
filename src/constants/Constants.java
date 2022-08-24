package constants;

/**
 * @author t.takagi
 * 定数を設定する
 */
public class Constants {
	
	/**
	 * システムの進行メッセージを定義する
	 */
	public enum MESSAGE{
		
		//進行メッセージの定数を設定する
		MENU_NUMBER_INPUT("メニュー番号を入力してください\n 1.会社IDで検索する　2.役職IDで検索する　3.社員情報を全出力する"),
		COMPANY_ID_INPUT("会社IDを入力してください"),
		POST_ID_INPUT("役職IDを入力してください");
		
		private String message;
		
		/**
		 * 進行メッセージを初期化する
		 * @param message
		 */
		private MESSAGE(String message){
			this.message = message;
		}
		
		/**
		 * 進行メッセージを取得する
		 * @return message 進行メッセージ
		 */
		public String getMessage() {
			return this.message;
		}
	}
}
