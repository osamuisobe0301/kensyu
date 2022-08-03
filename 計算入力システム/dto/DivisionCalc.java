package dto;

/**
 * 割り算を行うクラス
 * @author nakano
 *
 */
public class DivisionCalc implements ICalc {

	private int total;

	/**
	 * 割り算を計算するメソッド
	 * return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		// TODO 自動生成されたメソッド・スタブ
		total = (int) (numOne / numTwo);
		return total;

	}
}
