package exercise710;

public class App {
	
//	Use a one-dimensional array to solve the following problem: A com-
//	pany pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
//	their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week re-
//	ceives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
//	that determines how many of the salespeople earned salaries in each of the following ranges (assume
//	that each salesperson’s salary is truncated to an integer amount):
//	a) $200–299
//	b) $300–399
//	c) $400–499
//	d) $500–599
//	e) $600–699
//	f)
//	$700–799
//	g) $800–899
//	h) $900–999
//	i)
//	$1,000 and over
//	Summarize the results in tabular format.
	
	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;
		String[] array = new String[ARRAY_LENGTH];
		double min = 200;
		double max = 299;
		int index = 0;

		while (index < ARRAY_LENGTH) {
			double minSalary = 200 + 0.09 * min;
			double maxSalary = 200 + 0.09 * max;

			String result = Math.floor(minSalary * 10) / 10 + "$ - " + Math.floor(maxSalary * 10) / 10 + "$";
			array[index] = result;
			min += 100;
			max += 100;
			index++;
		}
		
		printResult(array);
	}

	public static void printResult(String[] array) {
		int length = array.length;
		int index = 0;
		while (index < length) {
			System.out.println("Salespeople " + (index + 1) + ": " + array[index]);
			index++;
		}
	}
}
