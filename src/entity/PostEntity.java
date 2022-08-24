package entity;


/**
 * ��E���̃e�[�u���̌^
 * @author t.takagi
 */
public class PostEntity{
    
    //��E���̗v�f
    private String postName;
    private String postId;
    
    /**
     * ��E���̏������̐ݒ�
     */
    public PostEntity(String postId, String postName){
        this.postName = postName;
        this.postId = postId;
    }
    
    /**
     * ��E�����擾����
     * @return postId ��EID
     */
    public String getPostId(){
        return this.postId;
    }
    
    /**
     * ��E�����擾����
     * @return postName ��E��
     */
    public String getPostName(){
        return this.postName;
    }
}