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

            System.out.println(i + "���ڂ̓`�[���L�����Ă��������B");
            System.out.print("�ڋq����");
            String name = br.readLine();

            for(int j=1;j<=3;j++){               
                System.out.println("~" + j + "�ڂ̏��i~");

                System.out.print("���i����");
                String itemName = br.readLine();

                System.out.print("���z��");
                String priceData = br.readLine();
                int price = Integer.parseInt(priceData);
                
                System.out.println("�퉷��:0�A�v�①:1��");
                String selectNum = br.readLine();
                int num = Integer.parseInt(selectNum);

                itemList.add(new ItemData(itemName,price,num));
            }

            denpyoList.add(new DenpyoData(name,itemList));  
        }

        return denpyoList;
    }
}
