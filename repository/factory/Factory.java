package repository.factory;


import java.util.ArrayList;
import java.util.List;

import repository.dto.Shain;
public class Factory {
	static List<Shain> ShainList = new ArrayList<>();

	public static void createList() {
		Shain nakama = new Shain("�ｿｽ�ｿｽ�ｿｽ�ｿｽ", "001", "�ｿｽW�ｿｽ�ｿｽ", "03", 100000);
		Shain takagi = new Shain("�ｿｽ�ｿｽ�ｿｽ�ｿｽ", "002", "�ｿｽW�ｿｽ�ｿｽ", "03", 100000);
		Shain nakano = new Shain("�ｿｽ�ｿｽ�ｿｽ�ｿｽ", "003", "�ｿｽW�ｿｽ�ｿｽ", "03", 100000);
		Shain isobe = new Shain("�ｿｽ�ｿｽ�ｿｽ�ｿｽ", "004", "�ｿｽ�ｿｽC", "02", 50000);
		Shain shimizu = new Shain("�ｿｽE�ｿｽ�ｿｽ", "005", "�ｿｽ�ｿｽC", "02", 50000);
		Shain hukusako = new Shain("�ｿｽ�ｿｽ�ｿｽ�ｿｽ", "006", "�ｿｽ�ｿｽ�ｿｽ", "01", 30000);
		Shain nakamura = new Shain("�ｿｽ�ｿｽ�ｿｽ�ｿｽ", "007", "�ｿｽ�ｿｽ�ｿｽ", "01", 30000);

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

