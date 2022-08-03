package service;

import dto.ICalc;

/**
 * 足し算を行うクラス
 * 
 * @author nakano
 *
 */
public class AdditionCalcimpl implements ICalc {

	private int total; // 計算の合計値

	/**
	 * 足し算を計算するメソッド return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		total = (int) (numOne + numTwo);
		return total;
	}
	
}
