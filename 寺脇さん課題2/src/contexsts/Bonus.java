package contexsts;

import java.text.NumberFormat;

//ボーナスを計算するクラス
public class Bonus {
	private String positionId;
	private int localSalary;
	private int bonus = 0;
	NumberFormat comFormat = NumberFormat.getNumberInstance();
	
	public Bonus(String positionId, int localSalary) {
		this.positionId = positionId;
		this.localSalary = localSalary;
	}
//役職IDによってボーナス額が変わる
	public void spBonus() {
		
		switch (positionId) {

		case "0":
			this.bonus = localSalary * 2;
			break;

		case "1":
			this.bonus = (int) (localSalary * 2.5);
			break;

		case "2":
			this.bonus = localSalary * 3;
			break;
		}
		System.out.println("ボーナス = ￥" + comFormat.format(this.bonus));
	}
}