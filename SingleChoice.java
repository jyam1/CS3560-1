package assignment1;

import java.util.ArrayList;

public class SingleChoice implements Question{
	
	private String question;
	private ArrayList<String> choices = new ArrayList<>();
	private String answer;
	private static int currNumber = 1;
	
	public void setQuestion(String question) {
		this.question = question;
		
		
	}
	public String getQuestion() {
		return this.question;
	}
	
	public void addOptions(String choice) {
		choices.add((char)currNumber + ") " + choice);
		currNumber++;
	}
	
	public void printOptions() {
		for(int i = 0; i < choices.size(); i++) {
			System.out.println(choices.get(i));
		}
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public boolean isAnswer(String searchElement) {
		return this.answer == searchElement;
	}
	
	public void resetOptions() {
		currNumber = 1;
	}
}
