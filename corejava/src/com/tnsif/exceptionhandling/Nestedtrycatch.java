package com.tnsif.exceptionhandling;

public class Nestedtrycatch {
	public static void check() {
		String str="tns";
		int slength=str.length();
		System.out.println("String length"+slength);
		String anotr=null;
		int y=6;
		try {
			try {
			System.out.println(str.charAt(y));	
		}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of bound exception"+e.getMessage());
			}
			System.out.println("snother string"+anotr.length());
		
	}
		catch(NullPointerException ope) {
			System.out.println("null string exception"+ope.getMessage());
		}

}
}