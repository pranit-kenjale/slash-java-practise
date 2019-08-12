package com.slash.enumtest;

import java.util.Scanner;

public enum EmpCode {
	ASSOCIATE(10001), SENIOR_ASSOCIATE(10002), MANAGER(10003), SENIOR_MANAGER(10004), DEFAULT;
	
	//Empty constructor for default value
	EmpCode(){}
	
	//Constructor for employee Code Integer
	EmpCode(int code){
		this.code = code;
	}
	
	private int code;
	
	public int getCode() {
		return code;
	}
	
	//Return enum corresponding to passed dept code
	public static EmpCode getEnum(int code) {

		for (EmpCode empCode : EmpCode.values()) {
			if(empCode.getCode() == code)
				return empCode;
		}
		return DEFAULT;
	}
	
	
	public static void main(String args[]) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter DB code: ");
		int dbCode = scan.nextInt();
		scan.close();
		
		System.out.println("Department name for code " + dbCode + " is " + EmpCode.getEnum(dbCode));
	}

}
