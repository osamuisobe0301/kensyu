package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 *　Untilクラス
 */
public class Util {

	//入力メソッド生成
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 合計点を計算するメソッド
	 */
	public int calcOutput(int japaneseScore, int englishScore, int MathScore){
		int totalScore = japaneseScore + englishScore + MathScore;
		return totalScore;
	}

	/**
	 * 入力を継続か終了か判断するメソッド
	 */
	public boolean stop() throws IOException {
		//終了:end 継続:エンターキー
		String stop = util.Util.br.readLine();
		if("end".equals(stop)) {
			return false;
		}else{
			return true;
		}
	}
}
