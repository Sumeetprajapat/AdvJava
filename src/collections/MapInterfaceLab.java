package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceLab {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(50, "Rohit Sharma");
		map.put(100, "Abhishek  Sharma");
		map.put(90, "Shreyas  Iyer");
		map.put(45, "MS Dhoni");
		map.put(0, "Virat Kohli");

		System.out.println(map.containsKey(50));
		int searchKey = 100;
		String name = map.get(searchKey);

		if (name != null) {
			System.out.println("Name with ID " + searchKey + ": " + name);
		} else {
			System.out.println("No name found for ID " + searchKey);
		}

	}
}
