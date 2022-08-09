package data.dto;

/**
*
*ShainDto 社員データを保持したクラス
*@author nakama
*
*/
public class ShainDto{

	//社員ID
	String shainId;
	
	//名前
	String name;
	
	//役職ID
	String yakushokuId;
	
	//役職名
	String yakushokuName;
	
	//時給
	int timeSalary;
	
	//パスワード
	String password;
	
	
	public ShainDto(String shainId,String name,YakushokuData yakushoku,int timeSalary,String password){
	
	    //社員ID
		this.shainId = shainId;
	    
	    //名前
		this.name = name;
	    
	    //役職ID
		this.yakushokuId = yakushoku.getYakushokuId();
	    
	    //役職名
		this.yakushokuName = yakushoku.getYakushokuName();
	    
	    //時給
		this.timeSalary = timeSalary;
	    
	    //パスワード
		this.password = password;
		
	}
    
    //社員ID取得
    public String getShainId(){
        return this.shainId;
    }
    
    //名前取得
    public String getName(){
        return this.name;
    }
    
    //役職ID取得
    public String getYakushokuId(){
        return this.yakushokuId;
    }
    
    //役職名取得
    public String getYakushokuName(){
        return this.yakushokuName;
    }
    
    //時給取得
    public int getTimeSalary(){
        return this.timeSalary;
    }
    
    //パスワード取得
    public String getPassword(){
        return this.password;
    }

}