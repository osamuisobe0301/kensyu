package table;


import java.util.Arrays;
import java.util.List;

import dao.Post;

/**
*�@@author t.takagi
*/

/**
*�@��E�����Ǘ�����N���X
*/
public class PostTable {

	/**
	*�@��E��񃊃X�g��n��
	* @return postList ��E���X�g
	*/
	public List<Post> ReturnPostList(){
		
		//��E��񃊃X�g��������
		List<Post> postList = Arrays.asList(
				
				//��E����������
		new Post("1", "��C", 1000000),
		new Post("2", "����C", 500000),
		new Post("3", "���", 260000));;

				return postList;
	}
}
