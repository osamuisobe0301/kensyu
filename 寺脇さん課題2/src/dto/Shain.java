package dto;

import java.util.ArrayList;

import constants.Constants;
import contexsts.Bonus;
import data.DataList;
import data.ShainData;

//社員出力クラス
public class Shain {
	DataList shainList = new DataList();
	ArrayList<ShainData> list = shainList.showList();
	String shainId;
	String yakushokuId;
	
//社員ID、役職ID、処理区分によって出力される内容が変わる
	public Shain(String shainId, String yakushokuId, String shoriKbn) {
		for (ShainData employee : list) {
			int localSalary = (employee.getSalary());
			String positionId = (employee.getYakushokuId());
			if ("0".equals(shoriKbn) && shainId.equals(employee.getShainId())
					|| "1".equals(shoriKbn) && yakushokuId.equals(employee.getYakushokuId())
					|| "2".equals(shoriKbn)) {
				Constants.Message.MESSAGE_01.show(employee.getShainName(),employee.getYakushokuName(),localSalary);
				
				Bonus bonusSalary = new Bonus(positionId, localSalary);
				bonusSalary.spBonus();
				Constants.Message.MESSAGE_Line.show();

				//			} else if (!(shainId.equals(employee.getShainId()))) {
				//				System.out.println("正しい社員IDを入力してください");
				//				break;
				//			}
			}
		}
	}
}