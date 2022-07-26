package search.parts;

import java.io.IOException;
import java.util.List;
import constants.Constants.Message;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;
/**�Ј�����S�����o�͂���N���X
 */
public class AllOutput implements Search{
	/**�Ј����X�g���󂯎��A�Ј�����S�����o�͂���N���X
	 * @param �Ј����X�g�������Ŏ󂯎��
	 */
	public void search(List<Shain> shainList) throws IOException, InputException{
		
		//�{�[�i�X�v�Z�N���X�𐶐�
		SearchAppUtils searchUtils = new SearchAppUtils();
		
		Message.MESSAGE_SHORIKUBUN03.showMessage();
		
		// �g��for���ŎЈ�����S�o��
		for(Shain shain: shainList){
			Message.MESSAGE_LINE01.showMessage();
			
			// �Ј����A��E���A�������o�͂���
			shain.toString();
			
			// �{�[�i�X���v�Z����
			searchUtils.calcBonus(shain);
		}
	}
}
