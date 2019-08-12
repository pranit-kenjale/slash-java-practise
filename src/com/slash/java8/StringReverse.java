package com.slash.java8;

public class StringReverse {

  public static void main(String[] args) {

    String input = "INDIA";
    String reverse = "";

    //Reverse string using charAt() method
    for (int i = input.length() - 1; i >= 0; i--) {
      reverse = reverse + input.charAt(i);
    }
    System.out.println("\nReverse string using charAt() method:\t" + reverse);


    //Reverse string using toCharArray() method
    char[] resultChar = input.toCharArray();
    String charReverse="";
    
    for(int i=resultChar.length-1; i>=0; i--)
      charReverse = charReverse + resultChar[i];
    
    System.out.println("\nReverse using toCharArray() method:\t" + charReverse);
    
    
    //Reverse using reverse() method of StringBuilder
    StringBuilder strBuilder = new StringBuilder(input);
    strBuilder = strBuilder.reverse();
    System.out.println("\nReverse using StringBuilder:\t" + strBuilder);
    
    
    
    //Reverse using split() method
    String[] splitReverseString = input.split("");
    System.out.println("\nReverse using string's split() method");
    for(int i=splitReverseString.length -1; i>=0; i--)
      System.out.print(splitReverseString[i]);
    
    System.out.println("\nReverse string split() method -\t" + String.join("", splitReverseString));
    
    
    
    
    
    
    //Reverse string using Byte Array
    byte[] strByte = input.getBytes();
    byte[] resultByte = new byte[strByte.length];

    for (int i = 0; i<strByte.length; i++) {
      resultByte[i] = strByte[strByte.length-i-1];
    }
    System.out.println("\nReversed Byte string:\t" + new String(resultByte));
    
    
    

  }

}
