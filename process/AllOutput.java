package process;

import java.util.List;
import constants.Constants;
import dto.Shain;

public class AllOutput {
	//�Ј����X�g�������Ŏ󂯎��
	/**
	 * @param shainList �Ј����X�g
	 */
	public static void allOutput(List<Shain> shainList) {
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		for(Shain shain: shainList){
			Constants.Message.MESSAGE_LINE01.showMessageBreak();
			//�Ј������o�͂��郁�\�b�h
			shain.OutputInformation();
		}
	}
}
