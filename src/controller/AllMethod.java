package controller;

import dto.Shain;
//処理区分の引数によって処理を変えるクラス

public class AllMethod {

	public AllMethod(String shainId, String yakushokuId, String shoriKbn) {

		System.out.println("社員ID:" + shainId + " " + "役職ID:" + yakushokuId + " " + "処理区分:" + shoriKbn);
		System.out.println("-------------------------");
		
		if ("0".equals(shoriKbn) || "1".equals(shoriKbn) || "2".equals(shoriKbn)) {
			Shain employee = new Shain(shainId, yakushokuId, shoriKbn);
		} else {
			System.out.println("正しい処理区分を入力してください。");
		}
		if (!("0").equals(yakushokuId) && !("1").equals(yakushokuId) && !("2").equals(yakushokuId)) {
			System.out.println("正しい役職IDを入力してください。");
		}
	}
}