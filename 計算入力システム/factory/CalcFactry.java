package factory;

import java.util.HashMap;
import java.util.Map;

import dto.ICalc;
import service.AdditionCalcimpl;
import service.BonusCalcimpl;
import service.DivisionCalcimpl;
import service.MultiplicationCalcimpl;
import service.SubtractionCalcimpl;
import service.TaxCalcimpl;

/**
 * @author nakano mapによって処理をまとめたファクトリークラス
 */
public class CalcFactry {

	/**
	 * mapにそれぞれの計算クラスをまとめる
	 * 
	 * @param num
	 * @return calcmap.get(num)
	 */
	public ICalc calcMapCreate(int num) {

		Map<Integer, ICalc> calcmap = new HashMap<>();
		calcmap.put(1, new AdditionCalcimpl());
		calcmap.put(2, new SubtractionCalcimpl());
		calcmap.put(3, new MultiplicationCalcimpl());
		calcmap.put(4, new DivisionCalcimpl());
		calcmap.put(5, new TaxCalcimpl());
		calcmap.put(6, new BonusCalcimpl());

		return calcmap.get(num);
	}

}
