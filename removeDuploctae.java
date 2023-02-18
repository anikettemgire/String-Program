package com.pratice;



public class removeDuploctae {
	private static void removeduploctae(String a) {
		String s1="";
		for(int i=0;i<a.length();i++) {
			int cnt=0;
			for(int j=0;j<i;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					cnt++;
					break;
				}
			}
			if(cnt==0) {
				s1+=a.charAt(i);
			}
		}
		String con=new String(s1);
		System.out.println(con);
		
	}
	private static void Counteletter(String a) {
		int cnt=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}


	public static void main(String[] args) {
		String a="aaaabbbbbcdadn adnad nfdfdbvads";

		removeduploctae(a);
		Counteletter(a);

	}


}
