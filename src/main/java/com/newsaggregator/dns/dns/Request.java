package com.newsaggregator.dns.dns;

public class Request {
String country;
String category;
String apiKey;
String q;
String sources;
public String getSources() {
	return sources;
}
public void setSources(String sources) {
	this.sources = sources;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getApiKey() {
	return apiKey;
}
public void setApiKey(String apiKey) {
	this.apiKey = apiKey;
}
public String getQ() {
	return q;
}
public void setQ(String q) {
	this.q = q;
}

}
