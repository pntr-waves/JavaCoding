package truong.howtoprogram.chapter16.e1613.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class E1613Service {
	public List<String> getListFirstName() {
		String[] stringArray = new String[] { "Jax", "Jayce", "Karthus", "Jax", "Wukong", "Jayce", "Ashe", "Jhin",
				"Zac", "Kataria", "Jhin", "Vex", "Vayne", "Varus", "Vex", "Lux", "Garen", "Gangplank", "Garen", "Jinx",
				"Ashe", "Akali" };
		List<String> listFirstName = Arrays.asList(stringArray);
		return listFirstName;
	}

	public Set<String> getSetFirtName(List<String> listFirstName) {
		Set<String> set = new HashSet<>(listFirstName);
		return set;
	}

	public void printFirstNameNoDuplicate(List<String> listFirstName) {
		Set<String> set = this.getSetFirtName(listFirstName);
		int count = 0;
		System.out.println("Print first name and eliminates duplicates");
		for (String value : set) {
			count++;
			System.out.println(count + " - " + value);
		}
	}

	public void printSearchResult(List<String> listFirstName, String firstName) {
		Set<String> set = this.getSetFirtName(listFirstName);
		Iterator<String> it = set.iterator();
		String result = null;
		while(it.hasNext()) {
			String item = it.next();
			if(firstName.equals(item)) {
				result = item;
				break;
			}
		}
		if(result != null) {
			System.out.println("Your first name has stored");
		}else {
			System.out.println("not result");
		}
	}
}
