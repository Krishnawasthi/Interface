# 🔒 Private Methods in Interface (Java 9)

## 📖 Introduction

Java 8 introduced **default methods** and **static methods** inside interfaces.

As interfaces became more powerful, developers noticed a new problem.

Multiple default or static methods often contained the same code.

This resulted in code duplication inside the interface.

To solve this issue, Java 9 introduced **private methods in interfaces**.

---

# ❓ What Problem Did It Solve?

Consider an interface with multiple default methods.

```
default method A
      │
      └── Common Logic

default method B
      │
      └── Common Logic

default method C
      │
      └── Common Logic
```

The same logic had to be written repeatedly.

This violated the **DRY (Don't Repeat Yourself)** principle.

Java 9 introduced private methods so common logic could be written once and reused internally.

---

# Why Private Methods?

Private methods are used to:

- Eliminate duplicate code.
- Share common logic between default methods.
- Share common logic between static methods.
- Improve readability.
- Make interfaces easier to maintain.

---

# Example Structure

```
Interface

├── abstract method
├── default method
├── default method
├── static method
├── private method
└── private static method
```

The private methods can only be called from other methods inside the same interface.

---

# 🏭 Production Use Cases

Private methods are useful when:

- Multiple default methods perform similar validation.
- Several static methods need the same helper logic.
- Logging logic is reused.
- Formatting logic is shared.
- Common calculations are needed.

Instead of copying code multiple times, developers simply call a private helper method.

---

# ✅ Advantages

- Removes duplicate code.
- Follows the DRY principle.
- Cleaner interface design.
- Easier maintenance.
- Better readability.
- Internal implementation remains hidden.

---

# ⚠️ Limitations

Private methods:

- Cannot be accessed outside the interface.
- Cannot be overridden.
- Cannot be inherited.
- Exist only to support other interface methods.

---

# 💡 Real-Life Analogy

Imagine a restaurant.

Customers only see the menu.

Inside the kitchen, chefs use secret preparation steps that customers never see.

These internal preparation steps are similar to **private methods**.

They help produce the final result but remain hidden from the outside world.

---

# 📌 Key Takeaways

- Introduced in **Java 9**
- Solves code duplication inside interfaces
- Supports default and static methods
- Improves maintainability
- Keeps implementation details hidden
- Follows the DRY principle
