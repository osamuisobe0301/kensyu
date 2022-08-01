package dao;

/**
 * @author t.takagi
 */

/**
*　社員情報の型
*/
public class Shain {
	
	//フィールド
	private String shainId;
	private String shainName;
	private String postId;
	
	/**
	*　社員情報を初期化
	* @param shainId 社員ID, shainName　社員名, postId　役職ID
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
	