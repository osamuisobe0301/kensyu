package search.parts;

import constants.Constants.Message;
import repository.dto.Shain;

public class SearchAppUtils {

	/**
	 * ボーナスの計算と出力メソッド
	 */
	void calcBonus(Shain shain) {
		switch(shain.getPostId()) {
		case "01":
			shain.setBonus(shain.getSalary() * 2.0);
			break;
		case "02":
			shain.setBonus(shain.getSalary() * 2.5);
			break;
		case "03":
			shain.setBonus(shain.getSalary() * 3.0);
			break;
		}
		Message.MESSAGE_SHAIN04.showMessage();
		System.out.println(shain.getBonus());
	}
}
