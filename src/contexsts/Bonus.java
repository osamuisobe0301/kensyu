package contexsts;

public class Bonus {
	private String positionId;
	private int localSalary;

	public Bonus(String positionId, int localSalary) {
		this.positionId = positionId;
		this.localSalary = localSalary;
	}

	public void spBonus() {
		double bonus = 0;
		switch (positionId) {

		case "0":
			bonus = localSalary * 2.0;
			break;

		case "1":
			bonus = localSalary * 2.5;
			break;

		case "2":
			bonus = localSalary * 3.0;
			break;
		}
		System.out.println("ボーナス = \\" + bonus);
	}
}