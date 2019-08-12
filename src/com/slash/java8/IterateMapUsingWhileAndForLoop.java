package com.slash.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMapUsingWhileAndForLoop {

  public static void main(String[] args) {
    
    //Iterate HashMap using While and advance for loop
    Map<Integer,String> map = new HashMap<>();
    map.put(2, "slash2");
    map.put(5, "slash5");
    map.put(7, "slash7");
    
    System.out.println("Iterate map using WHILE loop-");
    
    Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
    
    while(iterator.hasNext()) {
      Map.Entry entry = (Map.Entry) iterator.next();
      System.out.println("Key is:\t" + entry.getKey() + "\tValue is:\t" + entry.getValue());
    }
    
    System.out.println("\nIterate map using FOR loop-");
    
    for(Map.Entry entry1: map.entrySet()) {
      System.out.println("Key is:\t" + entry1.getKey() + "\tValue is:\t" + entry1.getValue());
    }
    
    
  }

}
