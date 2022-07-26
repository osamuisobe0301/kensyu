package search.parts;

import java.io.IOException;
import java.util.List;
import constants.Constants.Message;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;
/**社員情報を全員分出力するクラス
 */
public class AllOutput implements Search{
	/**社員リストを受け取り、社員情報を全員分出力するクラス
	 * @param 社員リストを引数で受け取る
	 */
	public void search(List<Shain> shainList) throws IOException, InputException{
		
		//ボーナス計算クラスを生成
		SearchAppUtils searchUtils = new SearchAppUtils();
		
		Message.MESSAGE_SHORIKUBUN03.showMessage();
		
		// 拡張for文で社員情報を全出力
		for(Shain shain: shainList){
			Message.MESSAGE_LINE01.showMessage();
			
			// 社員名、役職名、給料を出力する
			shain.toString();
			
			// ボーナスを計算する
			searchUtils.calcBonus(shain);
		}
	}
}
