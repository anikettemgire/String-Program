package com.pratice;

public class ReverseString {
	private static boolean revrse(String a) {
		int l=a.length();
		String rev="";
		for(int i=l-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		if(rev.equals(a)) {
			return true;
		}else
			return false;
		
	}

	public static void main(String[] args) {
		String a="aba ab";
		if(revrse(a)) {
			System.out.println(" palidrome");
		}else {
			System.out.println("not palidrome");
		}
		
	}

}
