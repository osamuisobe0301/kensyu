package exception;

/**
 * @author t.takagi
 * 入力に誤りがあればエラーを発生させる
 */
public class InputException extends Exception{
	private static final long serialVersionUID = 1L;

		/**
		 * エラーごとにエラーメッセージを取得させる
		 * @param msg　エラーメッセージ
		 */
		public InputException(String msg) {
			super(msg);
		}
}
