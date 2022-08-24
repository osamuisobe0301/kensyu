package dto;
/**
 * Ğˆõ‚ÌŒ^
 * @author t,takagi
 */
public class ShainDto{
    
    //Ğˆõî•ñ‚Ì—v‘f‚ğ’è‹`‚·‚é
    private String shainName;
    private int salary;
    private String companyName;
    private String companyId;
    private String postName;
    private String postId;
    
    /**
     * Ğˆõî•ñ‚ğ‰Šú‰»‚·‚é
     */
    public ShainDto(String shainName, int salary, String companyName, String companyId, String postName, String postId){
        
        this.shainName = shainName;
        this.salary = salary;
        this.companyName = companyName;
        this.companyId = companyId;
        this.postName = postName;
        this.postId = postId;
    }
    
    /**
     * ‰ïĞ‚ÌID‚ğæ“¾‚·‚é
     */
    public String getCompanyId(){
        return this.companyId;
    }
    
    /**
     * –ğEID‚ğæ“¾‚·‚é
     */
    public String getPostId(){
        return this.postId;
    }
    
    /**
     * Ğˆõî•ñ‚ğo—Í‚·‚é
     * @Override
     * @return o—Í‚·‚éĞˆõî•ñ
     */
	public String toString() {
		return "‰ïĞ–¼" + companyName +"\nĞˆõ–¼:" + shainName + "\n–ğE–¼:" + postName + "\n‹‹—¿F" + salary + "\n";
	}

    
    
    
}