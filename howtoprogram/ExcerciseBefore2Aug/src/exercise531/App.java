package exercise531;

import java.util.Scanner;

public class App {
	
//	The controversial issue of global warming has been widely
//	publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
//	and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
//	Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
//	about man-made climate change.” Research both sides of the global warming issue online (you
//	might want to search for phrases like “global warming skeptics”). Create a five-question multiple-
//	choice quiz on global warming, each question having four possible answers (numbered 1–4). Be ob-
//	jective and try to fairly represent both sides of the issue. Next, write an application that administers
//	the quiz, calculates the number of correct answers (zero through five) and returns a message to the
//	user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if
//	three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list
//	of some of the websites where you found your facts.
	
	public static void main(String[] args) {
		int length = Questions.values().length;
		int index = 1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Questions questions = null;
		int result = 0;
		
		while (index <= length) {
			int answer = 0;
			System.out.println("------------------------------");
			questions = selectQuestion(index);
			System.out.println(questions.getQuestionName());
			printAnswers(questions);
			System.out.print("=> ");
			answer = scanner.nextInt();
			if(checkResult(questions, answer)) {
				result++;
			}
			index++;
		}
		
		printResult(result);
	}
	
	public static void printResult(int result) {
		switch(result) {
		case 1: 
			System.out.println("Time to brush up on your knowledge of global warming");
			break;
		case 2: 
			System.out.println("Time to brush up on your knowledge of global warming");
			break;
		case 3: 
			System.out.println("Time to brush up on your knowledge of global warming");
			break;
		case 4: 
			System.out.println("Very good");
			break;
		case 5: 
			System.out.println("Exellent");
			break;
		}
		
	}
	
	public static boolean checkResult(Questions q, int answer) {
		return q.getCorrectAnwsers() == answer;
	}
	
	public static void printAnswers(Questions q) {
		int length = q.getAnwsers().length;
		int index = 0;
		while(index < length) {
			System.out.println(index + " _ " + q.getAnwsers()[index]);
			index ++;
		}
	}

	public static Questions selectQuestion(int index) {
		Questions question = null;
		switch (index) {
		case 1:
			question = Questions.Q1;
			break;
		case 2:
			question = Questions.Q2;
			break;
		case 3:
			question = Questions.Q3;
			break;
		case 4:
			question = Questions.Q4;
			break;
		case 5:
			question = Questions.Q5;
			break;
		}
		return question;
	}
}
