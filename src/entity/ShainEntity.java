package entity;
/**
 * @author t.takagi
 * 社員情報のテーブルの型
 */
public class ShainEntity{
    
    //社員情報の要素
    private String shainName;
    private int salary;
    private String companyId;
    private String postId;
    
    /**
     * 社員情報のテーブルの初期化の設定
     */
    public ShainEntity(String shainName, int salary, String companyId, String postId){
        this.shainName = shainName;
        this.salary = salary;
        this.companyId = companyId;
        this.postId = postId;
    }
    
    /**
     * 社員名を取得する
     * @return shainName 社員名
     */
    public String getShainName(){
        return this.shainName;
    }
    
    /**
     * 社員の給料を取得する
     * @return salary 社員の給料
     */
    public int getSalary(){
        return this.salary;
    }
    
    /**
     * 社員の会社IDを取得する
     * @return companyId 社員の会社ID
     */
	public String getCompanyId() {
		return companyId;
	}
	
    /**
     * 社員の役職IDを取得する
     * @return postId 役職ID
     */
	public String getPostId() {
		return postId;
	}
}