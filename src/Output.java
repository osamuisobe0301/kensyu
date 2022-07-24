import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Output {
	
	public void showShain(List<ShainData> shainList,int id) {
		
		if(checkInputId(id)) {
		// if(1 != id && 2 != id && 3 != id && 4 != id && 9 != id) {
			System.out.println("入力エラーです。1～4の数字を入力してください。");
		}
		for (ShainData shain : shainList) {
			if (shain.getYakushokuId() == id) {
				System.out.println("社員名：" + shain.getName() + "、役職：" + shain.getYakushokuName());
				// ここに処理を書いても良いが、可読性が悪くなる為処理はメソッドにして切り出す。
				showSalary(shain.salaryList);
				System.out.println("ボーナス：" + shain.getBonus());
				System.out.println("------------------------------");
			}
		}
	}
	
	/**
	 * 給料をカンマ区切りで出力する。
	 * @param salaryList
	 */
	private void showSalary(List<Integer> salaryList) {
		System.out.print("給料:");
		for(int salary : salaryList) {
			// リストが最後の場合
			if(salaryList.size() -1 == salaryList.indexOf(salary)) {
				System.out.println(salary);
			} else {
				// リストが最後でない場合
				System.out.print(salary + "、");
			}
		}
		
	}

	// 以下のメソッドにしてしまえば、役職が増えたときに、EnumのIｄを増やすだけで良くなる
	// (if文の条件を増やさなくてよい)
	private boolean checkInputId(int inputId) {
		List<Yakushoku> yakushokuList = Arrays.asList(Yakushoku.values());
		for(Yakushoku y : yakushokuList) {
			if(y.getId() == inputId) {
				return true;
			}
			
			
		}
		return false;
//	    return Arrays.asList(Yakushoku.values()).stream()
//				                                .filter(e -> e.getId() == inputId)
//				                                .findFirst().isEmpty();
	}

}
