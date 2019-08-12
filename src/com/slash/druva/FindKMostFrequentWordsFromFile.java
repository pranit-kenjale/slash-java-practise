package com.slash.druva;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Druva Question - Find the 'k' most frequent words from a file
 * 
 * @author Slash
 * 
 * @see https://www.geeksforgeeks.org/find-the-k-most-frequent-words-from-a-file/
 *
 */
public class FindKMostFrequentWordsFromFile {

	public static void main(String[] args) throws IOException {

		// Using Files - readAllBytes() method; returns byte[]
		String str = new String(Files.readAllBytes(Paths.get(".\\TestFile.txt")));
		System.out.println(str);

		String[] strArray = str.split("[\\s\\n]+");

		Map<String, Integer> hm1 = new HashMap<>();
		Map<String, Integer> hm2 = new LinkedHashMap<>();
		
		for (int i = 0; i < strArray.length; i++) {

			if (!hm1.containsKey(strArray[i])) {
				hm1.put(strArray[i], 1);
			} else {
				hm1.put(strArray[i], hm1.get(strArray[i]) + 1);
			}
		}

		System.out.println("\n\nCharacter Occurrences Map is:\t" + hm1);

		hm2 = sortByValue(hm1);

		int count = 0;
		int max = 5;

		for (Map.Entry<String, Integer> entry : hm2.entrySet()) {
			if (count >= max)
				break;

			System.out.println(entry.getKey() + ": " + entry.getValue());
			count++;
		}

		System.out.println("\n\nCharacter Occurrences Map is:\t" + hm2);

	}

	// Method to sort HashMap by values & Reverse the sorted list before putting in 
	public static Map<String, Integer> sortByValue(Map<String, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());

		// System.out.println("Entry Set:\t" + hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// To sort the list in descending order
		Collections.reverse(list);
		// System.out.println("Sorted list: \t" + list);

		// put data from sorted list to HashMap
		Map<String, Integer> temp = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> element : list) {
			temp.put(element.getKey(), element.getValue());
		}
		return temp;
	}

}
