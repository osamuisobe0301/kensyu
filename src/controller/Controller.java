package controller;

//メインクラス
public class Controller {
	public static void main(String[] args) {
		String shainId = args[0];
		String yakushokuId = args[1];
		String shoriKbn = args[2];
		
		AllMethod all = new AllMethod(shainId, yakushokuId, shoriKbn);
		/*all.allout();*/
	}
}
