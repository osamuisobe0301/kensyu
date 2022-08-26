package tools;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import constants.Constants.ProgressionMessage;
import exception.InputException;
import validation.ValidationCheck;


/**
 * @author t.takagi
 * �������������j���[�ԍ�����͂���
 * 1.���ID�Ō�������@2.��EID�Ō�������@3.�Ј�����S�o�͂���
 */
public class InputMenuTool{
	
	String menuNumber;

	/**
	 * ���j���[�ԍ�����͂���
	 * @return menuNumber ���͂������j���[�ԍ�
	 */
	public String inputMenu() throws IOException{
		
		//���͒l���K�؂��^�U���`����
		boolean check = true;
		
		//�K�؂ȃ��j���[�ԍ������͂����܂œ��͂��J��Ԃ�
		while(check) {
			
			//���j���[�ԍ����͂̎w������ʂɏo�͂���
			System.out.println(ProgressionMessage.MENU_NUMBER_INPUT.getMessage());

			//�����������j���[�ԍ�����͂���
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputMenu = br.readLine();
			menuNumber = inputMenu;

			//���͂��ꂽ���j���[�ԍ����P�A�Q�A3���`�F�b�N����
			try {
				
				//���͒l�`�F�b�N�@�\�Ăяo�����s
				ValidationCheck validationCheck = new ValidationCheck();
				validationCheck.checkMenuNumber(inputMenu);
				check = false;
				
			} catch(InputException e) {
				
				//�K�؂łȂ��ꍇ�G���[���b�Z�[�W����ʂɏo�͂���
				System.out.println(e.getMessage());
				check = true;
			}
		}
		return menuNumber;
	}
}