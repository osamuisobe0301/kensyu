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
 * システムの工程を管理するコントローラー
 * @author t.takagi
 */
public class Controller{
    
    /**
     * 起動機能でシステムを起動する
     * @throws IOException 
     */
    public void start() throws IOException{
        
        
        // 会社情報を取得する
        CompanyTable companyTable = new CompanyTable();
        List<CompanyEntity> companyTableList = companyTable.create();
        
        // 社員情報を取得する
        ShainTable shainTable = new ShainTable();
        List<ShainEntity> shainTableList = shainTable.create();
        
        // 役職情報を取得する
        PostTable postTable = new PostTable();
        List<PostEntity> postTableList = postTable.create();
        
        
        //役職ID、会社IDが一致すれば1つの社員情報として結合する
        JoinTool joinTool = new JoinTool();
        List<ShainDto> shainDtoList = joinTool.joinTable(companyTableList, shainTableList, postTableList);
        
        
        // 社員情報の検索方法のメニュー番号を入力させる
        InputMenuTool inputMenuTool = new InputMenuTool();
        String choiseMenu = inputMenuTool.inputMenu();
        
        // 入力されたメニュー番号に該当する検索方法を呼び出す
        SearchFactory searchFactory = new SearchFactory();
        Search chiceSearch = searchFactory.create(choiseMenu);
        
        // 選択した検索方法にしたがって社員情報を出力する
        chiceSearch.execute(shainDtoList);      
    }
}