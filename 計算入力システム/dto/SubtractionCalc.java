package dto;

/**
 * 引き算を行うクラス
 * @author nakano
 *
 */
public class SubtractionCalc implements ICalc {

	private int total;

	/**
	 * 引き算を計算するメソッド
	 * return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		// TODO 自動生成されたメソッド・スタブ
		total = (int) (numOne - numTwo);
		return total;

	}
}
