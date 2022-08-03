package service;

import dto.ICalc;

/**
 * 掛け算を行うクラス
 * 
 * @author nakano
 *
 */
public class MultiplicationCalcimpl implements ICalc {

	private int total; // 計算の合計値

	/**
	 * 掛け算を計算するメソッド return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		total = (int) (numOne * numTwo);
		return total;
	}
	
}
