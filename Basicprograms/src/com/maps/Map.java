package com.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map= new HashMap<Integer,String>();
		map.put(1, "jaggu");
		map.put(21, "hari");
		map.put(13, "harish");
		map.put(9, "giri");
		map.put(2, "pani");
		map.put(22, "poori");
		map.put(90, "masala");
		map.put(89, "chapathi");
		Set set = map.keySet();
		System.out.println(map.keySet());//the ke
		Iterator it = set.iterator();
		//System.out.println(it.next());
		for(Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());
		}
		
		//Collections.sort(map);
   }
	
}
