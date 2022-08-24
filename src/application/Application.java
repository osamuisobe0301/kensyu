package application;
import java.io.IOException;

import controller.Controller;

/**
 * アプリケーション
 * @author t.takagi
 */
public class Application{
	public static void main(String[] args){


		// システムの工程を管理するコントローラーを呼び出す
		Controller controller = new Controller();


		try {
			// システムを起動する
			controller.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
