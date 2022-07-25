package repository.factory;


import java.util.ArrayList;
import java.util.List;

import repository.dto.Shain;
public class Factory {
	static List<Shain> ShainList = new ArrayList<>();

	public static void createList() {
		Shain nakama = new Shain("仲間", "001", "係長", "03", 100000);
		Shain takagi = new Shain("高木", "002", "係長", "03", 100000);
		Shain nakano = new Shain("中野", "003", "係長", "03", 100000);
		Shain isobe = new Shain("清水", "004", "主任", "02", 50000);
		Shain shimizu = new Shain("礒辺", "005", "主任", "02", 50000);
		Shain hukusako = new Shain("福迫", "006", "一般", "01", 30000);
		Shain nakamura = new Shain("中村", "007", "一般", "01", 30000);

		ShainList.add(nakama);
		ShainList.add(takagi);
		ShainList.add(nakano);
		ShainList.add(isobe);
		ShainList.add(shimizu);
		ShainList.add(hukusako);
		ShainList.add(nakamura);
	}
	public static List<Shain> createListReturn(){
		return ShainList;
	}
}
