package process;

import java.util.List;
import constants.Constants;
import dto.Shain;

public class AllOutput {
	//社員リストを引数で受け取る
	/**
	 * @param shainList 社員リスト
	 */
	public static void allOutput(List<Shain> shainList) {
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		for(Shain shain: shainList){
			Constants.Message.MESSAGE_LINE01.showMessageBreak();
			//社員情報を出力するメソッド
			shain.OutputInformation();
		}
	}
}
