package dto.character;


/**
*�@���k�̘_���f�[�^�N���X
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
	
	
	/**
	 * �Ј����o�̓��\�b�h
	 * @return �Ј����
	 */
	@Override
	public String toString() {
		System.out.println("�Ј�ID:" + this.id + "\n�Ј���:" + this.name);
		return super.toString();
	}
	
	
	
}
	