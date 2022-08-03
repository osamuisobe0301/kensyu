package dto;

/**
 * 賞与計算を行うクラス
 * @author nakano
 *
 */
public class BonusCalc implements ICalc {

	private int total;

	/**
	 * 賞与計算を計算するメソッド
	 * return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		// TODO 自動生成されたメソッド・スタブ
		total = (int) (numOne * 2 * (numTwo / 6));
		return total;
		
	}
}
