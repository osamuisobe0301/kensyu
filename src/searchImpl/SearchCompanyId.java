package searchImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

import dto.ShainDto;
import exception.InputException;
import search.Search;
import validation.ValidationCheck;
import constants.Constants.ProgressionMessage;



/**
 * @author t.takagi
 * ���ID����Ј������������ďo�͂���
 * @param shainDtoList �Ј����X�g
 */
public class SearchCompanyId implements Search{
	
	//���͂��ꂽ���ID���`����
	String companyId;

	public void execute(List<ShainDto> shainDtoList)throws IOException{
		
		//���͒l���K�؂��^�U���`
		boolean check = true;
		
		//�K�؂ȉ��ID�����͂����܂œ��͂��J��Ԃ�
		while(check) {


			// ��Ђh�c���͂̎w��������ʂɏo�͂���
			System.out.println(ProgressionMessage.COMPANY_ID_INPUT.getMessage());

			//�o�͂��������ID����͂���
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputCompanyId = br.readLine();
			companyId = inputCompanyId;

			//���͂��ꂽ���ID���K�؂��`�F�b�N����
			try {

				//���͒l�`�F�b�N�@�\�Ăяo�����s
				ValidationCheck validationCheck = new ValidationCheck();
				validationCheck.checkCompanyId(inputCompanyId);
				check = false;

			} catch(InputException e) {

				//�K�؂łȂ��ꍇ�G���[���b�Z�[�W����ʂɏo�͂���
				System.out.println(e.getMessage());
				check = true;
			}
		}
		
		//���͂������ID�ƈ�v����ΎЈ�������ʂɏo�͂���
		for(ShainDto shainDto : shainDtoList){
			if(companyId.equals(shainDto.getCompanyId())){

				//��Џ�����ʂɏo�͂���
				System.out.println(shainDto.toString());
			}
		}
	}
}    