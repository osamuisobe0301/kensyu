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
 * �R���g���[���[�N���N���X
 */
public class Controller {
	
	//�󌱐����X�g
	public List<Student> studentList = new ArrayList<>();
	
	//�N���N���X
	public void start() throws IOException {
		boolean flag = true;
		
		Util util = new Util();
		
		while(flag) {

			//���s���郁�j���[��I��
			Message.MESSAGE_MENU01.showMessage();
			String menu = Util.br.readLine();
			
			//���͂��ꂽ���j���[�ԍ��ɊY�����郁�j���[�𐶐�
			Service service = ServiceFactory.create(menu);

			//���j���[�����s����
			studentList = service.execute(studentList);
			
			Message.MESSAGE_MENU02.showMessage();

			flag = util.stop();
		}
	}
}






































/*�w�Z���X�g�𐶐����Ė߂�
	List<SchoolImpl> schoolList = SchoolFactory.schoolListReturn();


	InputStudent inputStudent = new InputStudent();
	List<Student> studentList = inputStudent.input();

	Pass pass = new Pass();
	pass.judgePass(studentList);

	//���k�����̓C���X�^���X�𐶐�
	/*RepeatInput repeatInput = new RepeatInput();

	//���k�̏�����͂����Đ��k���X�g�𐶐����߂�
	List<Student> StudentList = repeatInput.inputAll();


	}
}*/
