package searchImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants.MESSAGE;
import dto.ShainDto;
import exception.InputException;
import search.Search;
import validation.ValidationCheck;


/**
 * @author t.takagi
 * 役職IDから社員情報を出力する
 * @param ShainDto 社員リスト
 */
public class SearchPostId implements Search{
	
	//入力された役職IDを定義する
	String postId;

	public void execute(List<ShainDto> shainDtoList)throws IOException{
		
		//入力値が適切か真偽を定義する
		boolean check = true;
		
		//適切な役職IDが入力されるまで入力を繰り返す
		while(check) {

			//　役職ＩＤ入力の指示文を画面に出力する
			System.out.println(MESSAGE.POST_ID_INPUT.getMessage());

			//出力した役職IDを入力する
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputPostId = br.readLine();
			postId = inputPostId;

			//入力された会社IDが適切かチェックする
			try {

				//入力値チェック機能呼び出し実行する
				ValidationCheck validationCheck = new ValidationCheck();
				validationCheck.checkPostId(inputPostId);
				check = false;

			} catch(InputException e) {

				//適切でない場合エラーメッセージを画面に出力する
				System.out.println(e.getMessage());
				check = true;
			}
		}
		
		//入力した役職IDと一致すれば社員情報を画面に出力する
		for(ShainDto shainDto : shainDtoList){
			if(postId.equals(shainDto.getPostId())){

				//会社情報を画面に出力する
				System.out.println(shainDto.toString());
			}
		}
	}

}
