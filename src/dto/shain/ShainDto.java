package dto.shain;

/**
 * @author t.takagi
 */

/**
 * ÐõÌ^
 */
public class ShainDto {

	//tB[h
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
	 * ÐõîñðoÍ·é
	 * @return ShainDto Ðõîñ
	 */
	@Override
	public String toString() {
		return "ÐõIDF" + id + "\nÐõ¼:" + name + ",\nðEIDF" + postId + "\nðE¼:" + postName + "\n¿F"
				+ salary + "\n";
	}
	
	
}

