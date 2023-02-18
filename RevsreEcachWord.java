package com.pratice;


public class RevsreEcachWord {
	private static void revse(String s) {
	
		String s1="";
		String temp_array[]=s.split(" ");
		for(int i=0;i<temp_array.length;i++) {
			String rev_word="";
			String word=temp_array[i];
			for(int j=word.length()-1;j>=0;j--) {
				rev_word+=word.charAt(j);
			}
			s1+=rev_word+" ";
		}
		System.out.println(s1);
		}
	   private static void leng(String a) {
		  String cha[]=a.split(" ");
		  for(int i=0;i<cha.length;i++) {
			  String word=cha[i];
			  if(word.length()==3) {
			  System.out.println(word);
		  }
		  } 
		   
	   }	

	public static void main(String[] args) {
		String s="sam is the very telnemt pepople of the aniket and";
		System.out.println(s.toUpperCase());
		String s2="anike Temgirrr IS THE CHILD OF KSILS YEMFIE";
		System.out.println(s2.toLowerCase());
		revse(s);
		leng(s);


}
}
