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
	 * –ğEî•ño—Íƒƒ\ƒbƒh
	 * @return –ğE‚É•R‚Ã‚¢‚½î•ñ
	 */
	@Override
	public String toString() {
		System.out.println("–ğE:" + this.postName + "\n–ğEID:" + this.postId + "\n‹‹—¿" + this.salary + "\n");
		return super.toString();
	}
	
	
	

}
