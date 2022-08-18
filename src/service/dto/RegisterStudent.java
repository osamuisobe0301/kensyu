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
 * 生徒情報を入力させ生徒リストを生成して戻すクラス
 */
public class RegisterStudent implements Service{

	List<Student> List = new ArrayList<>();
	boolean flag = true;

	/**
	 *　生徒情報を入力させ生徒リストを生成して戻すメソッド
	 *　@return 生徒リスト
	 * @throws IOException 
	 */
	/**
	 * @throws DigitsNumber 
	 *
	 */
	public List<Student> execute(List<Student> studentlList) throws IOException{
		
		//Utilのインスタンス
		Util util = new Util();
		
		//引数のリストをフィールドに設定
		this.List = studentlList;
	
		
		//endと入力されるまでループ
		while(flag) {
		
		//生徒ID入力
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
		
		
		
		
		
		//生徒名入力
		Message.MESSAGE_INPUT01.showMessage();
		String studentName = Util.br.readLine();

		//国語の点数を入力
		Message.MESSAGE_INPUT03.showMessage();
		String japaneseScore = Util.br.readLine();
		int figureJapaneseScore = Integer.parseInt(japaneseScore);

		//英語の点数を入力
		Message.MESSAGE_INPUT04.showMessage();
		String englishScore = Util.br.readLine();
		int figureEnglishScore = Integer.parseInt(englishScore);

		//数学の点数を入力
		Message.MESSAGE_INPUT05.showMessage();
		String mathScore = Util.br.readLine();
		int figureMathScore = Integer.parseInt(mathScore);

		//　合計点を計算するメソッドを呼び出す
		int totalScore = util.calcOutput(figureJapaneseScore, figureEnglishScore, figureMathScore);

		//リストに生徒インスタンス追加
		List.add(new Student(figureStudentId, studentName, figureJapaneseScore,figureEnglishScore, figureMathScore, totalScore));
		
		//ループを終了させるメソッド
		Message.MESSAGE_PROGRESS01.showMessage();
		flag = util.stop();
	}
		return List;
	}














