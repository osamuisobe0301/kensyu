package controller;

//メインクラス
public class Controller {

	public static void main(String[] args) {
		//コマンドライン引数の数によって処理を分ける
		int argsNum = args.length;
		if (argsNum != 3) {
			System.out.println("正しい処理区分を入力してください");
			return;
		} else {
			String shainId = args[0];
			String yakushokuId = args[1];
			String shoriKbn = args[2];

			AllMethod all = new AllMethod(shainId, yakushokuId, shoriKbn);

		}
		System.out.println("終了します");
	}
}
