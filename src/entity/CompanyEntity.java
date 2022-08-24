package entity;


/**
 * @author t.takagi
 * 会社情報のテーブルの型
 */
public class CompanyEntity{
    
    //会社情報の要素
    private String companyName;
    private String companyId;
    
    /**
     *会社情報を初期化する
     */
    public CompanyEntity(String companyId, String companyName){
        this.companyName = companyName;
        this.companyId = companyId;
    }
    
    /**
     * 会社のIDを取得する
     * @return companyId 会社ID
     */ 
    public String getCompanyId(){
        return this.companyId;
    }
    
    /**
     * 会社の名前を取得する
     * @return companyName 会社の名前
     */
    public String getCompanyName(){
        return this.companyName;
    }
}