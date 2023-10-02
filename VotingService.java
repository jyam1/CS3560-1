package assignment1;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;


public class VotingService {
	Scanner scanner = new Scanner(System.in);
	public HashMap<String, Integer> statistic = new HashMap<>();
	public ArrayList<Question> questions = new ArrayList<>();
	public ArrayList<Student> students = new ArrayList<>();
	
	public void printStatistic() {
		 for (Map.Entry<String, Integer> entry : statistic.entrySet()) {
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println(key + ": " + value);
	        }
	}
	
	public int chooseQuestionType() {
		System.out.println("1. Multiple Choice");
		System.out.println("2. Single Choice");
		int userInput = scanner.nextInt();
		
		return userInput;
	}
	
	public void storeQuestion(Question question) {
		questions.add(question);
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
}
