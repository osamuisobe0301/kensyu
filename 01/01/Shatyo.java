// 社長クラス
public class Shatyo implements IHuman{
    
    public int bonus; // ボーナス額
    HumanDto data = new HumanDto("山田", "社長", 80);
    
    // ボーナスを計算するメソッド
    public int totalBonus(){
        return bonus;
    }
    
    // 情報を出力するメソッド
    public void show(){
        Constants.MESSAGE01.show(data.getName(), data.getJobName(), data.getSalary(), this.totalBonus());
    }
}
