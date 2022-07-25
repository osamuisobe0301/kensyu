package exception;
/**
 * インプット対する例外のクラス
 */
public class InputError extends Exception{
	private static final long serialVersionUID = 1L;
	InputError(String msg){
		super(msg);
	}
	public InputError() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
