package calculation.app.service;

import calculation.app.dto.CalcInputDto;

public interface CalcAppService {

	
	/**
	 * 前処理を行う
	 * @param dto　入力データ
	 */
	void beforeExecute(CalcInputDto dto);
	
	//　本処理を行う。
	int execute(CalcInputDto dto);
	//　後処理を行う。
	void afterExecute(int clacResult);
	
	public static CalcAppService createAppService(CalcInputDto dto) {
		
		return map.get(dto.getFunctionId());
	}
}
