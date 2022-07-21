package dto;


import java.util.ArrayList;
import java.util.List;
public class Factory {
	static List<Shain> ShainList = new ArrayList<>();
	public Factory() {
		Shain nakama = new Shain("’‡ŠÔ", "001", "ŒW’·", "03", 100000);
		Shain takagi = new Shain("‚–Ø", "002", "ŒW’·", "03", 100000);
		Shain nakano = new Shain("’†–ì", "003", "ŒW’·", "03", 100000);
		Shain isobe = new Shain("´…", "004", "å”C", "02", 50000);
		Shain shimizu = new Shain("âE•Ó", "005", "å”C", "02", 50000);
		Shain hukusako = new Shain("•Ÿ”—", "006", "ˆê”Ê", "01", 30000);
		Shain nakamura = new Shain("’†‘º", "007", "ˆê”Ê", "01", 30000);

		ShainList.add(nakama);
		ShainList.add(takagi);
		ShainList.add(nakano);
		ShainList.add(isobe);
		ShainList.add(shimizu);
		ShainList.add(hukusako);
		ShainList.add(nakamura);
	}
	public static List<Shain> create(){
		return ShainList;
	}
}
