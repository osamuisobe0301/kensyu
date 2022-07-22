package repository.dto;

import constants.Constants;

public class Shain{
	private String Id;
	private String name;
	private String postId;
	private String postName;
	private int salary;
	private double bonus = 0;
	
	public Shain(String name, String id, String postName, String postId, int salary) {
		Id = id;
		this.name = name;
		this.postId = postId;
		this.postName = postName;
		this.salary = salary;
	}
	public String getId() {
		return Id;
	}
	public String getName() {
		Constants.Message.MESSAGE_SHAIN01.showMessage();
		System.out.println(name);
		return name;
	}
	public String getPostId() {
		return postId;
	}
	public String getPost() {
		Constants.Message.MESSAGE_SHAIN02.showMessage();
		System.out.println(postName);
		return postName;
	}
	public int getSalary() {
		Constants.Message.MESSAGE_SHAIN03.showMessage();
		System.out.println(salary);
		calc();
		return salary;
	}
	// ボーナス計算メソッド
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
	// 全情報出力メソッド
	public void outputInformation() {
		getName();
		getPost();
		getSalary();
	}
	
}
