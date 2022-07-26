package search.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants.Message;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;

 

/**��E����Ј��f�[�^���o�͂���N���X
 */
public class PostSearch implements Search{
	
	/**�Ј����X�g���󂯎��A���͂��ꂽ��EID�ɊY������Ј������o�͂��郁�\�b�h
	 */
	public void search(List<Shain> shainList) throws IOException, InputException{

		//�{�[�i�X�v�Z�N���X�𐶐�
		SearchAppUtils searchAppUtils = new SearchAppUtils();

		Message.MESSAGE_SHORIKUBUN04.showMessage();

		//��EID����͂�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputPostId = br.readLine();

		//�g��for���œ��͂��ꂽ��EID�ɊY������Ј������o�͂���
		for(Shain shain: shainList){
			if(shain.getPostId().equals(inputPostId)){
				Message.MESSAGE_LINE01.showMessage();
				
				//�Ј����A��E���A�������o�͂���
				shain.toString();
				
				// �{�[�i�X���v�Z����
				searchAppUtils.calcBonus(shain);
			}else {

			}
		}
	}
}

