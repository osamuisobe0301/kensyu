package controller;

import java.io.IOException;
import java.util.List;

import datatable.CompanyTable;
import datatable.PostTable;
import datatable.ShainTable;
import dto.ShainDto;
import entity.CompanyEntity;
import entity.PostEntity;
import entity.ShainEntity;
import search.Search;
import search_factory.SearchFactory;
import tools.InputMenuTool;
import tools.JoinTool;

/**
 * �V�X�e���̍H�����Ǘ�����R���g���[���[
 * @author t.takagi
 */
public class Controller{
    
    /**
     * �N���@�\�ŃV�X�e�����N������
     * @throws IOException 
     */
    public void start() throws IOException{
        
        
        // ��Џ����擾����
        CompanyTable companyTable = new CompanyTable();
        List<CompanyEntity> companyTableList = companyTable.create();
        
        // �Ј������擾����
        ShainTable shainTable = new ShainTable();
        List<ShainEntity> shainTableList = shainTable.create();
        
        // ��E�����擾����
        PostTable postTable = new PostTable();
        List<PostEntity> postTableList = postTable.create();
        
        
        //��EID�A���ID����v�����1�̎Ј����Ƃ��Č�������
        JoinTool joinTool = new JoinTool();
        List<ShainDto> shainDtoList = joinTool.joinTable(companyTableList, shainTableList, postTableList);
        
        
        // �Ј����̌������@�̃��j���[�ԍ�����͂�����
        InputMenuTool inputMenuTool = new InputMenuTool();
        String choiseMenu = inputMenuTool.inputMenu();
        
        // ���͂��ꂽ���j���[�ԍ��ɊY�����錟�����@���Ăяo��
        SearchFactory searchFactory = new SearchFactory();
        Search chiceSearch = searchFactory.create(choiseMenu);
        
        // �I�������������@�ɂ��������ĎЈ������o�͂���
        chiceSearch.execute(shainDtoList);      
    }
}