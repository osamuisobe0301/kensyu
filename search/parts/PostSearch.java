package search.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants.Message;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;

 

/**役職から社員データを出力するクラス
 */
public class PostSearch implements Search{
	
	/**社員リストを受け取り、入力された役職IDに該当する社員情報を出力するメソッド
	 */
	public void search(List<Shain> shainList) throws IOException, InputException{

		//ボーナス計算クラスを生成
		SearchAppUtils searchAppUtils = new SearchAppUtils();

		Message.MESSAGE_SHORIKUBUN04.showMessage();

		//役職IDを入力させる
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputPostId = br.readLine();

		//拡張for文で入力された役職IDに該当する社員情報を出力する
		for(Shain shain: shainList){
			if(shain.getPostId().equals(inputPostId)){
				Message.MESSAGE_LINE01.showMessage();
				
				//社員名、役職名、給料を出力する
				shain.toString();
				
				// ボーナスを計算する
				searchAppUtils.calcBonus(shain);
			}else {

			}
		}
	}
}

