package data;

/**
 * 
 * 虎のデータクラス
 * @author nakama
 *
 */
public class Tiger extends Animal {

	//データ取得
	public Tiger(String name, int age, String color) {
		super(name, age, color);
	}

	//データ出力
	public void showData(int count) {
		System.out.print("【" + count + "匹目】");
		System.out.print("虎の" + name + "です！");
		System.out.print(age + "歳！");
		if (age >= 15) {
			System.out.print("長生きですね～");
		}
		System.out.print("\n");
	}
}
