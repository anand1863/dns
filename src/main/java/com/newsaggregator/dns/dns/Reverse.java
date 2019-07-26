package com.newsaggregator.dns.dns;

public class Reverse {
public String reverse(String s) {
	
	      String str, rev = "";
	      str=s;
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	      
	      System.out.println(rev);
	      System.out.println(str);
	      return rev;
}
}
