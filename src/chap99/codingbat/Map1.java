package chap99.codingbat;

import java.util.Map;

public class Map1 {
	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}

		map.put("bread", "butter");

		return map;
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			String aVal = map.get("a");
			String bVal = map.get("b");

			map.put("ab", aVal + bVal);
		}

		return map;
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}

		map.remove("c");

		return map;
	}

	public Map<String, String> mapBully(Map<String, String> map) {

		if (map.containsKey("a")) {
			String aval = map.get("a");
			map.put("b", aval);
			map.put("a", "");
		}

		return map;
	}
}
