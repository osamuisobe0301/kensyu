package calculation.app.dto;

public class CalcInputDto {

	private String functionId;
	private int inputNumOne;
	private int inputNumTwo;
	
	public CalcInputDto(int functionId, int inputNumOne, int inputNumTwo) {
		super();
		this.functionId = functionId;
		this.inputNumOne = inputNumOne;
		this.inputNumTwo = inputNumTwo;
	}
	public String getFunctionId() {
		return functionId;
	}
	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}
	public int getInputNumOne() {
		return inputNumOne;
	}
	public void setInputNumOne(int inputNumOne) {
		this.inputNumOne = inputNumOne;
	}
	public int getInputNumTwo() {
		return inputNumTwo;
	}
	public void setInputNumTwo(int inputNumTwo) {
		this.inputNumTwo = inputNumTwo;
	}
}
