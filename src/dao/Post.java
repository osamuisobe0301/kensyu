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
	
	/**
	 * ðEîñoÍ\bh
	 * @return ðEÉRÃ¢½îñ
	 */
	@Override
	public String toString() {
		System.out.println("ðE:" + this.postName + "\nðEID:" + this.postId + "\n¿" + this.salary + "\n");
		return super.toString();
	}
	
	
	

}
