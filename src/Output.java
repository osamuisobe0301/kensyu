import java.util.List;

public class Output {

    String itemData;
    Boolean chilledFlag = false;
    int i;
    int sumPrice;

    public void show(List<DenpyoData> denpyoList){
        for(DenpyoData denpyo : denpyoList){
            List<ItemData> itemList = denpyo.getItemList();
            System.out.println("顧客名：" + denpyo.getName());
            
            String[] itemStrings = new String[3];
            i = 0;
            sumPrice = 0;
            for(ItemData item : itemList){
                itemStrings[i] = item.getName() + "/" + item.getPrice() +"円";
                sumPrice += item.getPrice();
                if(item.getChilledFlag()){
                    this.chilledFlag = true;
                }
                i++;
            }
            this.itemData = String.join("、",itemStrings[0],itemStrings[1],itemStrings[2]);
            System.out.println("購入商品：" + itemData);
            System.out.println("合計金額：" + sumPrice);
            if(this.chilledFlag){
                System.out.println("!要冷蔵の商品が含まれています");
            }
            System.out.println("========================");
        }
    }
}
