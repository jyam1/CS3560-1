package assignment1;

import java.util.ArrayList;

public class Student {
	
	private ArrayList<String> answer = new ArrayList<>();
	private static int IdCounter = 0;
	private String ID;
	
	Student(){
		incrementID();
		this.ID = String.valueOf(IdCounter);
	}
	
	public void setAnswer(String input) {
			this.answer.add(input);
		
	}
	
	
	public String getID() {
		return ID;
	}
	
	public void incrementID() {
		IdCounter++;
	}
}
