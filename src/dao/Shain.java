package dao;

/**
 * @author t.takagi
 */

/**
*�@�Ј����̌^
*/
public class Shain {
	
	//�t�B�[���h
	private String shainId;
	private String shainName;
	private String postId;
	
	/**
	*�@�Ј�����������
	* @param shainId �Ј�ID, shainName�@�Ј���, postId�@��EID
	*/
	public Shain(String shainId, String shainName, String postId) {
		super();
		this.shainId = shainId;
		this.shainName = shainName;
		this.postId = postId;
	}

	public String getId() {
		return shainId;
	}

	public String getName() {
		return shainName;
	}

	public String getPostId() {
		return postId;
	}
	
	
	public void setId(String id) {
		this.shainId = id;
	}

	public void setName(String name) {
		this.shainName = name;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}
	
}
	