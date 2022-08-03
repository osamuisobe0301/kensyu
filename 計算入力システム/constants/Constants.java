package constants;

import java.text.MessageFormat;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * メッセージを編集するクラス
 * @author nakano
 *
 */
public class Constants {
	
	/**
	 * enumでメッセージをひとまとめにする
	 * @author nakano
	 *
	 */
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public enum Message {
		Message_01("計算方法を選んでください。\n\n1:足し算\n2:引き算\n3:掛け算\n4:割り算\n5:税込み計算\n6:賞与計算\n0:処理の終了"), 
		Message_NUMBER_ONE("1つ目の値を入力してください。"),
		Message_NUMBER_TWO("2つ目の値を入力してください。"),
		LINE("---------------------------------------------"),
		Message_CALC("計算結果は「{0}」です。"),
		Message_END("処理を終了します。"),
		Message_ERROR("正しい数を入力してください。"),
		Message_03("税抜きの値を入力してください。\n{0}\n基本給を入力してください。{1}");
		@Getter
		private String message;

		/**
		 * メッセージを表示するメソッド
		 * @param argments
		 */
		public void show(Object... argments) {
			System.out.println(MessageFormat.format(this.getMessage(), argments));
			
		}
	}
}
