
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShainFactory {

	public static List<ShainData> create() {
		List<ShainData> shainList = new ArrayList<ShainData>();
		
		List<SalaryData> tanakaSalaryList = Arrays.asList(new SalaryData(750000,680000,700000));
		shainList.add(new ShainData("田中",Yakushoku.SHACHO,tanakaSalaryList));
		
		List<SalaryData> satoSalaryList = Arrays.asList(new SalaryData(500000,510000,500000));
		shainList.add(new ShainData("佐藤",Yakushoku.KACHO,satoSalaryList));
		
		List<SalaryData> yamadaSalaryList = Arrays.asList(new SalaryData(330000,320000,300000));
		shainList.add(new ShainData("山田",Yakushoku.IPPAN,yamadaSalaryList));
		
		return shainList;
	}
}
