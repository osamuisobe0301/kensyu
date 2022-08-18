package service.parts;

import java.io.IOException;
import java.util.List;

import constants.Constants.Message;
import repository.character.Student;

public class IdInquiry {
	public void execute(int studentId, List<Student> studentList) throws IOException {

		for(Student student : studentList) {
			
			//入力されたIDかつ削除されていない生徒の情報を出力
			if(student.getStudentId() == (studentId) && student.getEnabled() == true) {
				
				//受験校
				System.out.println(student.getSchoolName());
				
				//名前
				Message.MESSAGE_OUTPUT01.showMessage();
				System.out.println(student.getStudentName());

				//合計点
				Message.MESSAGE_OUTPUT02.showMessage();
				System.out.println(student.getTotalScore());

				//合否
				Message.MESSAGE_OUTPUT03.showMessage();
				System.out.println(student.getResult() + "\n");
			}else {
				break;
			}
			
		}
	}
}