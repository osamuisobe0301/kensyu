package repository.character;


/**
 * ���k�̘_���f�[�^
 */
public class Student {
	
	private int studentId;
	private String studentName;
	private String SchoolName;


	//�t�B�[���h
	private int figureJapaneseScore; 
	private int figureEnglishScore;
	private int figureMathScore; 
	private int totalScore;
	private String result;
	private boolean enabled = true;

	/**
	 * �R���X�g���N�^
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
	 * ���v�_�̃Q�b�^�[���\�b�h
	 */
	public int getTotalScore() {
		return totalScore;
	}
	
	/**
	 * ���ۂ̃Q�b�^�[���\�b�h
	 */
	public String getResult() {
		return result;
	}
	
	/**
	 * ���k���̃Q�b�^�[���\�b�h
	 */
	public String getStudentName() {
		return studentName;
	}
	
	/**
	 * �w�Z���̃Q�b�^�[���\�b�h
	 */
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	/**
	 * ����̓_���̃Q�b�^�[���\�b�h
	 */
	public int getFigureJapaneseScore() {
		return figureJapaneseScore;
	}
	
	/**
	 * �p��̓_���̃Q�b�^�[���\�b�h
	 */
	public int getFigureEnglishScore() {
		return figureEnglishScore;
	}
	
	/**
	 * ���w�̓_���̃Q�b�^�[���\�b�h
	 */
	public int getFigureMathScore() {
		return figureMathScore;
	}
	
	/**
	 * ���kID�̃Q�b�^�[���\�b�h
	 */
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * ���kID�̃Q�b�^�[���\�b�h
	 */
	public boolean getEnabled() {
		return enabled;
	}
	
	/**
	 * �w�Z���̃Q�b�^�[���\�b�h
	 */
	public String getSchoolName() {
		return SchoolName;
	}
	
	/**
	 * �_���폜�̃Z�b�^�[���\�b�h
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	/**
	 * ���ۂ̃Z�b�^�[���\�b�h
	 */
	public void setResult(String result) {
		this.result = result;
	}
	
	
	/**
	 * �w�Z���̃Z�b�^�[���\�b�h
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
