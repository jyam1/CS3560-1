package assignment1;
import java.util.ArrayList;

public class MultipleChoice implements Question{
	private String question;
	private ArrayList<String> choices = new ArrayList<>();
	private ArrayList<String> answer = new ArrayList<>();
	private static char currLetter = 'A';
	
	public void setQuestion(String question) {
		this.question = question;

	}
	
	public String getQuestion() {
		return question;
	}
	
	public void addOptions(String choice) {
		choices.add(currLetter + ") " + choice);
		currLetter++;
	}
	
	public void printOptions() {
		for(int i = 0; i < choices.size(); i++) {
			System.out.println(choices.get(i));
		}
	}
	
	public void setAnswer(String answer) {
		this.answer.add(answer);
	}
	
	public boolean isAnswer(String searchElement) {
		return answer.contains(searchElement);
	}
	
	public void resetOptions() {
		currLetter = 'A';
	}
}
