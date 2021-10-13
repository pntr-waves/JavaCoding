package exercise531;

public enum Questions {
	
	Q1(1, "Question 1", new String[]{"Answer1", "Answer2", "Answer3", "Answer4"}, 2), 
	Q2(2, "Question 2", new String[]{"Answer1", "Answer2", "Answer3", "Answer4"}, 1),
	Q3(3, "Question 3", new String[]{"Answer1", "Answer2", "Answer3", "Answer4"}, 3),
	Q4(4, "Question 4", new String[]{"Answer1", "Answer2", "Answer3", "Answer4"}, 1),
	Q5(5, "Question 5", new String[]{"Answer1", "Answer2", "Answer3", "Answer4"}, 4);

	private int questionValue;
	private String questionName;
	private String[] anwsers;
	private int correctAnwsers;
	
	Questions(int questionValue, String questionName, String[] anwsers, int correctAnwsers){
		this.setQuestionValue(questionValue);
		this.setQuestionName(questionName);
		this.setAnwsers(anwsers);
		this.setCorrectAnwsers(correctAnwsers);
	}

	public int getQuestionValue() {
		return questionValue;
	}

	public void setQuestionValue(int questionValue) {
		this.questionValue = questionValue;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String[] getAnwsers() {
		return anwsers;
	}

	public void setAnwsers(String[] anwsers) {
		this.anwsers = anwsers;
	}

	public int getCorrectAnwsers() {
		return correctAnwsers;
	}

	public void setCorrectAnwsers(int correctAnwsers) {
		this.correctAnwsers = correctAnwsers;
	}
	
	
}
