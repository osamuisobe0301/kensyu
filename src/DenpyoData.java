import java.util.List;

public class DenpyoData {
    
    String name;
    List<ItemData> itemList;

    public DenpyoData(String name,List<ItemData> itemList){
        this.name = name;
        this.itemList = itemList;
    }

    public String getName(){
        return this.name;
    }

    public List<ItemData> getItemList(){
        return this.itemList;
    }
    
}
