package table;


import java.util.Arrays;
import java.util.List;

import dao.Shain;


/**
 *�@@author t.takagi
 */

/**
 *�@�Ј������Ǘ�����N���X
 */
public class ShainTable {


	/**
	 *�@�Ј���񃊃X�g��n��
	 * @return shainList �Ј����X�g
	 */
	public List<Shain> ReturnShainList(){
		
		//�Ј���񃊃X�g��������
		List<Shain> shainList = Arrays.asList(
				
		//�Ј�����������
		new Shain("001", "����", "1"),
		new Shain("002", "�R�c", "2"),
		new Shain("003", "�H��", "3"));
		
		return shainList;
	}

}
