package repository.dto;

import constants.Constants.Message;
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
		Message.MESSAGE_SHAIN03.showMessage();
		return salary;
	}
	
	/**
	 *　ボーナスのゲッターメソッド
	 */
	public double getBonus() {
		return bonus;
	}
	
	/**
	 *　ボーナスのセッターメソッド
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	/**
	 * 社員名の出力メソッド
	 */
	public void getNameOutput() {
		Message.MESSAGE_SHAIN01.showMessage();
		System.out.println(name);
	}
	/**
	 * 役職名の出力メソッド
	 */
	public void getPostOutput() {
		Message.MESSAGE_SHAIN02.showMessage();
		System.out.println(postName);
	}
	/**
	 * 給料の出力メソッド
	 */
	public void getSalaryOutput() {
		Message.MESSAGE_SHAIN03.showMessage();
		System.out.println(salary);
	}

	
	/**
	 * 社員名、役職名、給料を出力するメソッド
	 */
	public void outputInformation() {
		getNameOutput();
		getPostOutput();
		getSalaryOutput();
	}

}
