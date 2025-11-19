
# Java Design Patterns (23 Patterns)

This repository contains Java implementations of **23 classic software design patterns**, based on well-known OOP design principles (originally inspired by examples found in other languages).  
Each pattern is implemented in a clean and minimal way, focusing on **structure and behavior rather than complex business logic**.

---

## 🚀 Project Structure

All patterns are organized under packages by category:

```
src
└── test
    └── java
        └── com.rantomah.designpatterns
            ├── behavioral
            ├── creational
            └── structural
```

> **Note:**  
> There is **no `src/main/java` directory**. All implementations (including tests) are under `test` purely for convenience to keep examples together.

---

## 📌 Categories

### **Creational**
Patterns focused on object creation mechanisms, improving flexibility and reuse.

Includes examples such as:
- Abstract Factory
- Builder
- Factory Method
- Prototype
- Simple Factory
- Singleton

### **Structural**
Patterns that define how classes and objects form larger structures.

Examples include:
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

### **Behavioral**
Patterns that manage communication and responsibility between objects.

Examples include:
- Chain of Responsibility
- Command
- Iterator
- Mediator
- Memento
- State
- Strategy

---

## 🧪 Testing

Every pattern includes a dedicated test class demonstrating usage and expected behavior using **JUnit + AssertJ**.

Example:
```java
@DisplayName("Strategy Pattern")
public class StrategyTest {

    @Test
    public void test() {
        Integer[] smalldataset = new Integer[] {3, 4, 1, 2};
        Integer[] bigdataset = new Integer[] {4, 3, 2, 8, 10, 5, 6, 9, 7};

        Sorter<Integer> sorter =
                new IntegerSorter(new BubbleSortStrategy(), new QuickSortStrategy());

        Integer[] smalldatasetSorted = sorter.sort(smalldataset);
        Integer[] bigdatasetSorted = sorter.sort(bigdataset);

        assertThat(smalldatasetSorted).containsExactly(1, 2, 3, 4);
        assertThat(bigdatasetSorted).containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
```

Tests act as **executable documentation**.

---

## 🎯 Goals of This Project

- Provide **clean, readable, self-contained examples**
- Demonstrate **each pattern in isolation**
- Use **Java-idiomatic implementations**, not direct translations
- Focus on **concepts over real-world domain complexity**

This project is ideal as:
- A learning reference
- A quick design pattern refresher
- A comparison resource across languages

---

## 🧍 Author

**Rantomah** — Software Developer  
Project created for educational & reference purposes.
