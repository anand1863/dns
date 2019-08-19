# dns project is a maven built, language in use is java and springboot framework was used.
Install java development kit from https://www.oracle.com/technetwork/java/javase/downloads/index.html
set path of jdk 
Clone the git repository and either run it on your IDE or you can use command prompt to run the project.


Following are the steps to run the project in command promt:

From command prompt move to the directory which has the project                                             
dir                                                                
mvn clean test 

These two command will run the server and now we can either user browser or postman to pass the endpoints with their parameters to fetch the output.

Digital news stand is a restful web API which communicates with newsapi.org to get the news in the format of JSON values.
Firstly, We have to go to newsapi.org website to get an api key which is a unique key.
In this API I created two endpoints
1. Topheadlines
   It had 3 parametes
   1. country (us,ca,uk)
   2. category (eg. sports, politics etc)
   3. q (seach of a keyword eg. to seach news regarding trump we will pass q=trump as parameter)
   4. apiKey
2. Everything
   It has 10 parameters
   1. domains
   2. excludedomains
   3. from 
   4. to
   5. language
   6. sortBy
   7. setF
   8. apiKey
   
 apiKey is a required parameter and all other parameters are not required parameters.
 
In the project there is main class called DnsAppliction.java class which is the class that contains the main method.
The ControllerBackend.java class conatins the two endpoints and 
what these two endpoints will do is stored in MappingCall.java(tophedaline endpoint) and MappingCall2.java(everything endpoint) class 
