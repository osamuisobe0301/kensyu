package dao;

public class Post {
	String postName;
	String postId;
	int salary;
	public Post(String postId, String postName, int salary) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.salary = salary;
		
		
	}
	public void output() {
		
	}
	@Override
	public String toString() {
		System.out.println("��E:" + this.postName + "\n��EID:" + this.postId + "\n����" + this.salary + "\n");
		return super.toString();
	}
	
	
	

}
