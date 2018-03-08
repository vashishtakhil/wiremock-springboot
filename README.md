# wiremock-springboot

#What it is?

As [wiremock](https://github.com/tomakehurst/wiremock) is great for integration testing and it is distributed in various flavours- as a standard jar or as a standalones and also it comes with various usages like The Junit Rule, Java(Non-Junit) Usage(Can read more [here](http://wiremock.org/docs/getting-started/)).
 Here i have leverage the wiremock capabilities further and using it as Standalone Test Server using SpringBoot.
 This repository covers following feature:
 *Wiremock running as a standalone server.
 *Springboot Application containing wiremock server and client instance.
 
In this wiremock is running on separate port 8089 inside the springboot application which is running on 8080 port.
With this wiremock can test and mock the responses behaving as the separate service. This gives a edge while integration or third party test.
## Building and Running Locally:

  * `mvn clean compile` to compile the service.
  * `mvn clean package` to build the service.
  * To run simply execute the main class `Application.java`
###with Docker:  

    docker build -t <Provide image name here say wmspringdemo> <Provide here local path of the project>
    docker run -it --rm -p 8089:8089 wmspringdemo
    
 Once your application is up then just hit the [http://localhost:8089/foo](http://localhost:8089/foo) will give you "Hello World!" response.
 
 Note: Will check-in various features like Request Matching, Stubbing, Record and Playback,Stateful Behavior etc. Though there are numerous examples already on Github and above mentioned links.
 But will check-in different problems,resolutions and ways to do it. 
 
 ##License
 MIT License 
