package searchImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants.MESSAGE;
import dto.ShainDto;
import exception.InputException;
import search.Search;
import validation.ValidationCheck;


/**
 * @author t.takagi
 * ��EID����Ј������o�͂���
 * @param ShainDto �Ј����X�g
 */
public class SearchPostId implements Search{
	
	//���͂��ꂽ��EID���`����
	String postId;

	public void execute(List<ShainDto> shainDtoList)throws IOException{
		
		//���͒l���K�؂��^�U���`����
		boolean check = true;
		
		//�K�؂Ȗ�EID�����͂����܂œ��͂��J��Ԃ�
		while(check) {

			//�@��E�h�c���͂̎w��������ʂɏo�͂���
			System.out.println(MESSAGE.POST_ID_INPUT.getMessage());

			//�o�͂�����EID����͂���
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputPostId = br.readLine();
			postId = inputPostId;

			//���͂��ꂽ���ID���K�؂��`�F�b�N����
			try {

				//���͒l�`�F�b�N�@�\�Ăяo�����s����
				ValidationCheck validationCheck = new ValidationCheck();
				validationCheck.checkPostId(inputPostId);
				check = false;

			} catch(InputException e) {

				//�K�؂łȂ��ꍇ�G���[���b�Z�[�W����ʂɏo�͂���
				System.out.println(e.getMessage());
				check = true;
			}
		}
		
		//���͂�����EID�ƈ�v����ΎЈ�������ʂɏo�͂���
		for(ShainDto shainDto : shainDtoList){
			if(postId.equals(shainDto.getPostId())){

				//��Џ�����ʂɏo�͂���
				System.out.println(shainDto.toString());
			}
		}
	}

}
