package factory;

import java.util.HashMap;
import java.util.Map;

import dto.AdditionCalc;
import dto.BonusCalc;
import dto.DivisionCalc;
import dto.ICalc;
import dto.MultiplicationCalc;
import dto.SubtractionCalc;
import dto.TaxCalc;

/**
 * @author nakano
 * mapによって処理をまとめたファクトリークラス
 */
public class CalcFactry {

	/**
	 * mapにそれぞれの計算クラスをまとめる
	 * @param num
	 * @return calcmap.get(num)
	 */
	public ICalc calcMapCreate(int num) {
		
		Map<Integer, ICalc> calcmap = new HashMap<>();
		calcmap.put(1, new AdditionCalc());
		calcmap.put(2, new SubtractionCalc());
		calcmap.put(3, new MultiplicationCalc());
		calcmap.put(4, new DivisionCalc());
		calcmap.put(5, new TaxCalc());
		calcmap.put(6, new BonusCalc());

		return calcmap.get(num);
	}

}
