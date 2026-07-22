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
