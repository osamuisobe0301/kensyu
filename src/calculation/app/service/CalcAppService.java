package calculation.app.service;

import calculation.app.dto.CalcInputDto;

public interface CalcAppService {

	
	/**
	 * �O�������s��
	 * @param dto�@���̓f�[�^
	 */
	void beforeExecute(CalcInputDto dto);
	
	//�@�{�������s���B
	int execute(CalcInputDto dto);
	//�@�㏈�����s���B
	void afterExecute(int clacResult);
	
	public static CalcAppService createAppService(CalcInputDto dto) {
		
		return map.get(dto.getFunctionId());
	}
}
