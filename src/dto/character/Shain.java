package dto.character;


/**
*　生徒の論理データクラス
*/
public class Shain {
	private String id;
	private String name;
	private String postId;
	
	public Shain(String id, String name, String postId) {
		super();
		this.id = id;
		this.name = name;
		this.postId = postId;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPostId() {
		return postId;
	}
	
	
	@Override
	public String toString() {
		return "Shain [id=" + id + ", name=" + name + ", postId=" + postId + "]";
	}
	
	
	
}
	