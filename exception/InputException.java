package exception;

/**
 * インプット対する例外のクラス
 */
public class InputException extends Exception{
	private static final long serialVersionUID = 1L;
	public InputException(String msg){
		super(msg);
	}
}
