package com.slash.java8;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrencesString {

  public static void main(String[] args) {

	//Rocket
    String str = "PRPANITP";
    Map<Character, Integer> hm1 = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {

      if (!hm1.containsKey(str.charAt(i))) {
        hm1.put(str.charAt(i), 1);
      } else {
        hm1.put(str.charAt(i), hm1.get(str.charAt(i)) + 1);
      }
    }

    System.out.println("Character Occurrences Map is:\t" + hm1);
  
  }
}
