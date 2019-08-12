package com.slash.java8;

import com.slash.enumtest.testEnumClass;

public class TestJava8Code extends testEnumClass {
	
	TestJava8Code(){
	}
	


		
	
  public void method(Object v) 
  { 
      System.out.println("Primitive type byte formal argument :" + v); 
  } 
    
  // overloaded method primitive(int) formal arguments 
  public void method(int a) 
  { 
      System.out.println("Widening type long formal argument :" + a); 
  } 

  public static void main(String... args) throws Exception {

    TestJava8Code aq= new TestJava8Code();
    aq.method(null);
    
    String str1= "test";
    String str2 = str1;
    String str3 = new String("test1");
    
    if (str1 == str3)
    	System.out.println("Equal!");
    	
    
	 System.out.println(7 + 7 + "\"Java\"");   
     System.out.println("Java" + 7 + 7);
  
  }
  
  
  

}
 