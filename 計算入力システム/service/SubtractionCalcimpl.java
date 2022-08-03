package service;

import dto.ICalc;

/**
 * 引き算を行うクラス
 * 
 * @author nakano
 *
 */
public class SubtractionCalcimpl implements ICalc {

	private int total; // 計算の合計値

	/**
	 * 引き算を計算するメソッド return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		total = (int) (numOne - numTwo);
		return total;
	}
	
}
