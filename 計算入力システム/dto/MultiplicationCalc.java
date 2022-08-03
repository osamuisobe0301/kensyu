package dto;

/**
 * 掛け算を行うクラス
 * @author nakano
 *
 */
public class MultiplicationCalc implements ICalc {

	private int total;

	/**
	 * 掛け算を計算するメソッド
	 * return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		// TODO 自動生成されたメソッド・スタブ
		total = (int)(numOne * numTwo);
		return total;

	}
}
