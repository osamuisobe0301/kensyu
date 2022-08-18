package service.dto;

import java.io.IOException;
import java.util.List;

import constants.Constants.Message;
import repository.character.Student;
import repository.dto.Service;
import service.parts.IdInquiry;
import util.Util;
import util.UtilPass;

public class InquiryStudent implements Service{

	@Override
	public List<Student> execute(List<Student> studentList) throws IOException {
		
		//合格設定インスタンス
		UtilPass utilPass = new UtilPass();
		
		//ID検索インスタンス
		IdInquiry idInquiry = new IdInquiry();
		
		//学校選択
		Message.MESSAGE_INQUIRY02.showMessage();
		String choiceSchool = Util.br.readLine();
		int figureChoiceSchool = Integer.parseInt(choiceSchool);

		
		//合格設定メソッド
		utilPass.ExamPass(figureChoiceSchool, studentList);
		
		//検索ID入力
		Message.MESSAGE_INQUIRY03.showMessage();
		String studentId = util.Util.br.readLine();

		
		//ID検索メソッド
		idInquiry.execute(studentId, studentList);
		
		
		return studentList;
	}
}

