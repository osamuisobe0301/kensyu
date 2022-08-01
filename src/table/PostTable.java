package table;


import java.util.Arrays;
import java.util.List;

import dao.Post;

/**
*@@author t.takagi
*/

/**
*@–ğEî•ñ‚ğŠÇ—‚·‚éƒNƒ‰ƒX
*/
public class PostTable {

	/**
	*@–ğEî•ñƒŠƒXƒg‚ğ“n‚·
	* @return postList –ğEƒŠƒXƒg
	*/
	public List<Post> ReturnPostList(){
		
		//–ğEî•ñƒŠƒXƒg‚ğ‰Šú‰»
		List<Post> postList = Arrays.asList(
				
				//–ğEî•ñ‚ğ‰Šú‰»
		new Post("1", "å”C", 1000000),
		new Post("2", "€å”C", 500000),
		new Post("3", "ˆê”Ê", 260000));;

				return postList;
	}
}
