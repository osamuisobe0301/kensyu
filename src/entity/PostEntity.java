package entity;


/**
 * ðEîñÌe[uÌ^
 * @author t.takagi
 */
public class PostEntity{
    
    //ðEîñÌvf
    private String postName;
    private String postId;
    
    /**
     * ðEîñÌú»ÌÝè
     */
    public PostEntity(String postId, String postName){
        this.postName = postName;
        this.postId = postId;
    }
    
    /**
     * ðEîñðæ¾·é
     * @return postId ðEID
     */
    public String getPostId(){
        return this.postId;
    }
    
    /**
     * ðE¼ðæ¾·é
     * @return postName ðE¼
     */
    public String getPostName(){
        return this.postName;
    }
}