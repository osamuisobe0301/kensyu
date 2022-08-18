package service.parts;

import java.io.IOException;
import java.util.List;

import constants.Constants.Message;
import repository.character.Student;

public class IdInquiry {
	public void execute(int studentId, List<Student> studentList) throws IOException {

		for(Student student : studentList) {
			
			//���͂��ꂽID���폜����Ă��Ȃ����k�̏����o��
			if(student.getStudentId() == (studentId) && student.getEnabled() == true) {
				
				//�󌱍Z
				System.out.println(student.getSchoolName());
				
				//���O
				Message.MESSAGE_OUTPUT01.showMessage();
				System.out.println(student.getStudentName());

				//���v�_
				Message.MESSAGE_OUTPUT02.showMessage();
				System.out.println(student.getTotalScore());

				//����
				Message.MESSAGE_OUTPUT03.showMessage();
				System.out.println(student.getResult() + "\n");
			}else {
				break;
			}
			
		}
	}
}