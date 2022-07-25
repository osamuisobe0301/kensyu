package repository.dto;

import constants.Constants;

/**
 * 社員の論理データクラス
 */
public class Shain{
	private String Id;
	private String name;
	private String postId;
	private String postName;
	private int salary;
	private double bonus = 0;
	/**
	 * 社員論理データクラスのコンストラクタ
	 */
	public Shain(String name, String id, String postName, String postId, int salary) {
		Id = id;
		this.name = name;
		this.postId = postId;
		this.postName = postName;
		this.salary = salary;
	}
	/**
	 * 社員IDのゲッターメソッド
	 */
	public String getId() {
		return Id;
	}
	/**
	 * 社員名のゲッターメソッド
	 */
	public String getName() {
		return name;
	}
	/**
	 * 役職IDのゲッターメソッド
	 */
	public String getPostId() {
		return postId;
	}
	/**
	 * 役職名のゲッターメソッド
	 */
	public String getPost() {
		return postName;
	}
	/**
	 *　給与のゲッターメソッド
	 */
	public int getSalary() {
		Constants.Message.MESSAGE_SHAIN03.showMessage();
		return salary;
	}
	/**
	 * 社員名の出力メソッド
	 */
	public void getNameOutput() {
		Constants.Message.MESSAGE_SHAIN01.showMessage();
		System.out.println(name);
	}
	/**
	 * 役職名の出力メソッド
	 */
	public void getPostOutput() {
		Constants.Message.MESSAGE_SHAIN02.showMessage();
		System.out.println(postName);
	}
	/**
	 * 社員IDの出力メソッド
	 */
	public void getSalaryOutput() {
		Constants.Message.MESSAGE_SHAIN03.showMessage();
		System.out.println(salary);
		calc();
	}

	/**
	 * ボーナスの計算と出力メソッド
	 */
	public void calc() {
		switch(getPostId()) {
		case "01":
			bonus = salary * 2.0;
			break;
		case "02":
			bonus = salary * 2.5;
			break;
		case "03":
			bonus = salary * 3.0;
			break;
		}
		Constants.Message.MESSAGE_SHAIN04.showMessage();
		System.out.println(bonus);
	}
	/**
	 * まとめて社員情報を出力するメソッド
	 */
	public void outputInformation() {
		getNameOutput();
		getPostOutput();
		getSalaryOutput();
	}
	
}
