package calculation.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import calculation.app.dto.CalcInputDto;
import calculation.app.service.CalcAppService;

public class CalclationApp {

	public void start() {
		
		// �����������s��
		CalcInputDto inputDto = init();
		//�@�@�\ID�ɉ������@�\���擾����
		CalcAppService service = CalcAppService.createAppService(inputDto);
		//�@�擾�����@�\�ŏ��������s����
		service.beforeExecute(inputDto);
		int calcResult = service.execute();
		service.afterExecute(calcResult);
		
	}

	
	/**
	 * �����������s��
	 * @return�@���̓f�[�^
	 */
	private CalcInputDto init() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �@�\ID����͂���
		String functionId = br.readLine();
		// �v�Z�p�̐����̈�ڂ���͂���
		int inputNumOne = Integer.parseInt(br.readLine());
		// �v�Z�p�̐����̓�ڂ���͂���
		int inputNumTwo = Integer.parseInt(br.readLine());
		//�@���͒l�p�̃N���X�𐶐�����
		CalcInputDto inputDto = new CalcInputDto(functionId, inputNumOne, inputNumTwo);
		
		return inputDto;
	}
}
