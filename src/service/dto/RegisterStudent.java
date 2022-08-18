package service.dto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import constants.Constants.Message;
import exception.DigitsNumber;
import repository.character.Student;
import repository.dto.Service;
import util.Util;


/**
 * ���k������͂������k���X�g�𐶐����Ė߂��N���X
 */
public class RegisterStudent implements Service{

	List<Student> List = new ArrayList<>();
	boolean flag = true;

	/**
	 *�@���k������͂������k���X�g�𐶐����Ė߂����\�b�h
	 *�@@return ���k���X�g
	 * @throws IOException 
	 */
	/**
	 * @throws DigitsNumber 
	 *
	 */
	public List<Student> execute(List<Student> studentlList) throws IOException{
		
		//Util�̃C���X�^���X
		Util util = new Util();
		
		//�����̃��X�g���t�B�[���h�ɐݒ�
		this.List = studentlList;
	
		
		//end�Ɠ��͂����܂Ń��[�v
		while(flag) {
		
		//���kID����
		Message.MESSAGE_INPUT00.showMessage();
		int figureStudentId;
		try {
		String studentId = Util.br.readLine();
		figureStudentId = Integer.parseInt(studentId);
		if(String.valueOf(figureStudentId).length() > 4) {
			throw new DigitsNumber();
		}
		}catch(DigitsNumber e){
			Message.MESSAGE_INPUT01.showMessage();
		}
		
		
		
		
		
		//���k������
		Message.MESSAGE_INPUT01.showMessage();
		String studentName = Util.br.readLine();

		//����̓_�������
		Message.MESSAGE_INPUT03.showMessage();
		String japaneseScore = Util.br.readLine();
		int figureJapaneseScore = Integer.parseInt(japaneseScore);

		//�p��̓_�������
		Message.MESSAGE_INPUT04.showMessage();
		String englishScore = Util.br.readLine();
		int figureEnglishScore = Integer.parseInt(englishScore);

		//���w�̓_�������
		Message.MESSAGE_INPUT05.showMessage();
		String mathScore = Util.br.readLine();
		int figureMathScore = Integer.parseInt(mathScore);

		//�@���v�_���v�Z���郁�\�b�h���Ăяo��
		int totalScore = util.calcOutput(figureJapaneseScore, figureEnglishScore, figureMathScore);

		//���X�g�ɐ��k�C���X�^���X�ǉ�
		List.add(new Student(figureStudentId, studentName, figureJapaneseScore,figureEnglishScore, figureMathScore, totalScore));
		
		//���[�v���I�������郁�\�b�h
		Message.MESSAGE_PROGRESS01.showMessage();
		flag = util.stop();
	}
		return List;
	}














