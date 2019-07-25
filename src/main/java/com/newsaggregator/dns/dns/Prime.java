package com.newsaggregator.dns.dns;

public class Prime 
{
	public int primeno(int a) {
		int n =a,m=0,flag=0;
		m=n/2;
		if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }else{  
			   for(int i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n+" is prime number"); }  
			
		}
		return flag;
	}
}
