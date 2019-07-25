package com.newsaggregator.dns.dns;

public class Sum
{
	public String sumofdigits(int a) {
		int result=0,s=a,b = 0;
		
//	while(s>0) {
//			b=s%10;
//			result+=s;
//			s/=10;
//		}
		
		try {
			int length = String.valueOf(a).length();
			
			System.out.println("Length "+ length);
			for(int i=0;i<length;i++)
			{
//			System.out.println(result);
//			System.out.println(String.valueOf(a));
//			System.out.println(String.valueOf(a));
				System.out.println("i= " + String.valueOf(a).charAt(i));
				
				result = result + Character.getNumericValue(String.valueOf(a).charAt(i)) ;
				
				System.out.println("result= " + result);
				
				
			}
			return String.valueOf(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "Please enter a number";
		}
	}
	
}
	
