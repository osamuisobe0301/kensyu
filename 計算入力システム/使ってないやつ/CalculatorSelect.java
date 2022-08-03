package 使ってないやつ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import constants.Constants.Message;
import dto.ICalc;
import service.AdditionCalcimpl;
import service.BonusCalcimpl;
import service.DivisionCalcimpl;
import service.MultiplicationCalcimpl;
import service.SubtractionCalcimpl;
import service.TaxCalcimpl;

/**
 * 計算方法を決めるクラス
 * @author nakano
 *
 */
public class CalculatorSelect {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void CalculatorMethod() throws IOException {

		while (true) {
			//計算方法を選択する
			Message.Message_01.show();
			Message.LINE.show();
			String str = br.readLine();
			try {
			int calcNum = Integer.parseInt(str);
			
			//0が選択された場合終了する
			if (calcNum == 0) {
				Message.Message_END.show();
				break;
			}
			//1つ目の値を入力する
			if (calcNum == 5) {
				System.out.println("税抜きの値を入力してください。");
			}
			else if (calcNum == 6) {
				System.out.println("基本給を入力してください。");
			}
			else {
			Message.Message_NUMBER_ONE.show();
			}
			String num1 = br.readLine();
			int numOne = Integer.parseInt(num1);

			//2つ目の値を入力する
			if (calcNum == 5) {
				System.out.println("税率パーセントを入力してください。");
			}
			else if (calcNum == 6) {
				System.out.println("在籍月数を入力してください。(6か月まで)");
			}
			else {
			Message.Message_NUMBER_TWO.show();
			}
			String num2 = br.readLine();
			int numTwo = Integer.parseInt(num2);

			//選択された計算方法で処理を変える
			switch (calcNum) {
			
			//足し算
			case 1:
				ICalc add = new AdditionCalcimpl(numOne, numTwo);
				add.calc();
				break;
				
			//引き算	
			case 2:
				ICalc sub = new SubtractionCalcimpl(numOne, numTwo);
				sub.calc();
				break;
				
			//掛け算	
			case 3:
				ICalc mul = new MultiplicationCalcimpl(numOne, numTwo);
				mul.calc();
				break;
				
			//割り算	
			case 4:
				ICalc div = new DivisionCalcimpl(numOne, numTwo);
				div.calc();
				break;
				
			//税込み計算	
			case 5:
				ICalc tax = new TaxCalcimpl(numOne, numTwo);
				tax.calc();
				break;
				
			//賞与計算
			case 6:
				ICalc bonus = new BonusCalcimpl(numOne, numTwo);
				bonus.calc();
				break;
				
			default:
				Message.Message_ERROR.show();
				Message.LINE.show();
				continue;
			}
			}catch(NumberFormatException e) {
				Message.Message_ERROR.show();
				Message.LINE.show();
				continue;
			}
			Message.LINE.show();

		}
	}
}
