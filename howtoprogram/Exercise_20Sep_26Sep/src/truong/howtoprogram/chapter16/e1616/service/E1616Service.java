package truong.howtoprogram.chapter16.e1616.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E1616Service {
	public Map<String, Integer> getMapCharacter(String inputString) {
		Map<String, Integer> mapCharacter = new HashMap<>();
		String[] listCharacter = inputString.split(" ");
		for (String value : listCharacter) {
			String key = null;
			
			if (value.contains(".")) {
				key = value.toLowerCase().substring(0, value.length() - 1);
			} else {
				key = value.toLowerCase();
			}
			
			if (mapCharacter.containsKey(key)) {
				int count = mapCharacter.get(key);
				mapCharacter.put(key, count + 1);
			} else {
				mapCharacter.put(key, 1);
			}
		}
		return mapCharacter;
	}

	public void printNumberDuplicateWords(String inputString) {
		Map<String, Integer> mapCharacter = this.getMapCharacter(inputString);
		Set<String> setKeyCharacter = mapCharacter.keySet();

		for (String value : setKeyCharacter) {
			System.out.println(String.format("%s - %d", value, mapCharacter.get(value)));
		}
	}
}
