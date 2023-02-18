package com.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSpe {
	private static 	String  removespecific(String s1,String s) {
		String temp_array[]=s1.split(" ");
		String newString="";
		for(int i=0;i<temp_array.length;i++) {
			if(!temp_array[i].equals(s)) {
				newString+=temp_array[i]+" ";
			}
		}
		return newString;
	}

	public static void main(String[] args) throws IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter The String in the :");
		  String s1=br.readLine();
		  String s="is";
		 String str1= removespecific(s1,s);
		 System.out.println(str1);
		  

	}

}
