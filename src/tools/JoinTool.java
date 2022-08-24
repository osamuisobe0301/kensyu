package tools;
import java.util.List;

import dto.ShainDto;
import entity.CompanyEntity;
import entity.PostEntity;
import entity.ShainEntity;

import java.util.ArrayList;

/**
 * @author t.takagi
 * ���ID�A��EID����v����Ό�������
 */
public class JoinTool{
	
	//�Ј����X�g���`����
	List<ShainDto> shainDtoList = new ArrayList<>();
	
	/**
	 * ���ID�A��EID�̗�������v����΂P�̎Ј����Ƃ��Č�������
	 * @param companyTableList ��Џ��̃��X�g, shainTableList�@�Ј����̃��X�g, postTableList�@��E���̃��X�g
	 * @return shainDtoList ���������Ј���񃊃X�g
	 */
    public List<ShainDto> joinTable(List<CompanyEntity> companyTableList, List<ShainEntity> shainTableList, List<PostEntity> postTableList){
        
        for(CompanyEntity companyTable : companyTableList){
            for(ShainEntity shainTable : shainTableList){
                for(PostEntity postTable : postTableList){
                	
                	//���ID�Ɩ�EID��v����Ό�������
                    if(companyTable.getCompanyId().equals(shainTable.getCompanyId()) || postTable.getPostId().equals(shainTable.getPostId())) {
                    	
                    	//��v������Ј����𐶐�����
                        ShainDto shainDto = new ShainDto(shainTable.getShainName(), shainTable.getSalary(), companyTable.getCompanyName(), companyTable.getCompanyId(), postTable.getPostName(), postTable.getPostId());
                        
                        //�������邽�тɎЈ����X�g�ɒǉ�����
                        this.shainDtoList.add(shainDto);
                    }
                }
            }
            
        }
		return this.shainDtoList;
		
    }
        
}
