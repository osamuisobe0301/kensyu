import java.util.List;


public class ShainData {
	
	String name;
	int yakushokuId;
	String yakushokuName;
	List<SalaryData> salaryList;
	int bonus;
	
	public ShainData(String name,Yakushoku yakushoku, List<SalaryData> salaryList) {
		this.name = name;
		this.yakushokuId = yakushoku.getId();
		this.yakushokuName = yakushoku.getYakushokuName();
		this.salaryList = salaryList;
		if(yakushoku.getBonus()) {
			this.bonus = salaryList.get(0).getSumSalary();
		}else {
			this.bonus = 0;
		}
	}

	public String getName() {
		return name;
	}

	public int getYakushokuId() {
		return yakushokuId;
	}

	public String getYakushokuName() {
		return yakushokuName;
	}

	public List<SalaryData> getSalaryList() {
		return salaryList;
	}
	
	public int getBonus() {
		return this.bonus;
	}

}
