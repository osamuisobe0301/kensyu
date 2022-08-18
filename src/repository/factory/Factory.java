package repository.factory;


import java.util.ArrayList;
import java.util.List;

import repository.dto.Shain;
public class Factory {
	static List<Shain> ShainList = new ArrayList<>();

	public static void createList() {
		Shain nakama = new Shain("����", "001", "�W��", "03", 100000);
		Shain takagi = new Shain("����", "002", "�W��", "03", 100000);
		Shain nakano = new Shain("����", "003", "�W��", "03", 100000);
		Shain isobe = new Shain("����", "004", "��C", "02", 50000);
		Shain shimizu = new Shain("�E��", "005", "��C", "02", 50000);
		Shain hukusako = new Shain("����", "006", "���", "01", 30000);
		Shain nakamura = new Shain("����", "007", "���", "01", 30000);

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
