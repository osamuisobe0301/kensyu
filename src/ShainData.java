import java.util.List;


public class ShainData {
	
	String name;
	int yakushokuId;
	String yakushokuName;
	List<Integer> salaryList;
	int bonus;
	
	public ShainData(String name,Yakushoku yakushoku, List<Integer> salaryList) {
		this.name = name;
		this.yakushokuId = yakushoku.getId();
		this.yakushokuName = yakushoku.getYakushokuName();
		this.salaryList = salaryList;
		if(yakushoku.isBonus()) {
			this.bonus = getBonus();
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

	public List<Integer> getSalaryList() {
		return salaryList;
	}
	
	// �f�[�^�̑����Z���̏����̓f�[�^�Ɏ�������̂ł͂Ȃ��AJava�ŏ�������
	public int getBonus() {
		int sum = 0;
		for(int salary : salaryList) {
			sum += salary;
		}
		return sum;
//		stream���g�����ꍇ
//		return salaryList.stream().mapToInt(e -> e).sum();
	}

}
