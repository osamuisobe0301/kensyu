package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import repository.dto.Shain;

public class PostSearch {
	//�Ј����X�g�������Ŏ󂯎��
	public static void searchPost(List<Shain> shainList) throws IOException{
		Constants.Message.MESSAGE_SHORIKUBUN04.showMessageBreak();
		Constants.Message.MESSAGE_SHORIKUBUN05.showMessageBreak();
		//��EID����͂����ĊY������Ј������o�͂���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String postId = br.readLine();
		for(Shain shain: shainList){
			if(postId.equals(shain.getPostId())){
				Constants.Message.MESSAGE_LINE01.showMessageBreak();
				//�Ј������o�͂��郁�\�b�h
				shain.OutputInformation();
			}
		}
	}
}

