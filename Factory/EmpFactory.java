package Factory;


import java.util.Arrays;
import java.util.List;

import repository.dto.Shain;
public class EmpFactory {

	public static List<Shain> createList() {
		
		List<Shain> shainList = Arrays.asList
				(new Shain("仲間", "001", "係長", "03", 100000),
				 new Shain("高木", "002", "係長", "03", 100000),
				 new Shain("中野", "003", "係長", "03", 100000));
		
		return shainList;
	}
}
