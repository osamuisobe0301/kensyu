package data;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 動物データ(抽象クラス)
 * @author nakama
 *
 */
public abstract class Animal {

	//ペットの名前
	String name;
	
	//ペットの年齢
	int age;
	
	//ペットの色
	String color = null;
	
	//キーに合わせた動物のデータクラスを割り当てる
	public static Animal create(String key,String name,int age,String color) {
		Map<String, Animal> animalMap = new HashMap<String, Animal>();
		animalMap.put("1", new Dog(name,age,color));
		animalMap.put("2", new Tiger(name,age,color));
		animalMap.put("3", new Bird(name,age,color));

		return animalMap.get(key);
	}
	
	//データ取得
	public Animal(String name,int age,String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	//データ出力
	public abstract void showData(int count);
}
