package application.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

		//書き込み
		map1.put(0, "ぶどう");
		map1.put(3, "桃");
		//上書き
		map1.remove(3);
		System.out.println(map1.containsKey(3));

	}
}
