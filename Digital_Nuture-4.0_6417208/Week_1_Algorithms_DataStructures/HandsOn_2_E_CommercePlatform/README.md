# 🛒 E-commerce Search (Java)

A simple Java console app that allows users to search for products using **Linear** or **Binary Search** from a predefined list.

---


> 🔰 Each Java file must be inside:
```
Week_1_Algorithms_DataStructures/
└── HandsOn_2_E_CommercePlatform/
    └── code/
        ├── Product.java
        ├── SearchUtil.java
        └── MainSearchApp.java
    └── Output/
        └── output.png
```

---

## ⚙️ Features

- Case-insensitive search  
- Choose between Linear and Binary search  
- Object-Oriented Design  
- Uses `Comparator` for case-insensitive binary search  

---

## 🔎 Sample Output

```
> linear
Enter product name:
> t-shirt

Product found (Linear):
[2] T-Shirt - Clothing
```

```
> binary
Enter product name:
> milk

No product named 'milk' found (Binary).
```

---

## 📚 Java Files

- `Product.java`: defines the product structure  
- `SearchUtil.java`: contains linear and binary search implementations  
- `MainSearchApp.java`: handles user interaction and drives the program

---

## ⏱️ Time Complexity

| Search Type   | Best  | Worst  | Requires Sorting |
|---------------|-------|--------|------------------|
| Linear Search | O(1)  | O(n)   | ❌               |
| Binary Search | O(1)  | O(log n)| ✅              |

---


## 👨‍💻 Author

**Pranesh M**  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)
 ---