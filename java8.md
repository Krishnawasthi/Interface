# 🚀 Java 8 Enhancement

Before Java 8, interfaces could contain only:

- Abstract methods
- Constants

Java 8 introduced:

- ✅ Default Methods
- ✅ Static Methods

This made interfaces much more powerful.

---

# ⭐ Default Method

A **default method** is a method that already has an implementation inside the interface.

Syntax

```java
interface Vehicle {

    default void fuelType() {
        System.out.println("Petrol");
    }

}
```

Implementation

```java
class Car implements Vehicle {

}
```

Driver

```java
public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.fuelType();

    }

}
```

Output

```
Petrol
```

Notice that **Car did not override the method**, yet it can use it.

---

# 🔥 Why Default Method?

Imagine Java already had millions of projects.

Suppose Java developers added a new method.

Old interface

```java
interface Payment {

    void pay();

}
```

Thousands of classes already implemented it.

```java
class PhonePe implements Payment {

    public void pay() {

    }

}
```

Now Java adds

```java
void refund();
```

Immediately every existing class becomes invalid.

```java
class PhonePe implements Payment {

    public void pay() {

    }

}
```

Compiler Error ❌

```
PhonePe is not abstract and does not override refund()
```

Developers would have to modify millions of existing classes.

---

# ✅ Solution: Default Method

Instead of making the new method abstract, Java provides a default implementation.

```java
interface Payment {

    void pay();

    default void refund() {
        System.out.println("Refund Processing...");
    }

}
```

Now every old class continues working without any changes.

```java
class PhonePe implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment Success");
    }

}
```

Driver

```java
PhonePe p = new PhonePe();

p.pay();

p.refund();
```

Output

```
Payment Success
Refund Processing...
```

---

# 🔄 Backward Compatibility

One of the biggest reasons for introducing **default methods** in Java 8 was to maintain **backward compatibility**.

### What is Backward Compatibility?

Backward compatibility means:

> **New versions of Java should not break old applications.**

Before Java 8:

```
Interface Updated
        ↓
Every implementing class breaks ❌
```

After Java 8:

```
Interface Updated
        ↓
Default implementation provided
        ↓
Old classes continue working ✅
```

This allowed Java to evolve its standard libraries (like the Collection Framework) without forcing developers to update every existing implementation.

---

# 📌 Static Method in Interface

Java 8 also introduced static methods.

```java
interface MathUtil {

    static void message() {
        System.out.println("Welcome");
    }

}
```

Call

```java
MathUtil.message();
```

Static methods belong to the interface itself and **cannot be overridden** by implementing classes.

---

# ⚖️ Interface vs Abstract Class

| Interface | Abstract Class |
|-----------|----------------|
| Supports multiple inheritance | Supports single inheritance |
| Focuses on behavior | Focuses on state + behavior |
| No constructors | Can have constructors |
| Variables are public static final | Can have instance variables |
| Methods are abstract, default, static, private (Java 9+) | Can have abstract and concrete methods |

---

# 💡 Real-World Examples

- 💳 Payment Gateway
- 🚗 Vehicle Engine
- 📦 Delivery Service
- 🔐 Authentication Provider
- ☁️ Cloud Storage
- 💾 Database Driver (JDBC)

---

# 📝 What I Learned

- What an interface is
- Why interfaces are used in Java
- Difference between interface and abstract class
- Multiple inheritance using interfaces
- Interface rules and syntax
- Default methods
- Static methods
- Why Java introduced default methods
- Backward compatibility
- Real-world use cases of interfaces

---

# 📚 Java Version Timeline

| Java Version | Interface Features |
|--------------|--------------------|
| Java 7 and Earlier | Abstract methods and constants only |
| Java 8 | Default methods and static methods |
| Java 9 | Private methods inside interfaces |

---

# 🎯 Key Takeaways

- Interface defines a contract.
- Classes implement the contract.
- Java supports multiple inheritance through interfaces.
- Default methods solve the backward compatibility problem.
- Static methods provide utility behavior inside interfaces.
- Interfaces are heavily used in enterprise applications and frameworks such as JDBC, Spring, Hibernate, and Collections.

---

## ⭐ If you found this repository helpful, don't forget to give it a Star!
