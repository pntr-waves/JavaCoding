package truong.howtoprogram.chapter14;

import java.util.Random;
import java.util.Scanner;

import truong.howtoprogram.chapter14.service.Chapter14Service;

public class Chapter14App {
	
	
	public static void main(String[] args) {
		Chapter14Service service =  new Chapter14Service();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
//		System.out.println("Exercise 14.3");
//		System.out.println("------------------------------");
//		String str2 = service.getStringInput(sc);
//		String str1 = service.getStringInput(sc);
//		System.out.println("Greater String");
//		System.out.println(service.getGreaterString(str1, str2));
//		System.out.println("Exercise 14.4");
//		System.out.println("------------------------------");
//		str1 = service.getStringInput(sc);
//		str2 = service.getStringInput(sc);
//		System.out.println("Input number of character to compare");
//		System.out.print("=> ");
//		int numberCharacter = service.inputNumber(sc);
//		System.out.println("Input start index in string 1");
//		System.out.print("=> ");
//		int indexOfString1 = service.inputNumber(sc);
//		System.out.println("Input start index in string 2");
//		System.out.print("=> ");
//		int indexOfString2 = service.inputNumber(sc);
//		System.out.println(service.compare2StringWithRegionMethod(str1, str2, numberCharacter, indexOfString1, indexOfString2) ? "2 string have equal" : "2 string not equal");
		System.out.println("Exercise 14.5");
		System.out.println("------------------------------");
		System.out.println("Sentence: " + service.getSentences(random));
	}
}

//E14.3 Write an application that uses String method compareTo to compare
//two strings input by the user. Output whether the first string is less than, equal to or greater than
//the second.

//E14.4 Write an application that uses String method region-
//Matches to compare two strings input by the user. The application should input the number of char-
//acters to be compared and the starting index of the comparison. The application should state
//whether the strings are equal. Ignore the case of the characters when performing the comparison.

//E14.5 Write an application that uses random-number generation to create
//sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
//by selecting a word at random from each array in the following order: article, noun, verb, preposi-
//tion, article and noun. As each word is picked, concatenate it to the previous words in the sentence.
//The words should be separated by spaces. When the final sentence is output, it should start with a
//capital letter and end with a period. The application should generate and display 20 sentences.
//The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
//array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should con-
//tain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
//contain the prepositions "to", "from", "over", "under" and "on".