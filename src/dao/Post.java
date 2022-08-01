package dao;

/**
 * @author t.takagi
 */

/**
 *　役職情報の型
 */
public class Post {

	//フィールド
	String postName;
	String postId;
	int salary;

	/**
	 *　役職情報の初期化
	 * @param postId 役職ID, postName　役職名, salary　給料
	 */
	public Post(String postId, String postName, int salary) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.salary = salary;
	}

	public String getPostName() {
		return postName;
	}

	public String getPostId() {
		return postId;
	}

	public int getSalary() {
		return salary;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
