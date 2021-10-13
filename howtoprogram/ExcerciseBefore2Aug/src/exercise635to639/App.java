package exercise635to639;

import java.security.SecureRandom;
import java.util.Scanner;

public class App {
	
//	The use of computers in education is referred to as com-
//	puter-assisted instruction (CAI). Write a program that will help an elementary school student learn
//	multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
//	should then prompt the user with a question, such as
//	How much is 6 times 7?
//	The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
//	display the message "Very good!" and ask another multiplication question. If the answer is wrong,
//	display the message "No. Please try again." and let the student try the same question repeatedly
//	until the student finally gets it right. A separate method should be used to generate each new ques-
//	tion. This method should be called once when the application begins execution and each time the
//	user answers the question correctly.
	
	private static int number1 = 0;
	private static int number2 = 0;

	enum PositiveComment {

		E1("Verry good!"), E2("Excellent!"), E3("Nice work!"), E4("Keep up the good work!");

		private String title;

		PositiveComment(String title) {
			this.setTitle(title);
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	enum LevyComment {

		E1("No. Please try again."), E2("Wrong. Try once more."), E3("Don't give up!"), E4("No. Keep trying.");

		private String title;

		LevyComment(String title) {
			this.setTitle(title);
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	enum Level {
		EASY(1, 9), MEDIUM(10, 20);

		private int min;
		private int max;

		Level(int min, int max) {
			this.min = min;
			this.max = max;
		}

		public int getMin() {
			return this.min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return this.max;
		}

		public void setMax(int max) {
			this.max = max;
		}
	}

	enum Type {
		ADD("add"), SUB("minus"), MUL("times"), DIV("divide");

		private String title;

		Type(String title) {
			this.setTitle(title);
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	}

	public static void main(String[] args) {
		int continueLoop = 1;
		int correctAnswers = 0;
		String comment = null;
		SecureRandom sr = new SecureRandom();
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Difficult");
		System.out.println("1. Easy");
		System.out.println("2. Medium");
		System.out.print("=> ");
		int level = sc.nextInt();

		System.out.println("Pick a type of arithmetic");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Random");
		System.out.print("=> ");
		int type = sc.nextInt();

		while (continueLoop <= 10) {

			if (isCorrectAnswer(sr, sc, level, type)) {
				comment = printComment("correct", sr);
				System.out.println(comment);
				correctAnswers++;
			} else {
				comment = printComment("incorrect", sr);
				System.out.println(comment);
			}
			continueLoop++;
		}

		double result = (correctAnswers / 10) * 100;
		if (result > 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		} else {
			System.out.println("Please ask your teacher for extra help");
		}

	}

	public static boolean isCorrectAnswer(SecureRandom sr, Scanner sc, int level, int type) {

		Level l = chooseLevel(level);
		Type t = chooseType(sr, type);
		int result = 0;
		double resultDiv = 0;
		number1 = l.getMin() + sr.nextInt(l.getMax());
		number2 = l.getMin() + sr.nextInt(l.getMax());

		System.out.println("How much " + number1 + " " + t.getTitle() + " " + number2 + "?");
		System.out.print("=> ");

		if (t == Type.DIV) {
			resultDiv = sc.nextDouble();
		} else {
			result = sc.nextInt();
		}

		switch (t) {
		case ADD:
			return result == number1 + number2;
		case SUB:
			return result == number1 - number2;
		case MUL:
			return result == number1 * number2;
		default: {
			double n1 = (double) number1;
			double n2 = (double) number2;
			System.out.println((double) Math.round((n1 / n2 * 1.0) * 10) / 10);
			return resultDiv == (double) Math.round((n1 / n2 * 1.0) * 10) / 10;
		}
		}

	}

	public static Type chooseType(SecureRandom sr, int type) {
		switch (type) {
		case 1:
			return Type.ADD;
		case 2:
			return Type.SUB;
		case 3:
			return Type.MUL;
		case 4:
			return Type.DIV;
		default: {
			int length = Type.values().length;
			int index = sr.nextInt(length - 1);
			return Type.values()[index];
		}

		}
	}

	public static Level chooseLevel(int level) {

		if (level == 2) {
			return Level.MEDIUM;
		} else {
			return Level.EASY;
		}
	}

	public static String printComment(String status, SecureRandom sr) {
		int index = sr.nextInt(3);

		switch (status) {
		case "correct":
			return PositiveComment.values()[index].getTitle();
		default:
			return LevyComment.values()[index].getTitle();
		}
	}
}
