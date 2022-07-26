import java.util.List;

public class Output {

    String itemData;
    Boolean chilledFlag = false;
    int i;
    int sumPrice;

    public void show(List<DenpyoData> denpyoList){
        for(DenpyoData denpyo : denpyoList){
            List<ItemData> itemList = denpyo.getItemList();
            System.out.println("�ڋq���F" + denpyo.getName());
            
            String[] itemStrings = new String[3];
            i = 0;
            sumPrice = 0;
            for(ItemData item : itemList){
                itemStrings[i] = item.getName() + "/" + item.getPrice() +"�~";
                sumPrice += item.getPrice();
                if(item.getChilledFlag()){
                    this.chilledFlag = true;
                }
                i++;
            }
            this.itemData = String.join("�A",itemStrings[0],itemStrings[1],itemStrings[2]);
            System.out.println("�w�����i�F" + itemData);
            System.out.println("���v���z�F" + sumPrice);
            if(this.chilledFlag){
                System.out.println("!�v�①�̏��i���܂܂�Ă��܂�");
            }
            System.out.println("========================");
        }
    }
}
