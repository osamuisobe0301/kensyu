package calculation.app.service.serviceImpl;

import calculation.app.dto.CalcInputDto;
import calculation.app.exception.CalcAppException;
import calculation.app.service.CalcAppService;

public class AdditionImpl implements CalcAppService {

	/**
	 * �O����
	 * @throws CalcAppException 
	 */
	@Override
	public void beforeExecute(CalcInputDto dto) throws CalcAppException {
		//�@���͒l�̃o���f�[�V�����`�F�b�N���s��
		validate(dto);
	}


	@Override
	public int execute(CalcInputDto dto) {
		return dto.getInputNumOne() + dto.getInputNumTwo();
	}

	/**
	 * �㏈�����s��
	 */
	@Override
	public void afterExecute(int calcResult) {
		// �v�Z���ʂ�\������
		System.out.println("�����Z�̌��ʂ�"calcResult);
	}

	private void validate(CalcInputDto dto) throws CalcAppException {
		// �ݐГ������m�F����
		if(dto.getInputNumTwo() > 6) {
			throw new CalcAppException("���������������ł�");
		}
	}
}
