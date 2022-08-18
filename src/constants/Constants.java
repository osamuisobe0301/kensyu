package constants;

import java.text.MessageFormat;

/**
 * コンスタンツクラス
 */
public class Constants {
	
	/**
	 * メッセージの定数
	 */
	public enum Message{

		//タイトル
		MESSAGE_TITLE("【受験合格判定システム】\n"),
		
		//メニューメッセージ
		MESSAGE_MENU01("メニューを選択してください\n1:登録 2:照会　3:削除\n"),
		MESSAGE_MENU02("プログラム終了しますか？\n【終了】:endと入力する　【メニュー】:エンターキーを押してください\n"),
		MESSAGE_MENU03("メニューを選択してください\n1:登録 2:照会　3:削除\n"),
		MESSAGE_MENU04("システムを終了します\n"),
		
		//高校名のコメント
		MESSAGE_SCHOOL_NAME01("【中央高校】\n"),
		MESSAGE_SCHOOL_NAME02("【西高校】\n"),

		//インプット時のコメント
		MESSAGE_INPUT00("受験IDを入力してください\n"),
		MESSAGE_INPUT01("名前を入力してください\n"),
		MESSAGE_INPUT02("受験高校を選択してください\n"),
		MESSAGE_INPUT03("国語の点数を入力してください\n"),
		MESSAGE_INPUT04("英語の点数を入力してください\n"),
		MESSAGE_INPUT05("数学の点数を入力してください\n"),
		
		//照会メッセージ
		MESSAGE_INQUIRY01("1:ID検索　2:全出力\n"),
		MESSAGE_INQUIRY02("受験する学校IDを入力して下さい\n1:中央高校　2:西高校\n"),
		MESSAGE_INQUIRY03("生徒IDを入力してください\n"),
		MESSAGE_INQUIRY04("該当する生徒IDがありません\n"),
		
		//削除メッセージ
		MESSAGE_DELETE01("削除が完了しました\n"),

		

		//インプット時の進行コメント
		MESSAGE_PROGRESS01("生徒の入力を継続しますか？\n【終了】:endと入力　【入力】:エンターキーを押してください\n"),
		MESSAGE_PROGRESS03(""),
		MESSAGE_PROGRESS04("このメニューを終了します\n"),
		MESSAGE_PROGRESS05("入力を終了します\n"),
		MESSAGE_PROGRESS06("入力を継続します\n"),

		//アウトプット時の進行コメント
		MESSAGE_OUTPUT01("名前："),
		MESSAGE_OUTPUT02("合計点："),
		MESSAGE_OUTPUT03("合否："),

		//インプット時のエラーメッセージ
		MESSAGE_ERROR01("\"正しい入力をしてください\"\n"),
		MESSAGE_ERROR02("その受験者IDは存在していません\n"),
		MESSAGE_ERROR03("正しいメニュー番号を入力してください\n\n"),
		MESSAGE_ERROR04("桁数オーバーです"),
		MESSAGE_ERROR05("a"),
		MESSAGE_ERROR06("a");

		private String message;
		
		private Message(String message) {
			this.message = message;
		}
		private String getMessage() {
			return message;
		}
		public void showMessaage() {
			System.out.println(this.getMessage());
		}
		public void showMessage(Object... argments) {
			System.out.print(MessageFormat.format(this.getMessage(), argments));
		}
	}
	
	/**
	 * 合格点の定数
	 */
	public enum PassScore{

		//合格点
		CENTRALSCHOOL01_TOTAL_PASSSCORE(230),
		WESTSCHOOL02_TOTAL_PASSSCORE(250),
		WESTSCHOOL02_ENGLISH_PASSSCORE(80);

		private int passScore;

		PassScore(int passScore) {
			this.passScore = passScore;
		}
		
		private int getPassScore() {
			return passScore;
		}
		
		public int showMessage() {
			return getPassScore();
		}
	}
}
