package com.newsaggregator.dns.dns;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

@RestController
public class ControllerBackend 
{
	@GetMapping(value="/topheadlines")
		public String index(@RequestParam(required=false) String country,@RequestParam(required=false) String category,@RequestParam(required=false) String q,@RequestParam(required=true) String apiKey,@RequestParam(required=false) String sources ) 
	{
		
		
		Request r = new Request();
		r.setCountry(country);
		r.setCategory(category);
		r.setApiKey(apiKey);
		r.setQ(q);
		
		
		MappingCall mc = new MappingCall();
		String result2 = mc.index2(r);
		
		return 	result2;

	}
	@GetMapping(value="/everything")
	public String mytext(@RequestParam(required=false) String sources,@RequestParam(required=false) String domains,@RequestParam(required=false) String excludeDomains,@RequestParam(required=false) String from,@RequestParam(required=false) String to,@RequestParam(required=false) String language,@RequestParam(required=false) String sortBy,@RequestParam(required=false) int page,@RequestParam(required=false) int pageSize,@RequestParam(required=true) String apiKey,@RequestParam(required=false) String f) {
		
		Request2 req = new Request2();
		req.setDomains(sources);
		req.setDomains(domains);
		req.setExcludeDomains(excludeDomains);
		req.setFrom(from);
		req.setTo(to);
		req.setLanguage(language);
		req.setSortBy(sortBy);
		req.setPageSize(pageSize);
		req.setPage(page);
		req.setApiKey(apiKey);
		req.setF(f);
		
		MappingCall2 mc = new MappingCall2();
		String result3 = mc.index3(req);
		
		return 	result3;
	}
  
}
