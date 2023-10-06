package assignment1;
import java.util.Random;
import java.util.Scanner;

public class SimulationDriver {

	public static void main(String[] args) {
		
		VotingService system = new VotingService();
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int randomInt = random.nextInt(3) + 1;
		
		for (int i = 0; i < randomInt; i++) {
			system.addStudent(new Student());
		}
		
		Question question1 = new MultipleChoice();
		Question question2 = new SingleChoice();
		
		system.storeQuestion(question1);
		system.storeQuestion(question2);
		
		question1.setQuestion("What equals 2");
		question1.addOptions("8-6");
		question1.addOptions("1+1");
		question1.addOptions("3+2");
		question1.addOptions("4-2");
		question1.setAnswer("A");
		question1.setAnswer("B");
		question1.setAnswer("D");
		
		question2.setQuestion("Water is H20");
		question2.addOptions("True");
		question2.addOptions("False");
		question2.setAnswer("1");
		
		System.out.println("For multiple choice questions, seperate answers with a comma");
		for (int j = 0; j < system.questions.size(); j++) {
			
			System.out.println(system.questions.get(j).getQuestion());
			system.questions.get(j).printOptions();
		
			for (int i = 0; i < system.students.size(); i++) {
				System.out.println("Set answer for student " + system.students.get(i).getID());
				String userInput = scanner.nextLine();
				
				String[] studentAnswer = userInput.split(",");
				
				for (String answer : studentAnswer) {
		            system.students.get(i).setAnswer(answer);
		            
		            if (system.statistic.containsKey(answer)) {
		            	int oldValue = system.statistic.get(answer);
		            	int newValue = oldValue + 1;
		            	system.statistic.put(answer, newValue);
		            }
		            
		            else {
		            	system.statistic.put(answer, 1);
		            }
		            
		    
		        }
				
			}
			
			system.printStatistic();
			system.questions.get(j).resetOptions();
			system.statistic.clear();
			System.out.println("");
		}
		
	}

}
