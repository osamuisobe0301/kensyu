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
		
		//���i�ݒ�C���X�^���X
		UtilPass utilPass = new UtilPass();
		
		//ID�����C���X�^���X
		IdInquiry idInquiry = new IdInquiry();
		
		//�w�Z�I��
		Message.MESSAGE_INQUIRY02.showMessage();
		String choiceSchool = Util.br.readLine();
		int figureChoiceSchool = Integer.parseInt(choiceSchool);

		
		//���i�ݒ胁�\�b�h
		utilPass.ExamPass(figureChoiceSchool, studentList);
		
		//����ID����
		Message.MESSAGE_INQUIRY03.showMessage();
		String studentId = util.Util.br.readLine();

		
		//ID�������\�b�h
		idInquiry.execute(studentId, studentList);
		
		
		return studentList;
	}
}

