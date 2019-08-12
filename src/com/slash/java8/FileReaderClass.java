package com.slash.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileReaderClass {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Using Buffered Reader
		try (BufferedReader br = new BufferedReader(new FileReader(".\\TestFile.txt"))) {

			String str = "";

			// System.out.println(br.readLine());//prints a single line

			while ((str = br.readLine()) != null) {
				// System.out.println(str);
			}
		}

		System.out.println("\n\n*********************SEPARATOR*************************\n\n");

		// Using File Reader
		try (FileReader fr = new FileReader(".\\TestFile.txt")) {

			int i = 0;
			while ((i = fr.read()) != -1) {
				// System.out.print((char) i);
			}
		}

		System.out.println("\n\n*********************SEPARATOR*************************\n\n");

		// Using Scanner
/*		try (Scanner scan = new Scanner(new File(".\\TestFile.txt"))) {

			while (scan.hasNextLine()) {
				// System.out.println(scan.nextLine());
			}

		}*/

		System.out.println("\n\n*********************SEPARATOR*************************\n\n");

		List<String> lines = Collections.emptyList();

		// Using Files - readAllLines() method; returns List<String>
		try {
			lines = Files.readAllLines(Paths.get(".\\TestFile.txt"));

			for (String element : lines) {
				System.out.println(element);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\n\n*********************SEPARATOR*************************\n\n");

		// Using Files - readAllBytes() method; returns byte[]
		String data = new String(Files.readAllBytes(Paths.get(".\\TestFile.txt")));
		System.out.println(data);

	}

}
