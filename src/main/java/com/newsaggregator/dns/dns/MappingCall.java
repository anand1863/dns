package com.newsaggregator.dns.dns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class MappingCall
{
	
	//Request r = new Request();	
	public String index2(Request r) {
			
	System.out.println(r.getCountry());
		
	String finalUrl = "";
	String baseurl = "https://newsapi.org/v2/top-headlines?";
	String country = "country=" + r.getCountry();	
	String category = "category=" + r.getCategory();
	String apiKey = "apiKey=" + r.getApiKey();
	String q = "q=" + r.getQ();
	String sources = "sources=" + r.getQ();
	
	finalUrl = baseurl +apiKey;
	
	System.out.println("1 : "+   finalUrl);			
	
	if(r.getQ()!=null)
	{
	 finalUrl = finalUrl + "&" + q  ;
	}
	
	if(r.getQ()!=null)
	{
	 finalUrl = finalUrl + "&" + sources;
	}
	
	if(r.getCountry()!=null)
	{
		finalUrl = finalUrl + "&" + country;
	}
	
	if(r.getCategory()!=null)
	{
		finalUrl = finalUrl + "&" + category;
	}
	
	System.out.println("2 : " +finalUrl);			
			
	HttpClient client = HttpClientBuilder.create().build();
	HttpGet request = new HttpGet(finalUrl);
	HttpResponse response;
	BufferedReader rd;
	StringBuffer result = new StringBuffer();
	try {
		 response = client.execute(request);
		 rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}	
						
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return result.toString();
	}
}
