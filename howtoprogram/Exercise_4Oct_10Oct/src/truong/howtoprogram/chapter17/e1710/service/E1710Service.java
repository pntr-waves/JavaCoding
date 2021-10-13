package truong.howtoprogram.chapter17.e1710.service;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class E1710Service {
	private static List<Path> paths = new ArrayList<>();
	
	public List<Path> demo(Path path) throws IOException {
		DirectoryStream<Path> stream = Files.newDirectoryStream(path);
		for (Path entry : stream) {
			if (Files.isDirectory(entry)) {
				demo(entry);
			}
			paths.add(entry);
		}
		
		return paths;
	}
	
	public void getSumariesTypeFile() throws IOException {
		Map<String, Long> contentCount =  paths.stream()
			.collect(Collectors.groupingBy(entry -> entry.toString().split("\\.")[1], TreeMap::new, Collectors.counting()));
		
		Set<String> keySet = contentCount.keySet();
		
		for (String key : keySet) {
			System.out.println(String.format("%s - %d", key, contentCount.get(key)));
		}
	}
}
