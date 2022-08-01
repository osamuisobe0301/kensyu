package dto.shain;

/**
 * @author t.takagi
 */

/**
 * 社員の型
 */
public class ShainDto {

	//フィールド
	private String id;
	private String name;
	private String postId;
	private String postName;
	private int salary;
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPostId() {
		return postId;
	}
	public String getPostName() {
		return postName;
	}
	public int getSalary() {
		return salary;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	/**
	 * 社員情報を出力する
	 * @return ShainDto 社員情報
	 */
	@Override
	public String toString() {
		return "社員ID：" + id + "\n社員名:" + name + ",\n役職ID：" + postId + "\n役職名:" + postName + "\n給料："
				+ salary + "\n";
	}
	
	
}

