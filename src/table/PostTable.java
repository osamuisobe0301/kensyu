package table;


import java.util.Arrays;
import java.util.List;

import dao.Post;

/**
*　@author t.takagi
*/

/**
*　役職情報を管理するクラス
*/
public class PostTable {

	/**
	*　役職情報リストを渡す
	* @return postList 役職リスト
	*/
	public List<Post> ReturnPostList(){
		
		//役職情報リストを初期化
		List<Post> postList = Arrays.asList(
				
				//役職情報を初期化
		new Post("1", "主任", 1000000),
		new Post("2", "準主任", 500000),
		new Post("3", "一般", 260000));;

				return postList;
	}
}
