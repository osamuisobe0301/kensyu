package search;
import java.io.IOException;
import java.util.List;

import dto.ShainDto;

/**
 * �����@�\�̌^
 * @param shainDtoList �Ј����̃��X�g
 */
public interface Search{
	public void execute(List<ShainDto> ShainDtoList)throws IOException;
}