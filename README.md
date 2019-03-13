# PSD2 PolishAPI 2_1_2 sample implementation
## Delegation pattern 
## Loose Coupling
## Separation of Responsibilities

### Swagger generated server
Spring Boot Server 

### Overview  
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  
By using the [OpenAPI-Spec](https://github.com/swagger-api/swagger-core), you can easily generate a server stub.  
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.  
The underlying library integrating swagger to SpringBoot is [springfox](https://github.com/springfox/springfox)  
Start your server as an simple java application  
You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  

Change default port value in application.properties

# Step by step PSD2 PolishAPI 2_1_2 sample implementation

## 1.
Sprawdzamy czy spełnione są wymagania systemowe dla swaggera:
```
{workspace_path}\swagger\swagger-codegen>mvn --version
```
```
Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option MaxPermSize; support was removed in 8.0
Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T20:41:47+02:00)
Maven home: D:\maven\apache-maven-3.6.0\bin\..
Java version: 11.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.2
Default locale: pl_PL, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```


## 2.
Pobranie swaggera:
```
{workspace_path}\swagger>git clone https://github.com/swagger-api/swagger-codegen.git
```
(wersja z 13 marca 2019)

## 3.
dodanie do pliku  {workspace_path}\swagger\swagger-codegen\modules\swagger-generator\pom.xml
następujacych zależności:
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
bez tego jest błąd kompilacji.

## 4.
przechodzimy do katalogu {workspace_path}\swagger>cd swagger-codegen
i następnie budujemy swaggera:
```
{workspace_path}\swagger\swagger-codegen>mvn clean package -DskipTests
```
Testy na windows 10 w tej wersji swaggera nie przechodzą, dlatego trzeba je wyłączyć.

## 5.
Pod tym adresem możemy zapoznac się z możliwymi parametrami dla generatora spring:
```
https://generator.swagger.io/api/gen/servers/spring
```

## 6.
Dzieki Delegation pattern uzyskamy Loose Coupling oraz Separation of Responsibilities.
Najważniejsze sż delegatePattern, java8, bigDecimalAsString.
wg mnie optymalne parametry generatora dla PolishAPI sa następujące:
```
{
"groupId":"pl.itger.PolishAPI",
"artifactId":"PolishAPI_2_1_2_sample",
"basePackage":"pl.itger.PolishAPI",
"configPackage":"pl.itger.PolishAPI.config",
"modelPackage" : "pl.itger.PolishAPI.model",
"apiPackage" : "pl.itger.PolishAPI.api",
"sourceFolder" : "F:\workspace\PolishAPI_2_1_2_sample",
"dateLibrary": "java8",
"java8" : "true",
"delegatePattern": "true",
"bigDecimalAsString" : "true",
"useTags" : "true"
}
```

## 7.
Po ściągnięciu definicji polish-api (plik ZBP-polish-api-2_1_2-swagger.json) przystępujemy do wygenerowania:
```
{workspace_path}\swagger\swagger-codegen\java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i {workspace_path}\PolishAPI_2_1_2_sample\ZBP-polish-api-2_1_2-swagger.json -l spring -o {workspace_path}\PolishAPI_2_1_2_sample\server -c F:\workspace\PolishAPI_2_1_2_sample\polishAPI_Options.json
```
polishAPI_Options.json jest to plik zawierający parametry opisane w punkcie 6.

## 8.
następnie w netbeans tworzymy nowy projekt: New Project/Maven/Project with Existing POM

## 9.
Ponieważ wśród parametrów generatora swagger zaznaczyliśmy iż interesuje nas wzorzec Delegate,
wystarczy teraz utworzyć klasy implementujące interfejsy AisApiDelegate, AsApiDelegate, CafApiDelegate, PisApiDelegate. 
W tych klasach zawrzemy logike biznesowa i bedziemy uniezaleznieni od generowanego kodu, tj będziemy mogli regenerować Polish API nie zmieniając klas z logiką biznesową.

Np. na początek może być jedna klasa:
```
@Service
public class NewService implements AisApiDelegate, AsApiDelegate,CafApiDelegate,PisApiDelegate{...}
```
Ważne aby klasa ta miała adnotacje "org.springframework.stereotype.Service"!

Następnie czyścimy, budujemy mavenem nasz projekt i uruchamiamy go:
w netBeans są to komendy clean and build, a następnie run.

Spring boot powinien sie odpalić i nasłuchiwać na porcie 8080.

## 10.
Gdy spring sie uruchomi, z linii komend możemy przetestowac jego działanie.
Oto przykładowe wywołanie usługi getAccount:
```
curl  -X POST -H "Accept: application/json" -H "Accept-Language: PL-pl"  -H "Referer: http://localhost:8080/swagger-ui.html" -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoidXNlcnMvSmFudXN6IGkgR3Jhxbx5bmEiLCJhdWQiOiJzb21ldGhpbmciLCJleHAiOjE1NTE4NjY1OTIsIm5hbWUiOiJKYW51c3ogaSBHcmHFvHluYSBOb3NhY3oiLCJzY29wZSI6InNlbGYgZ3JvdXBzL2FkbWlucyJ9.kfhkYfgXFstJe5Ws4UXGYtEQhh5NBg4Sl6Kqn1wkQH4" -H "X-JWS-SIGNATURE: 123" -H "Accept-Charset: utf-8" -H "X-REQUEST-ID: 1391c93e-45af-11e9-b210-d663bd873d93" -H "DNT: 1" -H "Accept-Encoding: gzip" -H "Connection: keep-alive" -d "{  \"accountNumber\": \"string\",  \"requestHeader\": {  \"ipAddress\": \"string\",  \"isDirectPsu\": false,  \"requestId\": \"1391c93e-45af-11e9-b210-d663bd873d93\",  \"sendDate\": \"2019-03-13T14:34:03.777Z\",  \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoidXNlcnMvSmFudXN6IGkgR3Jhxbx5bmEiLCJhdWQiOiJzb21ldGhpbmciLCJleHAiOjE1NTE4NjY1OTIsIm5hbWUiOiJKYW51c3ogaSBHcmHFvHluYSBOb3NhY3oiLCJzY29wZSI6InNlbGYgZ3JvdXBzL2FkbWlucyJ9.kfhkYfgXFstJe5Ws4UXGYtEQhh5NBg4Sl6Kqn1wkQH4\",  \"tppId\": \"string\",  \"userAgent\": \"string\"  }   }"  http://localhost:8080/v2_1_2.1/accounts/v2_1_2.1/getAccount
```





