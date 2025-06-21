# 🛒 E-commerce Product Search (Java)

This project demonstrates a simple console-based **Product Search System** for an E-commerce platform. Users can search for products using either **Linear Search** or **Binary Search** from a predefined list of products.

---

## 📁 Folder Structure

```
Week_1/
└── Engineering_concepts/
    └── Data_Structure_and_Principles/
        └── E_commerce_Platform/
            ├── Product.java
            ├── SearchUtil.java
            └── MainSearchApp.java
```

> 📌 Note: Make sure the package path and folder structure match exactly.

---

## 📦 Features

- Case-insensitive product name search
- Supports **Linear** and **Binary** search algorithms
- Simple object-oriented design
- Interactive user input using Scanner


## 🧪 Sample Input/Output

```
Choose search type: linear / binary
> binary
Enter product name to search:
> macbook air

Product found (Binary):
[3] MacBook Air - Electronics
```

```
Choose search type: linear / binary
> linear
Enter product name to search:
> milk

No product named 'milk' found (Linear).
```

---

## 📚 Classes Explained

### `Product.java`
Defines the `Product` class with:
- `productId`
- `productName`
- `category`
- `display()` method

### `SearchUtil.java`
Contains two static methods:
- `linearSearch(String name, Product[] products)`
- `binarySearch(String name, Product[] products)`

### `MainSearchApp.java`
Main entry point. Prompts user for input, reads search type and keyword, and triggers the appropriate search method.

---

## ✅ Future Enhancements (Suggestions)
- Add product price, availability, and brand
- Allow category-based or price-range search
- GUI version using JavaFX or Swing
- Load product list from a file or database

---

## 👨‍💻 Author

- **Pranesh M**
- Trainee at Cognizant (CTS)
- B.Tech - AIDS, Batch 2026


