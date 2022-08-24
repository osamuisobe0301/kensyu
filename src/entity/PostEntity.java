package entity;


/**
 * –ğEî•ñ‚Ìƒe[ƒuƒ‹‚ÌŒ^
 * @author t.takagi
 */
public class PostEntity{
    
    //–ğEî•ñ‚Ì—v‘f
    private String postName;
    private String postId;
    
    /**
     * –ğEî•ñ‚Ì‰Šú‰»‚Ìİ’è
     */
    public PostEntity(String postId, String postName){
        this.postName = postName;
        this.postId = postId;
    }
    
    /**
     * –ğEî•ñ‚ğæ“¾‚·‚é
     * @return postId –ğEID
     */
    public String getPostId(){
        return this.postId;
    }
    
    /**
     * –ğE–¼‚ğæ“¾‚·‚é
     * @return postName –ğE–¼
     */
    public String getPostName(){
        return this.postName;
    }
}