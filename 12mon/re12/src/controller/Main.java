package controller;

import java.io.IOException;
import java.util.List;

import data.Animal;
import service.Input;

public class Main{

    /**
    * mainメソッド
    * inputDataメソッドの戻り値で動物リストを受け取る
    * getChoiceNumメソッドでキーを受け取る
    * showDataメソッドに引数を持たせて結果を出力
	* @param args
	* @throws IOException
	*/
	public static void main(String[] args)throws IOException{
		
		//入力クラス
		Input input = new Input();
		
		//入力されたデータのリストを受け取る
		List<Animal> animalList = input.inputData();
		
		//匹数カウント初期値
		int count = 1;
		
		//結果出力
		for(Animal animals : animalList){
			animals.showData(count);
			count++;
		}
	}

}