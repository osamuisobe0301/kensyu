package constants;

/**
*
* FunctionData �@�\�f�[�^�N���X
* @author nakama
*
*/
public enum FunctionData{

	SHAIN_SEARCH("1","�Ј���񌟍��V�X�e��(�Ј�ID)"),
	YAKUSHOKU_SEARCH("2","�Ј���񌟍��V�X�e��(��EID)"),
	CALC_SALARY("3","���^�v�Z�V�X�e��"),
    END("99","�V�X�e���I��");

	
	//�@�\�ԍ�
	private String functionNum;
    
    //�@�\��
	private String functionName;
	
	private FunctionData(String functionNum,String functionName){
	
		this.functionNum = functionNum;
		this.functionName = functionName;
	
	}

	public String getFunctionNum(){
	
		return this.functionNum = functionNum;
	
	}
	
	public String getFunctionName(){
	
		return this.functionName = functionName;
	
	}
}