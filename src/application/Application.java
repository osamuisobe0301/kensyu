package application;
import java.io.IOException;

import controller.Controller;

/**
 * �A�v���P�[�V����
 * @author t.takagi
 */
public class Application{
	public static void main(String[] args){


		// �V�X�e���̍H�����Ǘ�����R���g���[���[���Ăяo��
		Controller controller = new Controller();


		try {
			// �V�X�e�����N������
			controller.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
