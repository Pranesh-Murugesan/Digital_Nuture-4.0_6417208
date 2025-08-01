# 📊 TheForecaster

A simple financial forecasting application written in Java that predicts future investment value using recursion based on compound growth.

---

## 📌 Features

- Calculates future value using recursive logic  
- Accepts user-defined initial investment, growth rate, and duration  
- Uses builder pattern for structured object creation  
- Clean 3-class structure for maintainability  

---

## 📈 Formula

```
FutureValue(n) = FutureValue(n - 1) * (1 + growthRate)
Base case: FutureValue(0) = InitialInvestment
```

---

## 🧠 Time Complexity

- Recursive depth: `O(n)` where `n` = number of years  
- Space complexity: also `O(n)` due to recursion stack  
- Can be optimized to `O(1)` with an iterative version  

---

## 🛠 Files

- `Financial.java` – holds financial input data with builder pattern  
- `CalculateFinancial.java` – contains recursive future value calculation  
- `Test.java` – handles user input and runs the forecasting logic  

---

## 🧪 Sample Input/Output

```
Enter initial investment: ₹5000
Enter annual growth rate (%): 10
Enter number of years: 3
Estimated Future Value: ₹6655.00
```

---

## 📁 Folder Structure

```
Week_1_Algorithms_DataStructures/
└── HandsOn_7_FinancialForecasting/
    └── Code/
        ├── Financial.java
        ├── CalculateFinancial.java
        └── Test.java
    └── Output/
        └── output.png
```


## 👨‍💻 Author

**Pranesh M**  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)


---
