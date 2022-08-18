package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import constants.Constants.Message;
import repository.character.Student;
import repository.dto.Service;
import util.Util;
import repository.factory.ServiceFactory;

/**
 * コントローラー起動クラス
 */
public class Controller {
	
	//受験生リスト
	public List<Student> studentList = new ArrayList<>();
	
	//起動クラス
	public void start() throws IOException {
		boolean flag = true;
		
		Util util = new Util();
		
		while(flag) {

			//実行するメニューを選択
			Message.MESSAGE_MENU01.showMessage();
			String menu = Util.br.readLine();
			
			//入力されたメニュー番号に該当するメニューを生成
			Service service = ServiceFactory.create(menu);

			//メニューを実行する
			studentList = service.execute(studentList);
			
			Message.MESSAGE_MENU02.showMessage();

			flag = util.stop();
		}
	}
}






































/*学校リストを生成して戻す
	List<SchoolImpl> schoolList = SchoolFactory.schoolListReturn();


	InputStudent inputStudent = new InputStudent();
	List<Student> studentList = inputStudent.input();

	Pass pass = new Pass();
	pass.judgePass(studentList);

	//生徒情報入力インスタンスを生成
	/*RepeatInput repeatInput = new RepeatInput();

	//生徒の情報を入力させて生徒リストを生成し戻す
	List<Student> StudentList = repeatInput.inputAll();


	}
}*/
