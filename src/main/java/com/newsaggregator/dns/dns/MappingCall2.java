package com.newsaggregator.dns.dns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class MappingCall2 {

	public String index3(Request2 req) {
		
		System.out.println(req.getDomains());
			
		String finalUrl = "";
		String baseurl = "https://newsapi.org/v2/top-headlines?";
		String domain = "domain=" + req.getDomains();	
		String sources = "sources=" + req.getSources();
		String apiKey = "apiKey=" + req.getApiKey();
		String f = "f=" + req.getF();
		String from = "from=" + req.getFrom();
		String excludedomains = "excludedomains=" + req.getExcludeDomains();
		String language = "language=" + req.getLanguage();
		String sortby = "sortby=" + req.getSortBy();
		String pagesize = "pagesize=" + req.getPageSize();
		String page = "page=" + req.getPage();



		
		finalUrl = baseurl +apiKey;
		
		System.out.println("1 : "+   finalUrl);			
		
		if(req.getDomains()!=null)
		{
		 finalUrl = finalUrl + "&" + domain  ;
		}
		
		if(req.getSources()!=null)
		{
		 finalUrl = finalUrl + "&" + sources;
		}
		
		if(req.getF()!=null)
		{
			finalUrl = finalUrl + "&" + f;
		}
		
		if(req.getFrom()!=null)
		{
			finalUrl = finalUrl + "&" + from;
		}
		
		if(req.getExcludeDomains()!=null)
		{
			finalUrl = finalUrl + "&" + excludedomains;
		}
		
		if(req.getLanguage()!=null)
		{
			finalUrl = finalUrl + "&" + language;
		}
		
		if(req.getSortBy()!=null)
		{
			finalUrl = finalUrl + "&" + sortby;
		}
		
/*		if(req.getPageSize()!=null)
		{
			finalUrl = finalUrl + "&" + pagesize;
		}
		
		if(req.getPage()!=null)
		{
			finalUrl = finalUrl + "&" + page;
		} */
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
