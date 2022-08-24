package datatable;
import java.util.List;

import entity.ShainEntity;

import java.util.Arrays;

/**
 * 社員情報のテーブル
 * @author t.takagi
 */
public class ShainTable{
    
    // 社員情報のリストを作成
    List<ShainEntity> shainList;
    
    /**
     * 社員情報を初期化する
     */
    public ShainTable(){
    	
        ShainEntity tanaka = new ShainEntity("田中", 200000, "01", "01");
        ShainEntity suzuki = new ShainEntity("鈴木", 300000, "02", "03");
        ShainEntity nakata = new ShainEntity("中田", 250000, "03", "02");
        ShainEntity ikeda = new ShainEntity("池田", 190000, "03", "03");
        
        // 初期化した社員情報を社員情報リストに設定する
        shainList = Arrays.asList(tanaka, suzuki, nakata, ikeda);
        
    }
    
    /**
     * 作成した社員情報リストをコントローラにー渡す
     * @return ShainList 社員情報リスト
     */
    public List<ShainEntity> create(){
        return shainList;
    }
}