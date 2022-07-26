package search.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants.Message;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;

/**社員IDから社員データを出力するクラス
 */
public class IdSearch implements Search{

	/**社員リストを受け取り入力された社員IDに該当する社員情報を出力するメソッド
	 * @param 社員リストを引数で受け取る
	 */
	public void search(List<Shain> shainList) throws IOException, InputException{

		//ボーナス計算クラスを生成
		SearchAppUtils searchAppUtils = new SearchAppUtils();
		Message.MESSAGE_SHORIKUBUN03.showMessage();

		//社員IDを入力させる
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputShainId = br.readLine();

		//拡張for文で入力された社員IDに該当する社員情報を出力する
		for(Shain shain : shainList){
			if(shain.getId().equals(inputShainId)){
				Message.MESSAGE_LINE01.showMessage();

				//社員名、役職名、給料を出力する
				shain.outputInformation();

				// ボーナスを計算する
				searchAppUtils.calcBonus(shain);
			}else {
			}
		}
	}
}


