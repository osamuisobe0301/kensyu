package service;

import dto.ICalc;

/**
 * 税込み計算を行うクラス
 * 
 * @author nakano
 *
 */
public class TaxCalcimpl implements ICalc {

	private int total; // 計算の合計値

	/**
	 * 税込み計算を計算するメソッド return totalを戻り値とする
	 */
	@Override
	public double calc(double numOne, double numTwo) {
		total = (int) (numOne + ((numOne * numTwo) / 100));
		return total;
	}
	
}
