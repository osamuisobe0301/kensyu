package controller;

import java.io.IOException;

//メインクラス
/**
 * 計算機能の起動クラス
 * 
 * @author nakano
 *
 */
public class Main {
	/**
	 * メインメソッド
	 * 
	 * @param args 実行時引数
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 計算を行う
		CalculatorSelect calc = new CalculatorSelect();
		calc.calculatorMethod();
	}
}
