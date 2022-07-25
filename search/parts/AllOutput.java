package search.parts;

import java.io.IOException;
import java.util.List;
import constants.Constants;
import exception.InputError;
import repository.dto.Search;
import repository.dto.Shain;
/**�Ј�����S�����o�͂���N���X
 */
public class AllOutput implements Search{
	/**�Ј����X�g���󂯎��A�Ј�����S�����o�͂���N���X
	 * @param �Ј����X�g�������Ŏ󂯎��
	 */
	public void search(List<Shain> shainList) throws IOException, InputError{
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		for(Shain shain: shainList){
			Constants.Message.MESSAGE_LINE01.showMessageBreak();
			shain.outputInformation();
		}
	}
}
