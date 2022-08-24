package searchImpl;

import java.util.List;

import dto.ShainDto;
import search.Search;

import java.io.IOException;

/**
 * @author t.takagi
 * 社員情報を全出力する機能
 */
public class AllOutput implements Search{

	/**
	 * 社員情報を全出力する
	 * @param shainDtoList 社員リスト
	 */
	public void execute(List<ShainDto> shainDtoList)throws IOException{
		for(ShainDto shainDto : shainDtoList){

			//社員情報を画面に表示する
			System.out.println(shainDto.toString());
		}
	}
}


