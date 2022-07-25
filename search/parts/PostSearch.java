package search.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import exception.InputError;
import repository.dto.Search;
import repository.dto.Shain;

/**
 * @author t.takagi
 *
 */

/**��E����Ј��f�[�^���o�͂���N���X
 */
public class PostSearch implements Search{
	/**�Ј����X�g���󂯎��A���͂��ꂽ��EID�ɊY������Ј������o�͂��郁�\�b�h
	 */
	public void search(List<Shain> shainList) throws IOException, InputError{
		Constants.Message.MESSAGE_SHORIKUBUN04.showMessageBreak();
		Constants.Message.MESSAGE_SHORIKUBUN05.showMessageBreak();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String postId = br.readLine();
		for(Shain shain: shainList){
			if(postId.equals(shain.getPostId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				shain.outputInformation();
			}else {
				throw new InputError();
				
			}
		}
	}
}

