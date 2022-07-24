import java.util.List;

public class Output {
	
	public static void showShain(List<ShainData> shainList,int id) {
		if(1 != id && 2 != id && 3 != id && 4 != id && 9 != id) {
			System.out.println("入力エラーです。1～4の数字を入力してください。");
		}
		for (ShainData shain : shainList) {
			if (shain.getYakushokuId() == id) {
				List<SalaryData> salaryList = shain.getSalaryList();
				System.out.println("社員名：" + shain.getName() + "、役職：" + shain.getYakushokuName());
				for (SalaryData salary : salaryList) {
					System.out.println("給料：" + salary.getOneSalary() + "、" + salary.getTwoSalary() + "、"
							+ salary.getThreeSalary());
				}
				System.out.println("ボーナス：" + shain.getBonus());
				System.out.println("------------------------------");
			}
		}
	}

}
