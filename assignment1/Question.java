package assignment1;

interface Question {
	
	void setQuestion(String question);
	String getQuestion();
	
	void printOptions();
	void addOptions(String choice);
	
	public void setAnswer(String answer);
	public boolean isAnswer(String searchElement);
	
	public void resetOptions();
}

