package search_factory;
import java.util.Map;

import search.Search;
import searchImpl.AllOutput;
import searchImpl.SearchCompanyId;
import searchImpl.SearchPostId;

import java.util.HashMap;

/**
 * @author t,takagi 
 * �����@�\����͂��ꂽ�ԍ��Ɋ�Â��ČĂяo��
 */
public class SearchFactory{
    
    Map<String,Search> SearchMap = new HashMap<>();
    
    /**
     * �e�����@�\�Ƀ��j���[�ԍ������蓖�ď���������
     */
    public SearchFactory(){
    	
    	//�e�����@�\�Ƀ��j���[�ԍ������蓖�Ă�
        SearchMap.put("1", new SearchCompanyId());
        SearchMap.put("2", new SearchPostId());
        SearchMap.put("3", new AllOutput());
    }
    
    /**
     * ���͂��ꂽ���j���[�ԍ��Ɋ�Â��������@�\��Ԃ�
     * @param choiseMenu �I�����������@�\�̃��j���[�ԍ�
     * @return Service �I�����ꂽ�����@�\
     */
    public Search create(String choiseMenu){
        return SearchMap.get(choiseMenu);
    }
}