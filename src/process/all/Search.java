package process.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import process.AllOutput;
import process.EndCheck;
import process.IdSearch;
import process.PostSearch;
import repository.dto.Shain;
import repository.factory.Factory;

/**
 * @author 
 *
 */
public class Search {
	boolean check = true;
		public void start() throws IOException {
		//end����͂��ꂽ�ۂ͏I���A�G���^�[�L�[�Ōp������
		while(check) {
			//�Ј����X�g��߂����\�b�h
			List<Shain> shainList = Factory.createListReturn();
			
			Constants.Message.MESSAGE_SHORIKUBUN01.showMessageBreak();
			Constants.Message.MESSAGE_SHORIKUBUN02.showMessageBreak();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String shoriKubun = br.readLine();
			//���͂��ꂽ�����敪�ɂ���ďo�͓��e�𔻕�
			switch(shoriKubun) {
			case "0":
				//ID�ŎЈ������o�͂��郁�\�b�h
				IdSearch.searchId(shainList);
				break;
			case "1":
				//��EID����͂��Ė�E�ɊY������Ј������o�͂��郁�\�b�h
				PostSearch.searchPost(shainList);
				break;
			case "2":
				//�S�Ј������o�͂��郁�\�b�h
				AllOutput.allOutput(shainList);
				break;
			}
			//end����͂��ꂽ���G���^�[�L�[�������ꂽ�����f���郁�\�b�h
			check = EndCheck.check();
		}
	}
}
