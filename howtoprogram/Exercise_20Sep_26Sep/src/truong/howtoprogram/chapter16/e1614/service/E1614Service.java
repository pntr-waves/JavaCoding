package truong.howtoprogram.chapter16.e1614.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E1614Service {
	public Map<String, Integer> getMapTokenOfString(String inputString){
		String[] t = inputString.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < t.length; i++) {
			var subToken = t[i].split("");
			for (String st : subToken) {
				if (map.containsKey(st)) {
					int count = map.get(st);
					map.put(st, count + 1);
				} else {
					map.put(st, 1);
				}
			}
		}
		
		return map;
	}
	
	public void printResult(String inputString) {
		Map<String, Integer> mapTokens = this.getMapTokenOfString(inputString);
		Set <String> set = mapTokens.keySet();
		
		for(String key: set) {
			System.out.println(String.format("%s - %d", key, mapTokens.get(key)));
		}
	}
}
