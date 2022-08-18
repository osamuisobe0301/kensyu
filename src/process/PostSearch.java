package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import repository.dto.Shain;

public class PostSearch {
	//社員リストを引数で受け取る
	public static void searchPost(List<Shain> shainList) throws IOException{
		Constants.Message.MESSAGE_SHORIKUBUN04.showMessageBreak();
		Constants.Message.MESSAGE_SHORIKUBUN05.showMessageBreak();
		//役職IDを入力させて該当する社員情報を出力する
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String postId = br.readLine();
		for(Shain shain: shainList){
			if(postId.equals(shain.getPostId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				//社員情報を出力するメソッド
				shain.OutputInformation();
			}
		}
	}
}

