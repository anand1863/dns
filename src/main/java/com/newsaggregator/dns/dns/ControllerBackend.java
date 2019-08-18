package com.newsaggregator.dns.dns;

import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ControllerBackend 
{
	@GetMapping(value="/topheadlines")
		public String index(@RequestParam(required=false) String country,@RequestParam(required=false) String category,@RequestParam(required=false) String q,@RequestParam(required=true) String apiKey) 
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
	public String mytext(@RequestParam(required=false) String domains,@RequestParam(required=false) String excludeDomains,@RequestParam(required=false) String from,@RequestParam(required=false) String to,@RequestParam(required=false) String language,@RequestParam(required=false) String sortBy,@RequestParam(required=false) int page,@RequestParam(required=false) int pageSize,@RequestParam(required=true) String apiKey,@RequestParam(required=false) String f) {
		
		Request2 req = new Request2();
		req.setDomains(domains);
		req.setExcludeDomains(excludeDomains);
		req.setFrom(from);
		req.setTo(to);
		req.setLanguage(language);
		req.setSortBy(sortBy);
/*
 		req.setPageSize(pageSize);
		req.setPage(page);
  */
		req.setApiKey(apiKey);
		req.setF(f);
		
		MappingCall2 mc = new MappingCall2();
		String result3 = mc.index3(req);
		
		return 	result3;
	}
	@GetMapping(value="/pallindrome")
	public String pallindrome(@RequestParam(required=true) String pall){
		ChkPallindrome ck = new ChkPallindrome();
		
		//System.out.println(ck.pallindromefunc(pall));
		return ck.pallindromefunc(pall);
	}
	@GetMapping(value="/sumofdigits")
	public String sod(@RequestParam(required=true)int number) {
		Sum s = new Sum();
		//System.out.println(s.sumofdigits(number));
		return s.sumofdigits(number);
	}
	@GetMapping(value="/factorial")
	public int fact(@RequestParam(required=true)int numbers) {
		System.out.println("input value" + numbers);
		Factorial f = new Factorial();
		System.out.println(f.fact(numbers));
		return f.fact(numbers);
	}
	@GetMapping(value="/prime")
	public String prime(@RequestParam(required=true) int number) {
		Prime pr = new Prime();
		int flag=pr.primeno(number);
		if(flag==0) {
			String s="Number is Prime :" + number;
			return s;
		}
		else {
			String s="Number is NOT Prime :" + number;
			return s;

		}
		
	}
	@GetMapping(value="/reversestring")
	public String rev(@RequestParam(required=true) String s) {
		System.out.println("Input the string "+s);
		Reverse st = new Reverse();
		return st.reverse(s);
	}
	@GetMapping(value="/owner")
	public String name(String s) {
		
		return("The Owner of the API: "+s);
	}
}
