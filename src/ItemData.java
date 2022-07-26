public class ItemData {

    String itemName;
    int price;
    Boolean chilledFlag = false;

    public ItemData(String itemName,int price,int selectNum){
        this.itemName = itemName;
        this.price = price;
        if(selectNum == 1){
            this.chilledFlag = true;
        }
    }

    public String getName(){
        return this.itemName;
    }

    public Integer getPrice(){
        return this.price;
    }

    public Boolean getChilledFlag(){
        return this.chilledFlag;
    }
    
}
