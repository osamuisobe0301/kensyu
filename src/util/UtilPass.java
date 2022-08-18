package util;

import java.util.List;

import constants.Constants.PassScore;
import repository.character.Student;

public class UtilPass {
	/**
	 *@’†‰›‚Z@‡Ši”»’fƒƒ\ƒbƒh
	 */
	public void ExamPass(int choicePass, List<Student> studentList){
		if(choicePass == 1) {
			for(Student student : studentList) {
				student.setSchoolName("’†‰›‚Z");
				if(PassScore.WESTSCHOOL02_TOTAL_PASSSCORE.showMessage() <  student.getTotalScore()) {
					
					student.setResult("‡Ši");
				}else{
					student.setResult("•s‡Ši");
				}
			}
			/**
			 *@¼‚Z@‡Ši”»’fƒƒ\ƒbƒh
			 */
		}else if(choicePass == 2) {
			for(Student student : studentList) {
				student.setSchoolName("¼‚Z");
				if(PassScore.WESTSCHOOL02_TOTAL_PASSSCORE.showMessage() <  student.getTotalScore() && PassScore.WESTSCHOOL02_ENGLISH_PASSSCORE.showMessage() < student.getFigureEnglishScore()) {
					student.setResult("‡Ši");;
				}else{
					student.setResult("•s‡Ši");
				}
			}
		}
	}
}

