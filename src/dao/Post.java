package dao;

/**
 * @author t.takagi
 */

/**
 *�@��E���̌^
 */
public class Post {

	//�t�B�[���h
	String postName;
	String postId;
	int salary;

	/**
	 *�@��E���̏�����
	 * @param postId ��EID, postName�@��E��, salary�@����
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
