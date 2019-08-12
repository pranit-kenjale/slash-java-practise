package com.slash.druva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Druva Question - Reverse the order of fields on each line
 * 
 * @author Slash
 *
 */
public class ReverseFieldsOnEachLine {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(".\\input1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\output1.txt"));
		String str = "";

		while ((str = br.readLine()) != null) {

			String[] lineArray = str.split("\\|");	//split using '|', escape as '|' is a special character for REGEX
			String[] tempArray = new String[lineArray.length];

			// Swap the elements in the loop
			for (int i = 0, j = lineArray.length - 1; i <= lineArray.length - 1; i++, j--) {
				tempArray[i] = lineArray[j];
			}

			String finalLine = String.join("|", tempArray);
			System.out.println("Joined String:\t" + finalLine);

			// Write reverse line to file
			bw.write(finalLine + System.lineSeparator());
		}

		br.close();
		bw.close();
	}
}
