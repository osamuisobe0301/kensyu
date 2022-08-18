package service.dto;

import java.io.IOException;
import java.util.List;

import constants.Constants.Message;
import repository.character.Student;
import repository.dto.Service;
import util.Util;

public class DeleteStudent implements Service{
	
	@Override
	public List<Student> execute(List<Student> studentList) throws IOException {
		
		//�폜���鐶�kID�����
		Message.MESSAGE_INQUIRY03.showMessage();
		String deleteId = Util.br.readLine();
		
		//���͂������kID�ɊY��������̂�false
		for(Student student : studentList) {
			if(student.getStudentId().equals(deleteId)) {
				Message.MESSAGE_DELETE01.showMessage();
				student.setEnabled(false);
			}else {
				System.out.println(123);
			}
		}
		return studentList;
	}
}
