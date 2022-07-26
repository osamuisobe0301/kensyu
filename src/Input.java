import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Input {

    List<DenpyoData> denpyoList = new ArrayList<DenpyoData>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public List<DenpyoData> showInput()throws IOException{
        for(int i=1;i<=3;i++){

            List<ItemData> itemList = new ArrayList<ItemData>(); 

            System.out.println(i + "枚目の伝票を記入してください。");
            System.out.print("顧客名→");
            String name = br.readLine();

            for(int j=1;j<=3;j++){               
                System.out.println("~" + j + "個目の商品~");

                System.out.print("商品名→");
                String itemName = br.readLine();

                System.out.print("金額→");
                String priceData = br.readLine();
                int price = Integer.parseInt(priceData);
                
                System.out.println("常温可:0、要冷蔵:1→");
                String selectNum = br.readLine();
                int num = Integer.parseInt(selectNum);

                itemList.add(new ItemData(itemName,price,num));
            }

            denpyoList.add(new DenpyoData(name,itemList));  
        }

        return denpyoList;
    }
}
