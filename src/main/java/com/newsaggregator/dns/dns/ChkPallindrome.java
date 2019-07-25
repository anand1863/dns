package com.newsaggregator.dns.dns;


class ChkPallindrome
{
   public String pallindromefunc(String a)
   {
      String str, rev = "";
      str=a;
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      
      System.out.println(rev);
      System.out.println(str);
      if(str.equals(rev)) {
    	  System.out.println("It is a pallindrome");
    	  
      }
      else {
    	  System.out.println("It is NOT a pallindrome");
      }
      
      return rev;
 
   }
}