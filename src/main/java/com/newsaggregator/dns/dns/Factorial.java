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
		
//		System.out.println("Vlue recieved by a" +a );
//		int input=a;
//
//		System.out.println("Vlue recieved by input " +input);
//		
//		for(int i=1; i<=input; i++) 
//		{
//			result = result * i;
//			System.out.println("Value of I "+i);
//			System.out.println("Value of result "+result);
//
//			
//		}
//		System.out.println(result);
		return result ;
	}
}
