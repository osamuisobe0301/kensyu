package calculation.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import calculation.app.dto.CalcInputDto;
import calculation.app.service.CalcAppService;

public class CalclationApp {

	public void start() {
		
		// 初期処理を行う
		CalcInputDto inputDto = init();
		//　機能IDに応じた機能を取得する
		CalcAppService service = CalcAppService.createAppService(inputDto);
		//　取得した機能で処理を実行する
		service.beforeExecute(inputDto);
		int calcResult = service.execute();
		service.afterExecute(calcResult);
		
	}

	
	/**
	 * 初期処理を行う
	 * @return　入力データ
	 */
	private CalcInputDto init() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 機能IDを入力する
		String functionId = br.readLine();
		// 計算用の数字の一つ目を入力する
		int inputNumOne = Integer.parseInt(br.readLine());
		// 計算用の数字の二つ目を入力する
		int inputNumTwo = Integer.parseInt(br.readLine());
		//　入力値用のクラスを生成する
		CalcInputDto inputDto = new CalcInputDto(functionId, inputNumOne, inputNumTwo);
		
		return inputDto;
	}
}
