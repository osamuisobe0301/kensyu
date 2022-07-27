package data;

import java.util.ArrayList;

//全社員のリスト
public class DataList {
	public ArrayList<ShainData> showList() {
		ArrayList<ShainData> ShainList = new ArrayList<ShainData>();
		ShainList.add(new ShainData("001", "仲間", "0", "係長", 100000));
		ShainList.add(new ShainData("002", "高木", "0", "係長", 100000));
		ShainList.add(new ShainData("003", "中野", "0", "係長", 100000));
		ShainList.add(new ShainData("004", "清水", "1", "主任", 50000));
		ShainList.add(new ShainData("005", "礒辺", "1", "主任", 50000));
		ShainList.add(new ShainData("006", "福迫", "2", "一般", 30000));
		ShainList.add(new ShainData("007", "中村", "2", "一般", 30000));
		return ShainList;
	}
}