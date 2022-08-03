package service;

import dto.ICalc;

/**
 * 賞与計算を行うクラス
 * 
 * @author nakano
 *
 */
public class BonusCalcimpl implements ICalc {

	private int total; // 計算の合計値

	/**
	 * 賞与計算を計算するメソッド return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		total = (int) (numOne * 2 * (numTwo / 6));
		return total;
	}
	
}
