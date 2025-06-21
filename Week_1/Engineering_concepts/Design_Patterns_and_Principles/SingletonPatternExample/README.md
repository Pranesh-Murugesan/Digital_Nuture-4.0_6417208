# 🧩 Singleton Pattern in Java - Logger Example

This repository demonstrates the **Singleton Design Pattern** using a `Logger` class in Java. The pattern ensures that only one instance of a class is created and provides a global point of access to it.

---

## 📁 Project Structure

```
📦 SingletonPatternExample
 ┣ 📜 Logger.java        # Singleton class
 ┣ 📜 LoggerTest.java    # Tester class to validate singleton behavior
 ┗ 📷 Output.png         # Screenshot showing the output
```

---

## 🧠 What is the Singleton Pattern?

The **Singleton Pattern** is a creational design pattern that restricts the instantiation of a class to a single object. It is useful when exactly one object is needed to coordinate actions across a system, such as a logger, configuration manager, or connection pool.

---

## 💡 How It Works

In this project:

- `Logger.java` implements the Singleton design pattern.
- The `getInstance()` method checks if an instance already exists; if not, it creates one.
- The constructor is `private` to prevent instantiation from outside the class.
- All log messages go through the same `Logger` instance.

---

## 🧪 Output

Running `LoggerTest.java` will give the following output:

```
Logger is created...
Log: This is the first log.
Log: This is the second log.
Both log1 and log2 are using the same Logger object.
```

📷 You can view the full terminal output screenshot here:

![Output](./Output.png)

---

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/singleton-pattern-logger.git
   cd singleton-pattern-logger
   ```

2. Compile the Java files:

   ```bash
   javac Logger.java LoggerTest.java
   ```

3. Run the program:

   ```bash
   java LoggerTest
   ```

---

## 📚 Concepts Demonstrated

- ✅ Singleton Design Pattern
- ✅ Static instance management
- ✅ Controlled object instantiation
- ✅ Basic logging utility

---

## 🧑‍💻 Author

**Pranesh M**  
🚀 B.Tech - AI & DS, Batch 2026  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)

---

## 🌟 Support

If you found this helpful, please ⭐️ this repository and follow me on [GitHub](https://github.com/your-username)!

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
