
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShainFactory {

	public static List<ShainData> create() {
		// 給料データクラスは無くても良い。
		List<ShainData> shainList = new ArrayList<ShainData>();
		shainList.add(new ShainData("田中",Yakushoku.SHACHO,Arrays.asList(750000,680000,700000)));
		shainList.add(new ShainData("佐藤",Yakushoku.KACHO,Arrays.asList(500000,510000,500000)));
		shainList.add(new ShainData("山田",Yakushoku.IPPAN,Arrays.asList(330000,320000,300000)));
		return shainList;
	}
}
