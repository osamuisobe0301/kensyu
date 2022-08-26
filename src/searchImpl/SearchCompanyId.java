package searchImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

import dto.ShainDto;
import exception.InputException;
import search.Search;
import validation.ValidationCheck;
import constants.Constants.ProgressionMessage;



/**
 * @author t.takagi
 * 会社IDから社員情報を検索して出力する
 * @param shainDtoList 社員リスト
 */
public class SearchCompanyId implements Search{
	
	//入力された会社IDを定義する
	String companyId;

	public void execute(List<ShainDto> shainDtoList)throws IOException{
		
		//入力値が適切か真偽を定義
		boolean check = true;
		
		//適切な会社IDが入力されるまで入力を繰り返す
		while(check) {


			// 会社ＩＤ入力の指示文を画面に出力する
			System.out.println(ProgressionMessage.COMPANY_ID_INPUT.getMessage());

			//出力したい会社IDを入力する
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputCompanyId = br.readLine();
			companyId = inputCompanyId;

			//入力された会社IDが適切かチェックする
			try {

				//入力値チェック機能呼び出し実行
				ValidationCheck validationCheck = new ValidationCheck();
				validationCheck.checkCompanyId(inputCompanyId);
				check = false;

			} catch(InputException e) {

				//適切でない場合エラーメッセージを画面に出力する
				System.out.println(e.getMessage());
				check = true;
			}
		}
		
		//入力した会社IDと一致すれば社員情報を画面に出力する
		for(ShainDto shainDto : shainDtoList){
			if(companyId.equals(shainDto.getCompanyId())){

				//会社情報を画面に出力する
				System.out.println(shainDto.toString());
			}
		}
	}
}    