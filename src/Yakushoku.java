
public enum Yakushoku {

	SHACHO(1,"社長",false),
	BUCHO(2,"部長",true),
	KACHO(3,"課長",true),
	IPPAN(4,"一般社員",true);
	
	private int id;
	private String yakushokuName;
	private boolean bonus;
	
	private Yakushoku(int id,String yakushokuName,Boolean bonus) {
		this.id = id;
		this.yakushokuName = yakushokuName;
		this.bonus = bonus;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getYakushokuName() {
		return this.yakushokuName;
	}
	// Booleanはラッパークラスでなくても良い
	// またbooleanの場合はメソッド名はisやチェックの方が良い
	public boolean isBonus() {
		return this.bonus;
	}
	
}
