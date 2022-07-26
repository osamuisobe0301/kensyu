package search.summarize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import constants.Constants;
import exception.InputException;
import repository.dto.Search;
import repository.dto.Shain;
import repository.factory.EmpFactory;
import repository.factory.SearchFactory;

/**
 * @author t.takagi
 *
 */

/**
 *�@�������X�^�[�g����N���X
 */
public class SearchMain {
	
	/**
	 *�@�������X�^�[�g���郁�\�b�h
	 */
	public void start() throws IOException, InputException {
	Constants.Message.MESSAGE_SHORIKUBUN01.showMessage();
	
	
	// �����敪����͂�����
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String shoriKubun = br.readLine();
	
	// �����敪�ɂ���Č����@�\���Ăяo��
	Search search = SearchFactory.createService(shoriKubun);
	
	// �Ј��t�@�N�g���[�𐶐����A�Ј����X�g��߂�
	EmpFactory empFactory = new EmpFactory();
	List<Shain> shainList = empFactory.createListReturn();
	
	
	// �Ăяo���ꂽ�����@�\�̌������郁�\�b�h
	search.search(shainList);
	}
}
