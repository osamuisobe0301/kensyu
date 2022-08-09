package data.dto;

/**
*
*ShainDto Ðõf[^ðÛµ½NX
*@author nakama
*
*/
public class ShainDto{

	//ÐõID
	String shainId;
	
	//¼O
	String name;
	
	//ðEID
	String yakushokuId;
	
	//ðE¼
	String yakushokuName;
	
	//
	int timeSalary;
	
	//pX[h
	String password;
	
	
	public ShainDto(String shainId,String name,YakushokuData yakushoku,int timeSalary,String password){
	
	    //ÐõID
		this.shainId = shainId;
	    
	    //¼O
		this.name = name;
	    
	    //ðEID
		this.yakushokuId = yakushoku.getYakushokuId();
	    
	    //ðE¼
		this.yakushokuName = yakushoku.getYakushokuName();
	    
	    //
		this.timeSalary = timeSalary;
	    
	    //pX[h
		this.password = password;
		
	}
    
    //ÐõIDæ¾
    public String getShainId(){
        return this.shainId;
    }
    
    //¼Oæ¾
    public String getName(){
        return this.name;
    }
    
    //ðEIDæ¾
    public String getYakushokuId(){
        return this.yakushokuId;
    }
    
    //ðE¼æ¾
    public String getYakushokuName(){
        return this.yakushokuName;
    }
    
    //æ¾
    public int getTimeSalary(){
        return this.timeSalary;
    }
    
    //pX[hæ¾
    public String getPassword(){
        return this.password;
    }

}