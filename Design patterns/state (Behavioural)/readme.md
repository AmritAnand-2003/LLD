# 🎭 State Design Pattern

> *A behavioral design pattern that allows an object to alter its behavior when its internal state changes, appearing as if the object changed its class.*

---

## 📋 Overview

The **State Design Pattern** is a powerful behavioral design pattern that enables an object to change its behavior dynamically based on its internal state. This pattern is particularly useful when you have an object that must behave differently depending on its current state, and the number of states is substantial.

## 🎯 Key Concepts

### What is the State Pattern?
- 🔄 **Dynamic Behavior**: Objects can change their behavior at runtime
- 🏗️ **State Encapsulation**: Each state is encapsulated in separate classes
- 🔌 **Loose Coupling**: The context class is decoupled from specific state implementations
- 🎪 **Polymorphism**: States implement a common interface

### When to Use?
- ✅ When an object's behavior depends on its state
- ✅ When you have complex conditional statements based on object state
- ✅ When state transitions are frequent and well-defined
- ✅ When you want to avoid large switch/case statements

## 🏗️ Structure

```
Context ←→ State Interface
             ↑
    ┌────────┼────────┐
    │        │        │
ConcreteA ConcreteB ConcreteC
```

### Components:
1. **Context** - Maintains reference to current state
2. **State Interface** - Defines common interface for all states
3. **Concrete States** - Implement specific behavior for each state

## 💡 Real-World Examples

| Example | States | Behavior Changes |
|---------|--------|------------------|
| 🚦 Traffic Light | Red, Yellow, Green | Light changes and timing |
| 📱 Phone | Locked, Unlocked, Ringing | Available actions |
| 🎮 Game Character | Idle, Running, Jumping | Animation and physics |
| 🏧 ATM Machine | Idle, Card Inserted, PIN Entered | Available operations |

## ✅ Advantages

- 🎯 **Single Responsibility** - Each state handles its own behavior
- 🔄 **Open/Closed Principle** - Easy to add new states without modifying existing code
- 🧹 **Clean Code** - Eliminates complex conditional statements
- 🔧 **Maintainable** - State-specific code is organized and isolated

## ❌ Disadvantages

- 📈 **Complexity** - Can be overkill for simple state machines
- 🏗️ **Class Proliferation** - Creates many classes for each state
- 💾 **Memory Overhead** - Each state might be a separate object

## 🚀 Implementation Example

The `VendingMachineApp.java` in this directory demonstrates a practical implementation of the State pattern with a vending machine that has multiple operational states.

## 📚 Study Materials

🔗 **Comprehensive Guide**: [State Pattern Deep Dive](https://blog.algomaster.io/p/8df5aaae-268d-436f-8c42-88989e50ca92)

## 🏷️ Tags

`#DesignPatterns` `#BehavioralPattern` `#StatePattern` `#OOP` `#SoftwareArchitecture`

---

*📝 Part of the Low-Level Design (LLD) study materials*