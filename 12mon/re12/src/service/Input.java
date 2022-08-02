package service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import data.Animal;
import data.AnimalFactory;


/**
 * @author nakama
 *
 */
public class Input{

	/**
	 * データ入力(４匹)
	 * @return 入力したデータのリスト
	 * @throws IOException 例外
	 */
	public List<Animal> inputData()throws IOException{
		
		//入力した動物のデータが入るリスト
		List<Animal> animalList = new ArrayList<Animal>();
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//4匹分を入力
		for(int i=1;i<=4;i++){
			String color = null;
			System.out.println( i + "匹目の動物");
			System.out.println("動物の種類を選択してください(1:犬、2:虎、3:鳥)");
			String selectNum = br.readLine();
			System.out.println("名前を入力してください");
			String name = br.readLine();
			System.out.println("年齢を入力してください");
			String ageStr = br.readLine();
			int age = Integer.parseInt(ageStr);
			if("3".equals(selectNum)){
				System.out.println("色を入力してください。");
				color = br.readLine();
			}
			Animal animals;
			animals = AnimalFactory.create(selectNum,name,age,color);
			animalList.add(animals);
		}
		return animalList;
	}

}