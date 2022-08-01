package factory;

import java.util.HashMap;
import java.util.Map;

import dao.Post;

/**
 * 役職ファクトリー
 */
public class PostFactory {
	static Map<String, Post> postMap = new HashMap<>();
	
	/**
	 * クリエイトファクトリー
	 * @param PostId　役職ID
	 * @return　Post　役職
	 */
	public static Post create(String PostId) {
		
		//役職マップ生成
		Map<String, Post> postMap = new HashMap<>();
		
		//役職dao初期化とマップをキーとバリューをセット
		postMap.put("1", new Post("1", "主任", 1000000));
		postMap.put("2", new Post("2", "準主任", 500000));
		postMap.put("3", new Post("3", "一般", 260000));
		
		//役職IDキーで受け取って役職daoを返す
		return postMap.get(PostId);
	}
}
