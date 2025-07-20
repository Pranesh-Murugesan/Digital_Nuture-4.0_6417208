# Bank Microservices – Account and Loan Services

In this project, I created two independent Spring Boot RESTful microservices: one for handling Account operations and the other for Loan operations. These microservices are implemented as separate Maven projects and provide simple GET APIs returning hardcoded responses. No backend database is used.

---

## Account Microservice

### Project Configuration
- **Group**: com.cognizant  
- **Artifact**: account  
- **Dependencies**:
  - Spring Boot DevTools  
  - Spring Web  

### Endpoint Implementation
- **Endpoint**: `/accounts/{6417208}`
- **Method**: GET  
- **Response Example**:
```json
{
  "number": "6417208",
  "type": "savings",
  "balance": 234343
}
```

### Controller
```java
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getAccountDetails(@PathVariable String number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("type", "savings");
        response.put("balance", 234343);
        return ResponseEntity.ok(response);
    }
}
```

---

## Loan Microservice

### Project Configuration
- **Group**: com.cognizant  
- **Artifact**: loan  
- **Dependencies**:
  - Spring Boot DevTools  
  - Spring Web  

### Port Configuration
To avoid port conflict with the Account microservice (which runs on port 8080), the following configuration is added in `application.properties`:
```properties
server.port=8081
```

### Endpoint Implementation
- **Endpoint**: `/loans/{6417208}`
- **Method**: GET  
- **Response Example**:
```json
{
  "number": "6417208",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

### Controller
```java
@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getLoanDetails(@PathVariable String number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("type", "car");
        response.put("loan", 400000);
        response.put("emi", 3258);
        response.put("tenure", 18);
        return ResponseEntity.ok(response);
    }
}
```

---

## Testing the Services
- **Account Service**: [http://localhost:8080/accounts/6417208](http://localhost:8080/accounts/6417208)  
- **Loan Service**: [http://localhost:8081/loans/6417208](http://localhost:8081/loans/6417208)

---

## 🧑‍💻 Author

**Pranesh M**  
🚀 B.Tech - AI & DS, Batch 2026  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)

---