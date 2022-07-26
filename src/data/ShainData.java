package data;

public class ShainData {
	public ShainData(String shainId, String shainName, String yakushokuId, String yakushokuName, int salary) {
		this.shainId = shainId;
		this.shainName = shainName;
		this.yakushokuId = yakushokuId;
		this.yakushokuName = yakushokuName;
		this.salary = salary;
	}

	//社員ID
	private String shainId;
	//社員名称
	private String shainName;
	//役職ID
	private String yakushokuId;
	//役職名称
	private String yakushokuName;
	//基本給
	private int salary;

	public void setShainId(String shainId) {
		this.shainId = shainId;
	}

	public String getShainId() {
		return this.shainId;
	}

	public void setShainName(String shainName) {
		this.shainName = shainName;
	}

	public String getShainName() {
		return this.shainName;
	}

	public void setYakushokuId(String yakushokuId) {
		this.yakushokuId = yakushokuId;
	}

	public String getYakushokuId() {
		return this.yakushokuId;
	}

	public void setYakushokuName(String yakushokuName) {
		this.yakushokuName = yakushokuName;
	}

	public String getYakushokuName() {
		return this.yakushokuName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}
}