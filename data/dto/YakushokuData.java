package data.dto;

public enum YakushokuData{

    TENCHO("999","“X’·"),
    MG("1","MG"),
    BAITO("2","ƒoƒCƒg");
    
    private String yakushokuId;
    private String yakushokuName;
    
    private YakushokuData(String yakushokuId , String yakushokuName){
        this.yakushokuId = yakushokuId;
        this.yakushokuName = yakushokuName;
    }
    
    public String getYakushokuId(){
        return this.yakushokuId;
    }
    
    public String getYakushokuName(){
        return this.yakushokuName;
    }
}