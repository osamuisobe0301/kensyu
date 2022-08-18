package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants;
import repository.dto.Shain;

public class IdSearch {
	//社員リストを引数で受け取る
	public static void searchId(List<Shain> shainList) throws IOException  {
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		//社員IDを入力させて該当する社員情報を出力する
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Input = br.readLine();
		for(Shain shain : shainList){
			if(Input.equals(shain.getId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				//社員情報を出力するメソッド
				shain.OutputInformation();
			}
		}
	}
}


