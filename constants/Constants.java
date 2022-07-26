package constants;

import java.text.MessageFormat;

/**
 * メッセージを管理するクラス
 */
public class Constants {
	public enum Message {
		
	//社員情報出力
	MESSAGE_SHAIN01("社員名:"),
	MESSAGE_SHAIN02("役職:"),
	MESSAGE_SHAIN03("基本給:"),
	MESSAGE_SHAIN04("ボーナス:"),
	
	//レイアウト
	MESSAGE_LINE01("------------------------------------------------\n"),
	
	//最終処理出力
	MESSAGE_END01("終了する場合endと入力してください\n継続する場合はエンターキーを入力してください"),
	
	//処理区分出力
	MESSAGE_SHORIKUBUN01("処理区分を選択してください\n0:ID検索出力　1:役職出力 2:全出力"),
	MESSAGE_SHORIKUBUN03("社員IDを入力してください"),
	MESSAGE_SHORIKUBUN04("役職IDを入力してください\n01:一般　02:主任 03:係長"),

	//エラーメッセージ出力
	MESSAGE_ERROR01("正しい入力をしてください");
	

	private Message(String message) {
		this.message = message;
	}
	private String message;

	public String getMessage() {
		return message;
	}
	
	/**
	 * メッセージを出力するメソッド
	 */
	public void showMessage(Object... argments) {
		System.out.print(MessageFormat.format(this.getMessage(), argments));
	}
	}
}
