package service;

import dto.ICalc;

/**
 * 割り算を行うクラス
 * 
 * @author nakano
 *
 */
public class DivisionCalcimpl implements ICalc {

	private int total; // 計算の合計値

	/**
	 * 割り算を計算するメソッド return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		total = (int) (numOne / numTwo);
		return total;
	}
	
}
