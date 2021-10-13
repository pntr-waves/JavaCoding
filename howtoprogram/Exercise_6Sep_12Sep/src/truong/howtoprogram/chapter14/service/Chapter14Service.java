package truong.howtoprogram.chapter14.service;

import java.util.Random;
import java.util.Scanner;

public class Chapter14Service {
	public String getStringInput(Scanner sc) {
		String input = "";
		System.out.println("Input String: ");
		System.out.print("=> ");
		input = sc.nextLine();
		return input;
	}

	public String getGreaterString(String str1, String str2) {
		if (str1.compareTo(str2) > 0) {
			return str1;
		} else {
			return str2;
		}
	}

	public int inputNumber(Scanner sc) {
		int numberCharacter = 0;
		numberCharacter = sc.nextInt();
		return numberCharacter;
	}

	public boolean compare2StringWithRegionMethod(String str1, String str2, int numberCharacterCompare,
			int startIndexOfString1, int startIndexOfString2) {
		return str1.regionMatches(true, startIndexOfString1, str2, startIndexOfString2, numberCharacterCompare);
	}

	public String getSentences(Random random) {
		String[] article = new String[] { "the ", "a ", "one ", "some ", "any " };
		String[] noun = new String[] { "boy ", "girl ", "dog ", "town ", "car " };
		String[] verb = new String[] { "drove ", "jumped ", "ran ", "walked ", "skipped " };
		String[] preposition = new String[] { "to ", "from ", "over ", "under ", "one " };
		return article[getRandomIndexOfArray(random, article.length)] + noun[getRandomIndexOfArray(random, noun.length)]
				+ verb[getRandomIndexOfArray(random, verb.length)]
				+ preposition[getRandomIndexOfArray(random, preposition.length)]
				+ article[getRandomIndexOfArray(random, article.length)]
				+ noun[getRandomIndexOfArray(random, noun.length)];
	}

	public int getRandomIndexOfArray(Random random, int sizeOfArray) {
		return random.nextInt(sizeOfArray - 1) + 1;
	}
}
