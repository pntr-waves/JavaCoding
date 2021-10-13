package exercise740;

import java.util.Scanner;

enum Question {
	Q1("question 1?"), Q2("question 2?"), Q3("question 3?"), Q4("question 4?"), Q5("question 5?");

	private String title;

	Question(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

public class App {
	
//	The Internet and the web are enabling more people to network, join a cause, voice
//	opinions, and so on. Recent presidential candidates have used the Internet intensively to get out
//	their messages and raise money for their campaigns. In this exercise, you’ll write a simple polling
//	program that allows users to rate five social-consciousness issues from 1 (least important) to 10
//	(most important). Pick five causes that are important to you (e.g., political issues, global environ-
//	mental issues). Use a one-dimensional array topics (of type String) to store the five causes. To sum-
//	marize the survey responses, use a 5-row, 10-column two-dimensional array responses (of type
//	int), each row corresponding to an element in the topics array. When the program runs, it should
//	ask the user to rate each issue. Have your friends and family respond to the survey. Then have the
//	program display a summary of the results, including:
//	a) A tabular report with the five topics down the left side and the 10 ratings across the top,
//	listing in each column the number of ratings received for each topic.
//	b) To the right of each row, show the average of the ratings for that issue.
//	c) Which issue received the highest point total? Display both the issue and the point total.
//	d) Which issue received the lowest point total? Display both the issue and the point total.
	
	public static void main(String[] args) {
		final int ROW_LENGTH = 5;
		final int COLUMN_LENGTH = 10;
		Scanner sc = new Scanner(System.in);

		int[][] result = new int[ROW_LENGTH][COLUMN_LENGTH];
		int index = 0;
		Question[] questions = Question.values();

		while (index < ROW_LENGTH) {
			System.out.println(questions[index].getTitle());
			System.out.println("Enter: 1 to 10 score");
			int r = sc.nextInt();
			do {
				if (r < 1 || r > 10) {
					System.out.println("your result is unaccept");
				}
			} while (r < 1 || r > 10);
			result[index][r-1] += 1;

			index++;
		}

		// print result

		System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");

		for (int i = 0; i < ROW_LENGTH; i++) {
			System.out.print(questions[i].getTitle() + "\t");
			for (int j = 0; j < COLUMN_LENGTH; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

}
