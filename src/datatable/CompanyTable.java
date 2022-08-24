package datatable;
import java.util.List;

import entity.CompanyEntity;

import java.util.Arrays;


/**
 * 会社情報のテーブル
 * @author t.takagi
 */
public class CompanyTable{
    
    //会社情報のリストを作成する
    List<CompanyEntity> companyList;
    
    /**
     * 会社情報を初期化する
     */
    public CompanyTable(){
        
        CompanyEntity sony = new CompanyEntity("01", "ソニー");
        CompanyEntity toshiba = new CompanyEntity("02", "東芝");
        CompanyEntity panasonic = new CompanyEntity("03", "パナソニック");
        
        // 初期化した情報をリストに追加する
        companyList = Arrays.asList(sony, toshiba, panasonic);
    }
    
    
    /**
     * 会社情報のリストをコントローラーに渡す
     * @return  companyList 会社リスト
     */
    public List<CompanyEntity> create(){
        return companyList;
    }
    
}