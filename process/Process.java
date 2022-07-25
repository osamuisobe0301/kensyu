package process;

import java.io.IOException;
import java.util.List;

import repository.dto.Shain;

/**
 * 社員情報の出力方法を出しわけるインターフェース
 * @author o.isobe
 *
 */
public interface Process {

	/**
	 * 処理を実行する
	 * @param shainList
	 */
	void execute(List<Shain> shainList) throws IOException;
	
}
