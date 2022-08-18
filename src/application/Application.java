package application;

import java.io.IOException;

import constants.Constants.Message;
import service.Controller;


/**
 * @author t.takagi
 *
 */

/**
 * �N���N���X
 */
public class Application {

	public static void main(String[] args) throws IOException {
		Message.MESSAGE_TITLE.showMessage();
		/**
		 * �R���g���[���[���\�b�h�̌Ăяo���ƋN��
		 */
		while(true) {
			try {
				Controller controller = new Controller();
				controller.start();
				break;
			}catch(NullPointerException e) {
				Message.MESSAGE_ERROR03.showMessage();
			}catch(NumberFormatException e){
				Message.MESSAGE_ERROR01.showMessage();

			}

		}
		//�I�����b�Z�[�W
		Message.MESSAGE_MENU04.showMessage();
	}
}
