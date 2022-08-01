package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.Post;
import dto.character.Shain;

/**
 *�@���k�̃t�@�N�g���[�N���X
 */
public class ShainFactory {

	/**
	 *�@���k���X�g����
	 */
	static List<Shain> shainList = new ArrayList<>();


	Map<String, Post> postMap = new HashMap<>();

	/**
	 *�@�R���X�g���N�^
	 */
	public ShainFactory() {

		shainList.add(new Shain("1", "����", "1"));
		shainList.add(new Shain("2", "�R�c", "2"));
		shainList.add(new Shain("3", "�H��", "3"));

	}

	/**
	 *�@�N���G�C�g���\�b�h
	 * @return studentList ���k���X�g
	 */
	public static List<Shain> create() {
		return shainList;
	}
}
