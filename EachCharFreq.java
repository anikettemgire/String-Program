package com.pratice;
import java.util.*;
public class EachCharFreq {
 
	private static void eachCharFrequency(String s) {
		 String s1=s.replaceAll(" ", "");
		  System.out.println(s1);
		  HashMap<Character,Integer> hm=new HashMap<>();
		  for(int i=0;i<s1.length();i++) {
			  char x=s1.charAt(i);
			  if(hm.containsKey(x)) {
				  hm.put(x, hm.get(x)+1);
			  }else {
				  hm.put(x, 1);
			  }
		  }
		  System.out.println(hm);
	}
	private static void CoundWord(String s) {
		String name[]=s.split(" ");
		System.err.println("no of words are the");
		System.out.println(name.length);
	}
	public static void main(String[] args) {
		  String s="java Progarm is the hard";
		  eachCharFrequency(s);
		  CoundWord(s);
		  Duplicate(s);
		  norepating(s);
		  

	}
	private static void norepating(String s) {
	       String s1=s.replaceAll(" ", "");
	       int i=0;
	       int l=s1.length();
	       Map<Character,Integer> m=new HashMap<>();
	       while(i<l) {
	    	   char c=s.charAt(0);
	       if(m.containsKey(m)) {
	    	   m.put(c, m.get(c)+1);
	       }else {
	    	   m.put(c, 1);
	       }
	       i++;
	       }
	       for(int j=0;j<s1.length();j++) {
	    	   char D=s1.charAt(j);
	    	   if(m.get(D)==1){
	    		   System.out.println("first no repating is the "+D);
	    		   break;
	    	   }
	       }
	}
	private static void Duplicate(String s) {
		 String s2=s.replaceAll(" ", "");
		 int i=0;
		 Map<Character,Integer> m=new HashMap<>();
		 int l=s2.length();
		 while(i<l) {
			 char x=s.charAt(i);
			 if(m.containsKey(x)) {
				 m.put(x, m.get(x)+1);
			 }else {
				 m.put(x, 1);
			 }
			 i++;
		 }
		 m.forEach((k,v)->{
			 if(v>1) {
				 System.out.println(k);
			 }
		 });
		
	}

}
