package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 *�@Until�N���X
 */
public class Util {

	//���̓��\�b�h����
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * ���v�_���v�Z���郁�\�b�h
	 */
	public int calcOutput(int japaneseScore, int englishScore, int MathScore){
		int totalScore = japaneseScore + englishScore + MathScore;
		return totalScore;
	}

	/**
	 * ���͂��p�����I�������f���郁�\�b�h
	 */
	public boolean stop() throws IOException {
		//�I��:end �p��:�G���^�[�L�[
		String stop = util.Util.br.readLine();
		if("end".equals(stop)) {
			return false;
		}else{
			return true;
		}
	}
}
