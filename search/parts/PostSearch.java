package search.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import exception.InputError;
import repository.dto.Search;
import repository.dto.Shain;

/**
 * @author t.takagi
 *
 */

/**役職から社員データを出力するクラス
 */
public class PostSearch implements Search{
	/**社員リストを受け取り、入力された役職IDに該当する社員情報を出力するメソッド
	 */
	public void search(List<Shain> shainList) throws IOException, InputError{
		Constants.Message.MESSAGE_SHORIKUBUN04.showMessageBreak();
		Constants.Message.MESSAGE_SHORIKUBUN05.showMessageBreak();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String postId = br.readLine();
		for(Shain shain: shainList){
			if(postId.equals(shain.getPostId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				shain.outputInformation();
			}else {
				throw new InputError();
				
			}
		}
	}
}

