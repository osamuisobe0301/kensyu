package validation;



import constants.Constants.ProgressionMessage.ValidationMessage;
import exception.InputException;

/**
 * @author t.takagi
 * ���͒l���K�؂��`�F�b�N����
 */
public class ValidationCheck {
	
	/**
	 *�@���j���[�ԍ��̓��͂��K�؂��`�F�b�N����
	 * @param menuNumer ���͂��ꂽ���j���[�ԍ�
	 */
	public void checkMenuNumber(String menuNumer) throws InputException {
		if(!(menuNumer.equals("1")) && !(menuNumer.equals("2")) && !(menuNumer.equals("3"))) {
			throw new InputException(ValidationMessage.VALIDATION_MENU_NUMBER.getValidationMessage());
		}
	}
	
	/**
	 *�@���ID�̓��͂��K�؂��`�F�b�N����
	 * @param menuNumer ���͂��ꂽ���j���[�ԍ�
	 */
	public void checkCompanyId(String inputCompanyId) throws InputException{
		if(!(inputCompanyId.equals("01")) && !(inputCompanyId.equals("02")) && !(inputCompanyId.equals("03"))) {
			throw new InputException(ValidationMessage.VALIDATION_MENU_NUMBER.getValidationMessage());
		}
	}
	
	/**
	 *�@��EID�̓��͂��K�؂��`�F�b�N����
	 * @param menuNumer ���͂��ꂽ���j���[�ԍ�
	 */
	public void checkPostId(String inputPostId) throws InputException{
		if(!(inputPostId.equals("01")) && !(inputPostId.equals("02")) && !(inputPostId.equals("03"))) {
			throw new InputException(ValidationMessage.VALIDATION_POST_ID.getValidationMessage());
		}
	}
	
}
