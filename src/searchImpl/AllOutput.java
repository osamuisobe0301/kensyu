package searchImpl;

import java.util.List;

import dto.ShainDto;
import search.Search;

import java.io.IOException;

/**
 * @author t.takagi
 * �Ј�����S�o�͂���@�\
 */
public class AllOutput implements Search{

	/**
	 * �Ј�����S�o�͂���
	 * @param shainDtoList �Ј����X�g
	 */
	public void execute(List<ShainDto> shainDtoList)throws IOException{
		for(ShainDto shainDto : shainDtoList){

			//�Ј�������ʂɕ\������
			System.out.println(shainDto.toString());
		}
	}
}


