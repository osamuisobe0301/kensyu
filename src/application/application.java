package application;

import java.util.List;

import dao.Post;
import dto.character.Shain;
import factory.PostFactory;
import factory.ShainFactory;



/**
 * �A�v���P�[�V�����N���X
 */
public class application {

	/**
	 * ���C�����\�b�h
	 */
	public static void main(String[] args) {

		// �t�@�N�g���[�̃C���X�^���X�𐶐�
		ShainFactory studentFactory = new ShainFactory();

		//���k���X�g���N���G�C�g���\�b�h�ŕԋp
		List<Shain> shainList = ShainFactory.create();

		//�Ј����S�o��
		for(Shain s : shainList) {

			//�Ј��̖�EID���L�[�ɂ��ĕR�Â�����E�̏����擾
			Post post = PostFactory.create(s.getPostId());

			//�Ј�dto�̏��o��
			s.toString();

			//��Edao�̏��o��
			System.out.println(s);
			post.toString();
		}
	}

}