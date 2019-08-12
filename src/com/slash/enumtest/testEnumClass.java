package com.slash.enumtest;

public class testEnumClass {
	
	protected static void main(String args[]) throws Exception {
		
		for(EmpCode empCode:EmpCode.values()) {
			System.out.println("\nDepartment name: " + empCode + " Department Code: " + empCode.getCode());
			
			switch(empCode.getCode()) {
				case 10001: System.out.println("Department name: " + empCode); break;
				case 10002: System.out.println("Department name: " + empCode); break;
				case 10003: System.out.println("Department name: " + empCode); break;
				case 10004: System.out.println("Department name: " + empCode); break;
				default:
					throw new Exception("Invalid input!");
			
			}
		}
		
		
		
	}

}
