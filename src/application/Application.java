package application;

import java.io.IOException;

import constants.Constants.Message;
import service.Controller;


/**
 * @author t.takagi
 *
 */

/**
 * 起動クラス
 */
public class Application {

	public static void main(String[] args) throws IOException {
		Message.MESSAGE_TITLE.showMessage();
		/**
		 * コントローラーメソッドの呼び出しと起動
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
		//終了メッセージ
		Message.MESSAGE_MENU04.showMessage();
	}
}
