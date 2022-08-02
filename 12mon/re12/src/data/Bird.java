package data;

/**
 * 
 * 鳥のデータクラス
 * @author nakama
 *
 */
public class Bird extends Animal {

	//データ取得
	public Bird(String name, int age, String color) {
		super(name, age, color);
	}

	//データ出力
	public void showData(int count) {
		System.out.print("【" + count + "匹目】");
		System.out.print(color + "の鳥の" + name + "です！");
		System.out.print(age + "歳！");
		if (age >= 11) {
			System.out.print("長生きですね～");
		}
		System.out.print("\n");
	}
}
