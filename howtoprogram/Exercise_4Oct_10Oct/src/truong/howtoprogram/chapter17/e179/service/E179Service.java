package truong.howtoprogram.chapter17.e179.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E179Service {
	public void getSumarize() throws IOException {
		Pattern pattern = Pattern.compile("");
		
		Map<String, Long> wordCounts = Files.lines(Paths.get("C:\\Users\\Truong\\Downloads\\jcpicker.txt"))
				.map(line -> line.replaceAll("(?!')\\p{P}", ""))
				.flatMap(line -> pattern.splitAsStream(line))
				.collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
		
//		double sum = wordCounts.entrySet().stream()
//			.collect(Collectors.toList())
//			.stream()
//			.mapToDouble(word -> word.getValue())
//			.sum();
//		
//		return sum;
		
		Set<String> keys = wordCounts.keySet();
		for(String s : keys) {
			System.out.println(String.format("%s - %d" , s, wordCounts.get(s)));
		}
			
	}
}
