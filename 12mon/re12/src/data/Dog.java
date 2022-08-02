package data;

/**
 * 
 * 犬のデータクラス
 * @author nakama
 *
 */
public class Dog extends Animal {

	//データ取得
	public Dog(String name, int age, String color) {
		super(name, age, color);
	}

	//データ出力
	public void showData(int count) {
		System.out.print("【" + count + "匹目】");
		System.out.print("犬の" + name + "です！");
		System.out.print(age + "歳！");
		if (age >= 13) {
			System.out.print("長生きですね～");
		}
		System.out.print("\n");
	}
}
