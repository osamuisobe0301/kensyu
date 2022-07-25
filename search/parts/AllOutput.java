package search.parts;

import java.io.IOException;
import java.util.List;
import constants.Constants;
import exception.InputError;
import repository.dto.Search;
import repository.dto.Shain;
/**社員情報を全員分出力するクラス
 */
public class AllOutput implements Search{
	/**社員リストを受け取り、社員情報を全員分出力するクラス
	 * @param 社員リストを引数で受け取る
	 */
	public void search(List<Shain> shainList) throws IOException, InputError{
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		for(Shain shain: shainList){
			Constants.Message.MESSAGE_LINE01.showMessageBreak();
			shain.outputInformation();
		}
	}
}
