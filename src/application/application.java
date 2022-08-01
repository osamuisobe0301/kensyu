package application;


import java.util.ArrayList;
import java.util.List;

import dao.Post;
import dao.Shain;
import dto.shain.ShainDto;
import table.PostTable;
import table.ShainTable;

/**
 * @author t.takagi
 */


/**
 * アプリケーションクラス
 */
public class application {

	/**
	 * メインメソッド
	 */
	public static void main(String[] args) {

		//社員の型を生成
		List<ShainDto> shainDtoList = new ArrayList<ShainDto>();
		
		//社員情報を生成
		ShainTable shainTable = new ShainTable();
		
		//役職に紐づく情報を生成
		PostTable postTable = new PostTable();

		
		//社員情報のリストを返却
		List<Shain> shainList = shainTable.ReturnShainList();
		
		//役職に紐づく情報のリストを生成
		List<Post> postList = postTable.ReturnPostList();

		//２つのリストの役職IDがそれぞれ合致したら社員を生成して社員リストに入れる
		 for(Shain shain : shainList){
	            for(Post post : postList){
	                if(shain.getPostId().equals(post.getPostId())){
	                	
	                	
	                	//社員情報を社員にセットする
	                	ShainDto dto = new ShainDto();
	                	dto.setId(shain.getId());
	                	dto.setName(shain.getName());
	                	dto.setPostId(post.getPostId());
	                	dto.setPostName(post.getPostName());
	                	dto.setSalary(post.getSalary());
	                	
	                	//社員リストに入れる
	                	shainDtoList.add(dto);
	                    break;
	                }
	            }
	        }
		 
		 //社員リストを全出力
		 shainDtoList.stream()
		 .forEach(System.out::println);
		
		
		
	
//		Service service = new Service();
//		sdervice.connect(shainList, postList);
//		
//		
//		
//		List<Dto> dtoList = new ArrayList<>();
		
		
		
		
		
	}

}