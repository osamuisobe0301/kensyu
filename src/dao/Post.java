package dao;

/**
 * @author t.takagi
 */

/**
 *@๐E๎๑ฬ^
 */
public class Post {

	//tB[h
	String postName;
	String postId;
	int salary;

	/**
	 *@๐E๎๑ฬ๚ป
	 * @param postId ๐EID, postName@๐Eผ, salary@ฟ
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
