package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenctHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> coMap = new ConcurrentHashMap<>();
		coMap.put("Soumya", "Namani");
		coMap.put("Sravs", "Malla");
		coMap.put("Mouni", "idk");
		coMap.put("Ankanksha", "Pandey");
		
		Iterator<String> itr = coMap.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			//System.out.println(key+" "+coMap.get(key));
			if(key.equals("Mouni"))	coMap.remove(key);
		}
		System.out.println(coMap);

	}

}
