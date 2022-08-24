package search;
import java.io.IOException;
import java.util.List;

import dto.ShainDto;

/**
 * 検索機能の型
 * @param shainDtoList 社員情報のリスト
 */
public interface Search{
	public void execute(List<ShainDto> ShainDtoList)throws IOException;
}