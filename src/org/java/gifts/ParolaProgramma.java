package org.java.gifts;

import java.util.HashMap;
import java.util.Map;

public class ParolaProgramma {

	public static void main(String[] args) {
		
		String word = "programma";
		int longness = word.length();
		
		Map<Character, Integer> charCounter = new HashMap<>();
		for (int x=0; x< longness; x++) {
			char wordChar = word.charAt(x);
			
			if (charCounter.containsKey(wordChar)) {
				charCounter.put(wordChar, charCounter.get(wordChar) + 1);
			} else {
				charCounter.put(wordChar, 1);
			}
		}
		System.out.println(charCounter);
	}
	
}
