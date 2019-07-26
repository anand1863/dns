package com.newsaggregator.dns.dns;

public class Factorial 
{
	int result= 1;
	public int fact(int a) 
	{	
		int number = a, result=1;
		
		for(int i=1;i<=number;i++) {
			result = result*i;
		}
		
		System.out.println("Value of integer "+result);
		
		return result ;
	}
}
