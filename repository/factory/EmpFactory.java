package repository.factory;

import java.util.ArrayList;
import java.util.List;
import repository.dto.Shain;
/**
 * 社員リストを作成するクラス
 */
public class EmpFactory {
	static List<Shain> ShainList = new ArrayList<>();
	
	/**
	 * 社員リストを作成するメソッド
	 */
	public EmpFactory(){
		//コンストラクタを初期化
		Shain nakama = new Shain("仲間", "001", "係長", "03", 100000);
		Shain takagi = new Shain("高木", "002", "係長", "03", 100000);
		Shain nakano = new Shain("中野", "003", "係長", "03", 100000);
		Shain isobe = new Shain("清水", "004", "主任", "02", 50000);
		Shain shimizu = new Shain("礒辺", "005", "主任", "02", 50000);
		Shain hukusako = new Shain("福迫", "006", "一般", "01", 30000);
		Shain nakamura = new Shain("中村", "007", "一般", "01", 30000);
		
		//社員リストに社員を追加
		ShainList.add(nakama);
		ShainList.add(takagi);
		ShainList.add(nakano);
		ShainList.add(isobe);
		ShainList.add(shimizu);
		ShainList.add(hukusako);
		ShainList.add(nakamura);
	}
	
	/**
	 * 社員リストを戻り値で戻すメソッド
	 * @return 社員リスト
	 */
	public List<Shain> createListReturn(){
		return ShainList;
	}
}
