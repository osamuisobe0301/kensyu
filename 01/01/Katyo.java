// 課長クラス
public class Katyo implements IHuman{
    
    public int bonus; // ボーナス額
    HumanDto data = new HumanDto("田中", "課長", 40);
    
    // ボーナスを処理するメソッド
    public int totalBonus(){
        bonus = data.getSalary() * 2;
        return bonus;
    }
    
    // 情報を出力するメソッド
    public void show(){
        Constants.MESSAGE01.show(data.getName(), data.getJobName(), data.getSalary(), this.totalBonus());
    }
}

