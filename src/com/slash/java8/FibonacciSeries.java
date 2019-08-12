package com.slash.java8;

public class FibonacciSeries {

  public static void main(String[] args) {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc

    int n1 = 0;
    int n2 = 1;
    int n3;
    int num = 10;

    System.out.print(n1 + " " + n2); // Print 0 and 1

    for (int i = 2; i < num; i++) {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }

}
