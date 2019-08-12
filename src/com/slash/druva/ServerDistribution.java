package com.slash.druva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Druva Question - Find out of Date Software/Servers from the list of the
 * servers.
 * 
 * @author Slash
 *
 */
public class ServerDistribution {

	  public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new FileReader(".\\input2.txt"));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(".\\output2.txt"));

	    String str = "";
	    List<String[]> rowList = new ArrayList<>();
	    Map<String, String> softwareVersionMap = new HashMap<>();

	    while ((str = br.readLine()) != null) {
	      String[] rowArray = str.split(", ");
	      // Add entire row array to list
	      rowList.add(rowArray);
	    }

	    // Print the entire Row List
	    for (String[] rowElement : rowList) {
	      System.out.println("Input:\t" + Arrays.asList(rowElement));
	    }

	    for (int i = 0; i < rowList.size(); i++) {
	      for (int j = i + 1; j < rowList.size(); j++) {

	        // Enter only if software names are equal
	        if (rowList.get(i)[2].equalsIgnoreCase(rowList.get(j)[2])) {

	          String lowestVersion = getLowestVersion(rowList.get(i)[3], rowList.get(j)[3]);

	          // Verify if the software entry is already present in Map, if yes then compare the Map value with
	          // the 'lowestVersion' value
	          if (softwareVersionMap.containsKey(rowList.get(i)[2])) {
	            String finalLowestVersion = getLowestVersion(softwareVersionMap.get(rowList.get(i)[2]), lowestVersion);
	            // Add the 'finalLowestValue' in the map
	            softwareVersionMap.put(rowList.get(i)[2], finalLowestVersion);

	          } else {
	            // Enter Software name & version mapping if not already present in Software Map
	            softwareVersionMap.put(rowList.get(i)[2], lowestVersion);
	          }
	        }
	      }
	    }

	    System.out.println("\nSoftware Version Map:\t" + softwareVersionMap + "\n");

	    // Compare the values of Map with the rowList and get the 'Server Name'
	    for (String mapElement : softwareVersionMap.values()) {
	      for (String[] rowElement : rowList) {
	        if (rowElement[3].equalsIgnoreCase(mapElement)) {
	          System.out.println(rowElement[0]);
	          // Write server name to 'output' file
	          bw.write(rowElement[0] + System.lineSeparator());
	        }
	      }
	    }

	    bw.close();
	    br.close();
	  }

	  // Returns lowest version of 2 compared strings
	  public static String getLowestVersion(String o1, String o2) {

	    int temp1 = Integer.parseInt(o1.replaceAll("\\.", ""));
	    int temp2 = Integer.parseInt(o2.replaceAll("\\.", ""));

	    // Return lowest version
	    if (temp1 < temp2) {
	      //System.out.println("Lowest version -\t" + o1);
	      return o1;
	    } else {
	      //System.out.println("Lowest version -\t" + o2);
	      return o2;
	    }
	  }

}
