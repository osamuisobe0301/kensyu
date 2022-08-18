package repository.character;


/**
 * 生徒の論理データ
 */
public class Student {
	
	private int studentId;
	private String studentName;
	private String SchoolName;


	//フィールド
	private int figureJapaneseScore; 
	private int figureEnglishScore;
	private int figureMathScore; 
	private int totalScore;
	private String result;
	private boolean enabled = true;

	/**
	 * コンストラクタ
	 */
	public Student(int studentId, String studentName, int figureJapaneseScore, int figureEnglishScore,
			int figureMathScore, int totalScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.figureJapaneseScore = figureJapaneseScore;
		this.figureEnglishScore = figureEnglishScore;
		this.figureMathScore = figureMathScore;
		this.totalScore = totalScore;
	}
	
	/**
	 * 合計点のゲッターメソッド
	 */
	public int getTotalScore() {
		return totalScore;
	}
	
	/**
	 * 合否のゲッターメソッド
	 */
	public String getResult() {
		return result;
	}
	
	/**
	 * 生徒名のゲッターメソッド
	 */
	public String getStudentName() {
		return studentName;
	}
	
	/**
	 * 学校名のゲッターメソッド
	 */
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	/**
	 * 国語の点数のゲッターメソッド
	 */
	public int getFigureJapaneseScore() {
		return figureJapaneseScore;
	}
	
	/**
	 * 英語の点数のゲッターメソッド
	 */
	public int getFigureEnglishScore() {
		return figureEnglishScore;
	}
	
	/**
	 * 数学の点数のゲッターメソッド
	 */
	public int getFigureMathScore() {
		return figureMathScore;
	}
	
	/**
	 * 生徒IDのゲッターメソッド
	 */
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * 生徒IDのゲッターメソッド
	 */
	public boolean getEnabled() {
		return enabled;
	}
	
	/**
	 * 学校名のゲッターメソッド
	 */
	public String getSchoolName() {
		return SchoolName;
	}
	
	/**
	 * 論理削除のセッターメソッド
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	/**
	 * 合否のセッターメソッド
	 */
	public void setResult(String result) {
		this.result = result;
	}
	
	
	/**
	 * 学校名のセッターメソッド
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
