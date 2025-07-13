# Spring Boot Web – Create a Spring Web Project Using Maven

This project demonstrates a basic Spring Boot web application using Maven. It features a simple REST controller that returns an HTML web page when accessed via browser. The project uses Spring Boot's embedded Tomcat server, making it runnable as a standalone application.

---

## ✅ Project Structure

```
spring-learn/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/cognizant/springlearn/
│       │       ├── SpringLearnApplication.java
│       │       └── controller/HelloController.java
│       └── resources/
│           └── application.properties
├── pom.xml
```

---

## ✅ Code Breakdown

### 🔹 SpringLearnApplication.java

```java
package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}
```

---

### 🔹 HelloController.java

```java
package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<html>" +
                "<head><title>Spring Web</title></head>" +
                "<body style='margin:0; padding:0; height:100vh; display:flex; align-items:center; justify-content:center; font-family:Arial;'>" +
                "<div style='text-align:center;'>" +
                "<h1 style='color:green;'>✅ Spring Web is Running!</h1>" +
                "<p style='font-size:18px;'>Hello Pranesh! Your application is up and working smoothly.</p>" +
                "</div>" +
                "</body></html>";
    }
}
```

This controller handles HTTP GET requests to `/` and returns a full HTML response rendered directly from the backend.

---



## ✅ Build Using Maven

```bash
mvn clean package
```

This generates `spring-learn-0.0.1-SNAPSHOT.jar` in the `target/` directory.

---

## ✅ pom.xml Highlights

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

---

## 👨‍💻 Author

**Pranesh M**  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)

---