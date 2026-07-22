# 🚀 Java Interface

![Java](https://img.shields.io/badge/Java-Interface-orange)
![OOP](https://img.shields.io/badge/OOP-Abstraction-blue)
![Java 8+](https://img.shields.io/badge/Java-Default%20Methods-green)
![Status](https://img.shields.io/badge/Completed-✔️-brightgreen)

## 📌 Overview

An **Interface** in Java is a blueprint that defines **what a class should do**, not **how it should do it**.

It is mainly used to achieve:
- ✅ Abstraction
- ✅ Multiple Inheritance
- ✅ Loose Coupling
- ✅ Standardization between different implementations

Unlike an abstract class, an interface focuses on **capabilities (behavior)** rather than **state (data)**.

---

# 🎯 Why Interface?

Suppose different payment applications like:

- 💳 Google Pay
- 💳 PhonePe
- 💳 Paytm

All of them perform payments differently, but they all support the same operation:

```java
pay();
```

Instead of forcing every class to inherit from one parent class, Java allows all payment systems to implement a common interface.

```java
interface Payment {
    void pay();
}
```

Each class provides its own implementation.

---

# 📖 Syntax

```java
interface Animal {

    void sound();

}
```

Implementation

```java
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

}
```

# ✨ Features of Interface

- Provides abstraction
- Supports multiple inheritance
- Contains public static final variables
- Methods are public by default
- Cannot create objects of an interface
- A class implements an interface
- One class can implement multiple interfaces
- Promotes loose coupling
- Makes code flexible and maintainable

---

# 📌 Rules of Interface

### Variables

Every variable is automatically

```java
public static final
```

Example

```java
interface Demo {

    int VALUE = 100;

}
```

Actually becomes

```java
public static final int VALUE = 100;
```

---

### Methods (Before Java 8)

Every method was automatically

```java
public abstract
```

Example

```java
interface Vehicle {

    void start();

}
```

Actually becomes

```java
public abstract void start();
```

