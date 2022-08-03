package dto;

/**
 * 足し算を行うクラス
 * @author nakano
 *
 */
public class AdditionCalc implements ICalc {

	private int total;

	/**
	 * 足し算を計算するメソッド
	 * return totalを戻り値とする
	 */
	public double calc(double numOne, double numTwo) {
		total = (int)(numOne + numTwo);
		return total;

	}
}
