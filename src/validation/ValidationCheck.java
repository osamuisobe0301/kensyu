package validation;



import constants.Constants.ProgressionMessage.ValidationMessage;
import exception.InputException;

/**
 * @author t.takagi
 * 入力値が適切かチェックする
 */
public class ValidationCheck {
	
	/**
	 *　メニュー番号の入力が適切かチェックする
	 * @param menuNumer 入力されたメニュー番号
	 */
	public void checkMenuNumber(String menuNumer) throws InputException {
		if(!(menuNumer.equals("1")) && !(menuNumer.equals("2")) && !(menuNumer.equals("3"))) {
			throw new InputException(ValidationMessage.VALIDATION_MENU_NUMBER.getValidationMessage());
		}
	}
	
	/**
	 *　会社IDの入力が適切かチェックする
	 * @param menuNumer 入力されたメニュー番号
	 */
	public void checkCompanyId(String inputCompanyId) throws InputException{
		if(!(inputCompanyId.equals("01")) && !(inputCompanyId.equals("02")) && !(inputCompanyId.equals("03"))) {
			throw new InputException(ValidationMessage.VALIDATION_MENU_NUMBER.getValidationMessage());
		}
	}
	
	/**
	 *　役職IDの入力が適切かチェックする
	 * @param menuNumer 入力されたメニュー番号
	 */
	public void checkPostId(String inputPostId) throws InputException{
		if(!(inputPostId.equals("01")) && !(inputPostId.equals("02")) && !(inputPostId.equals("03"))) {
			throw new InputException(ValidationMessage.VALIDATION_POST_ID.getValidationMessage());
		}
	}
	
}
