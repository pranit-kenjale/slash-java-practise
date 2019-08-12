package com.slash.druva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Druva Question - Merge Lines Alternatively
 * 
 * You are expected to merge 17822715 with fbaeecfd to produce the line
 * 1f7b8a2e2e7c1f5d. When the two lines don't have the same number of
 * characters, then intersperse the characters as long as possible, after which
 * simply write out the characters of the other line. And finally, if the input
 * file has an odd number of lines, the last line will not be paired with any
 * other line - in which case it is simply written out without any change.
 * 
 * @author Slash
 * 
 * @see https://www.geeksforgeeks.org/alternatively-merge-two-strings-in-java/
 */
public class MergeLinesAlternatively {

	public static void main(String[] args) throws IOException {

		List<String> allLines = new LinkedList<>();

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String str = "";
		while ((str = br.readLine()) != null) {
			allLines.add(str);
		}

		System.out.println("All Lines:\t" + allLines);

		mergeStrings(allLines);

		br.close();
	}

	public static void mergeStrings(List<String> allLines) throws IOException {

		// Loop to execute comparison of 2 strings/lines, depending on the number of
		// input lines in the file
		for (int i = 0, j = i + 1; i < allLines.size() - 1; i = i + 2, j = i + 1) {

			StringBuilder finalString = new StringBuilder();

			int m = 0;
			int k = 0;
			while (m < allLines.get(i).length() && k < allLines.get(j).length()) {
				finalString.append(allLines.get(i).charAt(m++));
				finalString.append(allLines.get(j).charAt(k++));
			}

			if (m != allLines.get(i).length()) {
				finalString.append(allLines.get(i).substring(m));
			}

			if (k != allLines.get(j).length()) {
				finalString.append(allLines.get(j).substring(k));
			}

			System.out.println("Final String:\t" + finalString);
			writeToFile(finalString.toString());
		}

		// To print the last line in case of ODD number of input strings/lines
		if (allLines.size() % 2 != 0)
			writeToFile(allLines.get(allLines.size() - 1));
	}

	// Write String to output file
	public static void writeToFile(String line) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true));// append mode - TRUE
		bw.write(line + System.lineSeparator());
		bw.flush();
		bw.close();
	}

}
