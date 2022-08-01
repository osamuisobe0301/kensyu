package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.Post;
import dto.character.Shain;

/**
 *　生徒のファクトリークラス
 */
public class ShainFactory {

	/**
	 *　生徒リスト生成
	 */
	static List<Shain> shainList = new ArrayList<>();


	Map<String, Post> postMap = new HashMap<>();

	/**
	 *　コンストラクタ
	 */
	public ShainFactory() {

		shainList.add(new Shain("1", "佐藤", "1"));
		shainList.add(new Shain("2", "山田", "2"));
		shainList.add(new Shain("3", "工藤", "3"));

	}

	/**
	 *　クリエイトメソッド
	 * @return studentList 生徒リスト
	 */
	public static List<Shain> create() {
		return shainList;
	}
}
