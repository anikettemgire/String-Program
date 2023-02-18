package com.pratice;

public class SirNameFind {

	public static void main(String[] args) {
		String name[]= {"aniket temgire","anikta gihe","g temgire","sam Domles","santosh Temgi"};
		String sirname="temgire";
		int sl=sirname.length();
		int namele=name.length;
		for(int i=0;i<namele;i++) {
			    int na=name[i].length();
			    String sub=name[i].substring(na-sl);
			     if(sub.equals(sirname)) {
			    	 System.out.println(name[i]);
			     }
		}

	}

}
