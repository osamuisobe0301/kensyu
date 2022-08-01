package factory;

import java.util.HashMap;
import java.util.Map;

import dao.Post;

/**
 * ��E�t�@�N�g���[
 */
public class PostFactory {
	static Map<String, Post> postMap = new HashMap<>();
	
	/**
	 * �N���G�C�g�t�@�N�g���[
	 * @param PostId�@��EID
	 * @return�@Post�@��E
	 */
	public static Post create(String PostId) {
		
		//��E�}�b�v����
		Map<String, Post> postMap = new HashMap<>();
		
		//��Edao�������ƃ}�b�v���L�[�ƃo�����[���Z�b�g
		postMap.put("1", new Post("1", "��C", 1000000));
		postMap.put("2", new Post("2", "����C", 500000));
		postMap.put("3", new Post("3", "���", 260000));
		
		//��EID�L�[�Ŏ󂯎���Ė�Edao��Ԃ�
		return postMap.get(PostId);
	}
}
