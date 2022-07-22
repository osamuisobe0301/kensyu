package process.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants.Message;
import dto.Factory;
import dto.Shain;
import main.controller.EndCheck;
import process.AllOutput;
import process.IdSearch;
import process.PostSearch;

/**
 * @author 
 *
 */
public class Search {
	boolean check = true;
	public Search() throws IOException {
		//endを入力された際は終了、エンターキーで継続する
		while(check) {
			//createメソッドで社員リストを戻す
			List<Shain> shainList = Factory.create();
			
			
			Message.MESSAGE_SHORIKUBUN01.showMessageBreak();
			Message.MESSAGE_SHORIKUBUN02.showMessageBreak();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String shoriKubun = br.readLine();
			//入力された処理区分によって出力内容を判別
			switch(shoriKubun) {
			case "0":
				//IDで社員情報を出力するメソッド
				IdSearch.searchId(shainList);
				break;
			case "1":
				//役職IDを入力して役職に該当する社員情報を出力するメソッド
				PostSearch.searchPost(shainList);
				break;
			case "2":
				//全社員情報を出力するメソッド
				AllOutput.allOutput(shainList);
				break;
			}
			//endを入力されたかエンターキーが押されたか判断するメソッド
			check = EndCheck.check();
		}
	}
}
