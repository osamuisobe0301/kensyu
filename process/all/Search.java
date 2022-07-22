package process.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import constants.Constants.Message;
import dto.Factory;
import dto.Shain;
import main.controller.EndCheck;
import process.AllOutput;
import process.IdSearch;
import process.PostSearch;

/**
 * @author 
 *
 */
public class Search {
	boolean check = true;
	public Search() throws IOException {
		//end����͂��ꂽ�ۂ͏I���A�G���^�[�L�[�Ōp������
		while(check) {
			//create���\�b�h�ŎЈ����X�g��߂�
			List<Shain> shainList = Factory.create();
			
			
			Message.MESSAGE_SHORIKUBUN01.showMessageBreak();
			Message.MESSAGE_SHORIKUBUN02.showMessageBreak();
			
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
