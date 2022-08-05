package calculation.app.service.serviceImpl;

import calculation.app.dto.CalcInputDto;
import calculation.app.exception.CalcAppException;
import calculation.app.service.CalcAppService;

public class AdditionImpl implements CalcAppService {

	/**
	 * 前処理
	 * @throws CalcAppException 
	 */
	@Override
	public void beforeExecute(CalcInputDto dto) throws CalcAppException {
		//　入力値のバリデーションチェックを行う
		validate(dto);
	}


	@Override
	public int execute(CalcInputDto dto) {
		return dto.getInputNumOne() + dto.getInputNumTwo();
	}

	/**
	 * 後処理を行う
	 */
	@Override
	public void afterExecute(int calcResult) {
		// 計算結果を表示する
		System.out.println("引き算の結果は"calcResult);
	}

	private void validate(CalcInputDto dto) throws CalcAppException {
		// 在籍日数を確認する
		if(dto.getInputNumTwo() > 6) {
			throw new CalcAppException("日数がおかしいです");
		}
	}
}
