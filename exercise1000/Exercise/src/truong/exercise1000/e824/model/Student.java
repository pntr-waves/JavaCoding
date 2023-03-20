package truong.exercise1000.e824.model;

public class Student {
	private String fullName;
	private double mathMark;
	private double litetureMark;
	private double averageMark;

	public Student(String fullName, double mathMark, double litetureMark) {
		this.fullName = fullName;
		this.mathMark = mathMark;
		this.litetureMark = litetureMark;
		this.averageMark = (this.mathMark + this.litetureMark) / 2;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getMathMark() {
		return mathMark;
	}

	public void setMathMark(double mathMark) {
		this.mathMark = mathMark;
	}

	public double getLitetureMark() {
		return litetureMark;
	}

	public void setLitetureMark(double litetureMark) {
		this.litetureMark = litetureMark;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
}
