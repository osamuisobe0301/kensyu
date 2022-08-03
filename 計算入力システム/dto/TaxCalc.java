package dto;

/**
 * 税込み計算を行うクラス
 * @author nakano
 *
 */
public class TaxCalc implements ICalc {

	private int total;

	/**
	 * 税込み計算を計算するメソッド
	 * return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		// TODO 自動生成されたメソッド・スタブ
		total = (int) (numOne + ((numOne * numTwo) / 100));
		return total;

	}
}
