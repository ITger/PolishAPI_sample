# PSD2 PolishAPI 2_1_2 
This is a sample implementation of [PSD2](https://en.wikipedia.org/wiki/Payment_Services_Directive) 
[Polish API 2_1_2 version](https://polishapi.org/en/).
## Getting Started
In this case study I tried to get the best from Swagger code generator and the best software engineering practicies to obtain a maintainable project. Main patterns I used are Delegation, Loose Coupling, Separation of Responsibilities and others.
## Prerequisites
* [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [swagger-codegen](https://github.com/swagger-api/swagger-codegen)
* [maven](https://maven.apache.org/)
* [Hazelcast](https://hazelcast.com/)
* [PolishAPI](https://app.swaggerhub.com/apis/ZBP/polish-api/2_1_2)
* [curl](https://github.com/curl/curl) [curl for windows](https://curl.haxx.se/windows/)
## Getting Started
* After installing jdk 11 and Maven you should check minimal system requirements, simply run:
```
{workspace_path}>mvn --version
```
you should receive something like this:
```
Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option MaxPermSize; support was removed in 8.0
Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T20:41:47+02:00)
Maven home: D:\maven\apache-maven-3.6.0\bin\..
Java version: 11.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.2
Default locale: pl_PL, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
* Pull swagger:
```
{workspace_path}\swagger>git clone https://github.com/swagger-api/swagger-codegen.git
```
* in my case I had to modify the {workspace_path}\swagger\swagger-codegen\modules\swagger-generator\pom.xml
    file adding this dependencies:
```
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-core</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>activation</artifactId>
    <version>1.1.1</version>
</dependency>
```
* from the folder you installed swagger go to swagger-codegen folder:
{workspace_path}\swagger>cd swagger-codegen
and then build swagger codegen:
```
{workspace_path}\swagger\swagger-codegen>mvn clean package -DskipTests
```
tests fail in the version of swagger I installed on Win10pro, so I skipped them.
* Is good to know all possible swagger codegen [parameters for spring](https://generator.swagger.io/api/gen/servers/spring).
* Download the ZBP-polish-api-2_1_2-swagger.json file from [PolishAPI](https://app.swaggerhub.com/apis/ZBP/polish-api/2_1_2).
* In polishAPI_Options.json file I created, I included some parameters for swagger codegen. The most important are:
```
{
.....
    "dateLibrary": "java8",
	"java8": "true",
	"delegatePattern": "true",
	"bigDecimalAsString": "true",
	"useTags": "true",
	"serializableModel": "true"
}
```
* Next step is to generate the spring-boot application:
```
{workspace_path}\swagger\swagger-codegen\java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i {workspace_path}\PolishAPI_2_1_2_sample\ZBP-polish-api-2_1_2-swagger.json -l spring -o {workspace_path}\PolishAPI_2_1_2_sample\server -c {workspace_path}\PolishAPI_2_1_2_sample\polishAPI_Options.json
```
* Next, in NetBeans (or any other IDE), create a New Project/Maven/Project with Existing POM.
* Because I configured swagger-codegen with "delegatePattern": "true", after successful generation in previous step, I wrote classes that implemented AisApiDelegate, AsApiDelegate, CafApiDelegate, PisApiDelegate interfaces. In that classes I am implementing the business logic for all services.
* Start your server as an simple java application. You can view the PolishAPI documentation in swagger-ui by pointing to  
http://localhost:8080/  
* I opted for Hazelcast as data cache but for now I'm not implementing persistance, so every time the server is restarted, 
executing the following command is a must:
```
curl  -X POST  http://localhost:8080/makeFakeData
```
this way we generate RANDOM fake data. 
* When spring started, you can test its functionality. The best is using curl, for example:
```
curl  -X POST -H "Accept: application/json" -H "Accept-Language: PL-pl"  -H "Referer: http://localhost:8080/swagger-ui.html" -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoidXNlcnMvSmFudXN6IGkgR3Jhxbx5bmEiLCJhdWQiOiJzb21ldGhpbmciLCJleHAiOjE1NTE4NjY1OTIsIm5hbWUiOiJKYW51c3ogaSBHcmHFvHluYSBOb3NhY3oiLCJzY29wZSI6InNlbGYgZ3JvdXBzL2FkbWlucyJ9.kfhkYfgXFstJe5Ws4UXGYtEQhh5NBg4Sl6Kqn1wkQH4" -H "X-JWS-SIGNATURE: 123" -H "Accept-Charset: utf-8" -H "X-REQUEST-ID: 1391c93e-45af-11e9-b210-d663bd873d93" -H "DNT: 1" -H "Accept-Encoding: gzip" -H "Connection: keep-alive" -d "{  \"accountNumber\": \"string\",  \"requestHeader\": {  \"ipAddress\": \"string\",  \"isDirectPsu\": false,  \"requestId\": \"1391c93e-45af-11e9-b210-d663bd873d93\",  \"sendDate\": \"2019-03-13T14:34:03.777Z\",  \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoidXNlcnMvSmFudXN6IGkgR3Jhxbx5bmEiLCJhdWQiOiJzb21ldGhpbmciLCJleHAiOjE1NTE4NjY1OTIsIm5hbWUiOiJKYW51c3ogaSBHcmHFvHluYSBOb3NhY3oiLCJzY29wZSI6InNlbGYgZ3JvdXBzL2FkbWlucyJ9.kfhkYfgXFstJe5Ws4UXGYtEQhh5NBg4Sl6Kqn1wkQH4\",  \"tppId\": \"string\",  \"userAgent\": \"string\"  }   }"  http://localhost:8080/v2_1_2.1/accounts/v2_1_2.1/getAccount
```
the query predicates must be in accordance with generated data. 
## Authors
* **Piotr Zerynger** - *Initial work* - [Piotr Zerynger](p.zerynger@gmail.com)
