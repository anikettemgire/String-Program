package com.pratice;

public class noOfWord {

	public static void main(String[] args) {
	   String name[]= {"deepk","java","aniket","ajit"};
	   for(int i=0;i<name.length;i++) {
		  
		   for(int j=0;j<name.length-1;j++) {
			   if(name[j].compareTo(name[j+1])<0) {
				   String temp=name[j];
				   name[j]=name[j+1];
				   name[j+1]=temp;
				   
			   }
		   
		   }
		  
	   }
	   for(String s:name) {
		   System.err.println(s);
	   }

	}

}
