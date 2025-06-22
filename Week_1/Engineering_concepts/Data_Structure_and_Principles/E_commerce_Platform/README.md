# 🛒 E-commerce Search (Java)

A simple Java console app that allows users to search for products using **Linear** or **Binary Search** from a predefined list.

---

## 📁 Folder

```
E_commerce_Platform/
├── Product.java
├── SearchUtil.java
└── MainSearchApp.java
```

---

## ⚙️ Features

- Case-insensitive search  
- Linear & binary search options  
- Object-oriented design  
- Uses `Comparator` for sorting (binary search)

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

## 📚 Files

- `Product.java`: defines product attributes and display method  
- `SearchUtil.java`: implements search logic  
- `MainSearchApp.java`: handles user interaction

---

## ⏱️ Time Complexity

| Search Type   | Best | Worst | Sorted |
|---------------|------|--------|--------|
| Linear Search | O(1) | O(n)   | ❌     |
| Binary Search | O(1) | O(log n)| ✅     |

---

## 👨‍💻 Author

**Pranesh M**  
Trainee, Cognizant | B.Tech AIDS – Batch 2026
