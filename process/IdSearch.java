package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants;
import dto.Shain;

/**
 * 
 * @author t.takagi
 *
 */
public class IdSearch {
	//�Ј����X�g�������Ŏ󂯎��
	public static void searchId(List<Shain> shainList) throws IOException  {
		Constants.Message.MESSAGE_SHORIKUBUN03.showMessageBreak();
		//�Ј�ID����͂����ĊY������Ј������o�͂���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Input = br.readLine();
		for(Shain shain : shainList){
			if(Input.equals(shain.getId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				//�Ј������o�͂��郁�\�b�h
				shain.OutputInformation();
			}
		}
	}
}


