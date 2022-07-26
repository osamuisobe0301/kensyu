package dto;

import java.util.ArrayList;

import contexsts.Bonus;
import data.DataList;
import data.ShainData;

//社員ID
public class Shain {
	DataList shainList = new DataList();
	ArrayList<ShainData> list = shainList.showList();
	String shainId;
	String yakushokuId;

	public Shain(String shainId, String yakushokuId, String shoriKbn) {
		for (ShainData employee : list) {

			 if  ("0".equals(shoriKbn) && shainId.equals(employee.getShainId())
					|| "1".equals(shoriKbn) && yakushokuId.equals(employee.getYakushokuId())
					|| "2".equals(shoriKbn)) {
				System.out.println("社員名 = " + employee.getShainName());
				System.out.println("役職 = " + employee.getYakushokuName());
				String positionId = (employee.getYakushokuId());
				int localSalary = (employee.getSalary());
				System.out.println("基本給 = \\" + localSalary);
				Bonus bonusSalary = new Bonus(positionId, localSalary);
				bonusSalary.spBonus();
				System.out.println("-------------------------");
			}
		}

	}
}
