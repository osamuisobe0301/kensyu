package dto.shain;

/**
 * @author t.takagi
 */

/**
 * �Ј��̌^
 */
public class ShainDto {

	//�t�B�[���h
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
	 * �Ј������o�͂���
	 * @return ShainDto �Ј����
	 */
	@Override
	public String toString() {
		return "�Ј�ID�F" + id + "\n�Ј���:" + name + ",\n��EID�F" + postId + "\n��E��:" + postName + "\n�����F"
				+ salary + "\n";
	}
	
	
}

