package tools;
import java.util.List;

import dto.ShainDto;
import entity.CompanyEntity;
import entity.PostEntity;
import entity.ShainEntity;

import java.util.ArrayList;

/**
 * @author t.takagi
 * 会社ID、役職IDが一致すれば結合する
 */
public class JoinTool{
	
	//社員リストを定義する
	List<ShainDto> shainDtoList = new ArrayList<>();
	
	/**
	 * 会社ID、役職IDの両方が一致すれば１つの社員情報として結合する
	 * @param companyTableList 会社情報のリスト, shainTableList　社員情報のリスト, postTableList　役職情報のリスト
	 * @return shainDtoList 結合した社員情報リスト
	 */
    public List<ShainDto> joinTable(List<CompanyEntity> companyTableList, List<ShainEntity> shainTableList, List<PostEntity> postTableList){
        
        for(CompanyEntity companyTable : companyTableList){
            for(ShainEntity shainTable : shainTableList){
                for(PostEntity postTable : postTableList){
                	
                	//会社IDと役職ID一致すれば結合する
                    if(companyTable.getCompanyId().equals(shainTable.getCompanyId()) || postTable.getPostId().equals(shainTable.getPostId())) {
                    	
                    	//一致したら社員情報を生成する
                        ShainDto shainDto = new ShainDto(shainTable.getShainName(), shainTable.getSalary(), companyTable.getCompanyName(), companyTable.getCompanyId(), postTable.getPostName(), postTable.getPostId());
                        
                        //生成するたびに社員リストに追加する
                        this.shainDtoList.add(shainDto);
                    }
                }
            }
            
        }
		return this.shainDtoList;
		
    }
        
}
