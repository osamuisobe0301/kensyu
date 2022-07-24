
public class SalaryData {
	
	int oneSalary;
	int twoSalary;
	int threeSalary;
	int sumSalary;
	
	
	public SalaryData(int salary1,int salary2,int salary3) {
		this.oneSalary = salary1;
		this.twoSalary = salary2;
		this.threeSalary = salary3;
		this.sumSalary = salary1 + salary2 + salary3;
	}


	public int getOneSalary() {
		return oneSalary;
	}

	public int getTwoSalary() {
		return twoSalary;
	}

	public int getThreeSalary() {
		return threeSalary;
	}
	
	public int getSumSalary() {
		return sumSalary;
	}

}
