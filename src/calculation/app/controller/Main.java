package calculation.app.controller;

import calculation.app.CalclationApp;

/**
 * 計算機能の起動クラス
 * @author o.isobe
 *
 */
public class Main {

	/**
	 * 計算機能のメインメソッド
	 * @param args 実行時引数
	 */
	public static void main(String[] args) {
		
		// 計算アプリを起動する
		CalclationApp app = new CalclationApp();
		app.start();
	}
}
