package search.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants;
import exception.InputError;
import repository.dto.Search;
import repository.dto.Shain;

/**社員IDから社員データを出力するクラス
 */
public class IdSearch implements Search{
	/**社員リストを受け取り入力された社員IDに該当する社員情報を出力するメソッド
	 * @param 社員リストを引数で受け取る
	 */
	public void search(List<Shain> shainList) throws IOException, InputError{
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		//社員IDを入力させて該当する社員情報を出力する
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Input = br.readLine();
		for(Shain shain : shainList){
			if(Input.equals(shain.getId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				shain.outputInformation();
			}else {
				throw new InputError();
			}
		}
	}
}


