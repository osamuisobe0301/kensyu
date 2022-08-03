package controller;

import java.io.IOException;

//メインクラス
/**
 * @author nakano
 *
 */
public class Main {
	/**
	 * メインメソッド
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		CalculatorSelect calc = new CalculatorSelect();
		calc.calculatorMethod();
	}
}
