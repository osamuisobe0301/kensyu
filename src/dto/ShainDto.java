package dto;
/**
 * 社員の型
 * @author t,takagi
 */
public class ShainDto{
    
    //社員情報の要素を定義する
    private String shainName;
    private int salary;
    private String companyName;
    private String companyId;
    private String postName;
    private String postId;
    
    /**
     * 社員情報を初期化する
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
     * 会社のIDを取得する
     */
    public String getCompanyId(){
        return this.companyId;
    }
    
    /**
     * 役職IDを取得する
     */
    public String getPostId(){
        return this.postId;
    }
    
    /**
     * 社員情報を出力する
     * @Override
     * @return 出力する社員情報
     */
	public String toString() {
		return "会社名" + companyName +"\n社員名:" + shainName + "\n役職名:" + postName + "\n給料：" + salary + "\n";
	}

    
    
    
}