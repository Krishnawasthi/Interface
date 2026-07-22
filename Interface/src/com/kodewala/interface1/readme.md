# 🔷 Java Interface

A Java **Interface** is a blueprint that defines a contract for classes. It specifies **what a class should do**, not **how it should do it**. Interfaces are mainly used to achieve **abstraction**, **multiple inheritance**, and **loose coupling**.

---

## 📌 Features

- ✅ Achieves abstraction
- ✅ Supports multiple inheritance
- ✅ Promotes loose coupling
- ✅ Enables runtime polymorphism
- ✅ Improves code reusability and maintainability

---

## 📚 Topics Covered

- 🔹 Creating Interfaces
- 🔹 Implementing Interfaces
- 🔹 Multiple Interface Implementation
- 🔹 Interface Inheritance
- 🔹 Default Methods (Java 8)
- 🔹 Static Methods (Java 8)
- 🔹 Private Methods (Java 9)
- 🔹 Runtime Polymorphism using Interfaces

---

## 📝 Rules

- Use the `implements` keyword to implement an interface.
- A class can implement multiple interfaces.
- An interface can extend one or more interfaces.
- All interface methods are `public` and `abstract` by default.
- All interface variables are `public static final`.
- Interfaces cannot be instantiated.

---

## 🚀 Advantages

- ✔️ Supports multiple inheritance
- ✔️ Encourages loose coupling
- ✔️ Makes code flexible and scalable
- ✔️ Improves maintainability
- ✔️ Follows the "Program to an Interface" design principle

---

## ⚖️ Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Uses `extends` | Uses `implements` |
| Can have constructors | Cannot have constructors |
| Can have instance variables | Only constants (`public static final`) |
| Supports partial abstraction | Primarily used for abstraction |
| Single inheritance | Multiple inheritance |

---

## 💻 Example

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
```

---

## 🎯 Learning Outcomes

- Understand the purpose of interfaces.
- Learn how to achieve multiple inheritance.
- Implement runtime polymorphism.
- Use default, static, and private methods.
- Design loosely coupled applications.

---

## 🛠️ Technologies Used

- Java
- Eclipse IDE
- Git & GitHub

---

## 👨‍💻 Author

**Krishna Mohan Awasthi**

⭐ If you found this repository helpful, consider giving it a **Star**.
