
## Experienced Java Developer

A focused collection of the **25 most important Java Interface interview questions** for experienced Java developers.

These questions cover **interface fundamentals, abstraction, loose coupling, default/static/private methods, multiple inheritance, functional interfaces, lambda expressions, interface inheritance, and real-world design**.

---

# 📚 Table of Contents

1. [Interface Fundamentals](#1-interface-fundamentals)
2. [Interface Methods and Variables](#2-interface-methods-and-variables)
3. [Interface Inheritance](#3-interface-inheritance)
4. [Default and Static Methods](#4-default-and-static-methods)
5. [Advanced Interfaces](#5-advanced-interfaces)
6. [Real-World Design](#6-real-world-design)

---

# 1. Interface Fundamentals

### 1. What is an interface in Java?

Why was the interface concept introduced?

---

### 2. What is the difference between an interface and an abstract class?

Compare:

```text
Interface
Abstract Class
```

Discuss when you would choose one over the other.

---

### 3. How does an interface achieve abstraction?

Explain with a real-world example.

---

### 4. How does an interface promote loose coupling?

Consider:

```text
Controller
    ↓
Interface
    ↓
Implementation
```

Why is this design useful?

---

### 5. Can we create an object of an interface?

Why is this invalid?

```java id="0s6f6e"
InterfaceA obj = new InterfaceA();
```

---

### 6. Can an interface have constructors?

Why or why not?

---

### 7. Can an interface extend another interface?

Example:

```java id="f6v9qc"
interface A {
}

interface B extends A {
}
```

Is this valid?

---

### 8. Can an interface extend multiple interfaces?

Example:

```java id="5x2m7a"
interface C extends A, B {
}
```

Why is this allowed even though Java doesn't support multiple inheritance through classes?

---

# 2. Interface Methods and Variables

### 9. What are the default access modifiers of variables declared inside an interface?

Example:

```java id="n8q4lp"
interface Vehicle {

    int SPEED = 100;
}
```

What are the implicit modifiers?

---

### 10. Can interface variables be changed?

Why is this invalid?

```java id="v4q2yk"
Vehicle.SPEED = 200;
```

---

### 11. What are the different types of methods allowed inside an interface?

Discuss:

* Abstract methods
* Default methods
* Static methods
* Private methods

---

### 12. Can an interface contain concrete methods?

How did Java 8 change interface capabilities?

---

### 13. What is a default method in an interface?

Why was it introduced in Java 8?

Example:

```java id="g9c7fh"
interface Vehicle {

    default void start() {
        System.out.println("Vehicle started");
    }
}
```

---

### 14. Can an interface contain static methods?

How are interface static methods called?

Example:

```java id="h2z4lc"
Vehicle.start();
```

---

### 15. Can an interface static method be overridden?

Why or why not?

---

### 16. Can an interface contain private methods?

Why were private interface methods introduced?

Which Java version introduced them?

---

# 3. Interface Inheritance

### 17. Can a class implement multiple interfaces?

Example:

```java id="x4v8jk"
class Car implements Vehicle, Machine {
}
```

Why is this allowed?

---

### 18. What happens if two interfaces contain methods with the same signature?

Example:

```java id="c5p3mw"
interface A {
    void display();
}

interface B {
    void display();
}

class C implements A, B {
}
```

What does the implementing class need to do?

---

### 19. What happens if two interfaces contain conflicting default methods?

Example:

```java id="z8n2qd"
interface A {

    default void display() {
        System.out.println("A");
    }
}

interface B {

    default void display() {
        System.out.println("B");
    }
}

class C implements A, B {
}
```

Will this compile?

How can you resolve the conflict?

---

### 20. What happens when a class extends a class and implements an interface containing the same method?

Which implementation gets priority?

Explain the rule:

```text id="c4r6yp"
Class
  ↓
Interface
```

---

# 4. Default and Static Methods

### 21. Why were default methods introduced in Java 8?

What problem did they solve for backward compatibility?

---

### 22. What is the difference between an abstract method and a default method?

Compare:

```text id="7m0g5d"
Abstract Method
Default Method
```

---

### 23. Can a class override a default method?

Example:

```java id="s2g6kw"
interface Vehicle {

    default void start() {
        System.out.println("Vehicle");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car");
    }
}
```

---

### 24. How can you explicitly call a specific interface's default method?

Example:

```java id="r4m8zx"
InterfaceName.super.methodName();
```

When is this useful?

---

# 5. Advanced Interfaces

### 25. What is a Functional Interface?

Explain:

```java id="v7x1qb"
@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}
```

Discuss:

* What makes an interface functional?
* Can it contain default methods?
* Can it contain static methods?
* Can it contain private methods?
* Relationship with lambda expressions
* `@FunctionalInterface`

---

# ⭐ Most Important Questions

If you have limited preparation time, focus on these first:

1. **Interface vs abstract class**
2. **How does an interface provide abstraction?**
3. **How does an interface promote loose coupling?**
4. **Can interfaces have constructors?**
5. **Can an interface extend multiple interfaces?**
6. **Interface variables and their implicit modifiers**
7. **Types of methods allowed in interfaces**
8. **Default methods**
9. **Why were default methods introduced in Java 8?**
10. **Static methods in interfaces**
11. **Can interface static methods be overridden?**
12. **Private methods in interfaces**
13. **Multiple interfaces implemented by a class**
14. **Conflict between two interface default methods**
15. **Class vs interface method priority**
16. **`InterfaceName.super.method()`**
17. **Functional interfaces**
18. **`@FunctionalInterface`**
19. **Interface and lambda expressions**
20. **Interface-based design and loose coupling**

---

# 🎯 Interview Preparation Rule


> "Interface is used to achieve 100% abstraction."

Instead, explain the **design purpose**:

```text id="l6q7we"
Interface
     ↓
Defines Contract
     ↓
Multiple Implementations
     ↓
Loose Coupling
     ↓
Dependency Injection
     ↓
Easy Testing / Mocking
     ↓
Flexible Architecture
```

For example:

```java id="k4z8pt"
interface PaymentService {
    void pay(double amount);
}
```

Different implementations can exist:

```text id="w9c3fa"
PaymentService
      |
      +---- CreditCardPayment
      |
      +---- UPIPayment
      |
      +---- NetBankingPayment
```

The client depends on the **interface**, not the concrete implementation.

That is the kind of explanation expected from an experienced Java developer.
