package truong.howtoprogram.chapter16.e1615.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class E1615Service {
	public Map<String, String> getMapColor(){
		Map<String, String> map = new HashMap<>();
		map.put("white", "#fff");
		map.put("silver", "#c0c0c0");
		map.put("gray", "#808080");
		map.put("black", "#000");
		map.put("maroon", "#800000");
		map.put("red", "#f00");
		map.put("orange", "#ffa500");
		map.put("yellow", "#ff0");
		map.put("olive", "#808000");
		map.put("lime", "#0f0");
		map.put("green", "#008000");
		map.put("aqua", "#0ff");
		map.put("blue", "#00f");
		map.put("navy", "#000080");
		map.put("teal", "#008080");
		map.put("fuchsia", "#f0f");
		map.put("purple", "#800080");
		
		return map;
	}
	
	public void printValueColor(String colorName) {
		Map<String, String> mapColor = this.getMapColor();
		Set<String> setColorName = mapColor.keySet();
		
		Iterator<String> itColorName = setColorName.iterator();
		String result = null;
		
		while(itColorName.hasNext()) {
			String item = itColorName.next();
			if(item.equals(colorName)) {
				result=item;
				break;
			}
		}
		
		if(result != null) {
			System.out.println(String.format("\nvalue: %s", mapColor.get(result)));			
		}else {
			System.out.println("not correct");
		}
	}
}
