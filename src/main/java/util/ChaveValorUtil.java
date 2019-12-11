package util;

import java.util.HashMap;
import java.util.Map;

public class ChaveValorUtil {
	private static Map<String, Integer> map = new HashMap<String, Integer>();

	public static Map<String, Integer> getCupCake() {
		map.clear();
		map.put("Cup Cake", 1);
		
		return map;
	}
	public static Map<String, Integer> getProdutos() {
		map.clear();
		map.put("Cup Cake", 1);
		map.put("Donut", 2);
		map.put("Pão Artesanal Italiano", 1);

		return map;
	}
}
