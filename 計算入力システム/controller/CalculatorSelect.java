package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import constants.Constants.Message;
import dto.ICalc;
import factory.CalcFactry;

/**
 * 計算方法を決めるクラス
 * @author nakano
 *
 */
public class CalculatorSelect {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 計算方法を選択するメソッド
	 * 
	 * @throws IOException
	 */
	public void calculatorMethod() throws IOException {

		// 処理の終了が選択されるまで、計算を行う
		while (true) {

			// 計算方法を選択する
			Message.Message_01.show();
			Message.LINE.show();
			String str = br.readLine();
			try {
				int calcNum = Integer.parseInt(str);

				// 7以上が選択された場合
				if (calcNum >= 7) {
					Message.Message_ERROR.show();
					Message.LINE.show();
					continue;
				}

				// 0が選択された場合終了する
				else if (calcNum == 0) {
					Message.Message_END.show();
					break;
				}

				// 1つ目の値を入力する

				// 5が選択された場合
				if (calcNum == 5) {
					System.out.println("税抜きの値を入力してください。");
				}

				// 6が選択された場合
				else if (calcNum == 6) {
					System.out.println("基本給を入力してください。");
				}

				//それ以外の番号
				else {
					Message.Message_NUMBER_ONE.show();
				}
				
				String num1 = br.readLine();
				String num2 = br.readLine();
				
				Message.Message_03.show((Double.parseDouble(num1)),(Double.parseDouble(num2)));
				
				// 2つ目の値を入力する

				// 5が選択された場合
				if (calcNum == 5) {
					System.out.println("税率パーセントを入力してください。");
				}

				// 6が選択された場合
				else if (calcNum == 6) {
					System.out.println("在籍月数を入力してください。(6か月まで)");
				}

				// それ以外の番号
				else {
					Message.Message_NUMBER_TWO.show();
				}


				// CalcFactryをインスタンス化し、選択された
				// キーによって処理を変える
				CalcFactry fac = new CalcFactry();
				ICalc calcFunction = fac.calcMapCreate(calcNum);
//				Message.Message_CALC.show(calcFunction.calc(numOne, numTwo));

			} catch (NumberFormatException e) {
				Message.Message_ERROR.show();
				Message.LINE.show();
				continue;
			}

			Message.LINE.show();

		}
	}
}
//				// 選択された計算方法で処理を変える
//				switch (calcNum) {
//
//				// 足し算
//				case 1:
//					all = new AdditionCalc(numOne, numTwo);
//					break;
//
//				// 引き算	
//				case 2:
//					all = new SubtractionCalc(numOne, numTwo);
//					break;
//
//				// 掛け算	
//				case 3:
//					all = new MultiplicationCalc(numOne, numTwo);
//					break;
//
//				// 割り算	
//				case 4:
//					all = new DivisionCalc(numOne, numTwo);
//					break;
//
//				// 税込み計算	
//				case 5:
//					all = new TaxCalc(numOne, numTwo);
//					break;
//
//				// 賞与計算
//				case 6:
//					if (numTwo == 0 || numTwo >= 7) {
//						Message.Message_ERROR.show();
//						Message.LINE.show();
//						continue;
//					}
//
//					all = new BonusCalc(numOne, numTwo);
//					break;
//
//				// それ以外の番号
//				default:
//					Message.Message_ERROR.show();
//					Message.LINE.show();
//					continue;
//				}

// 数値入力の際に例外が起きた場合、もう一度入力する
