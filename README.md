**Teammate:**
Originally this project was suppose to be a collaboration between me and 1vogada (Ivo) however due to disagreement about the project direction we decided to split up.

GITHUB LINK: https://github.com/Damyan03/SDE-Assignment-3/tree/main

## Design Patterns Used

### 1. Strategy Pattern
**Description**: Allows defining a family of algorithms, encapsulating each one, and making them interchangeable. It lets the algorithm vary independently from the client that uses it.

**Usage**: Applied through the `StrategyAttack` interface and its concrete implementations like `ConcreteStrategyAttackBow` and `ConcreteStrategyAttackSword`. It enables `Character` objects to dynamically change their attack behavior.

### 2. Decorator Pattern
**Description**: Allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

**Usage**: Implemented using the `CharacterDecorator` class and concrete decorators like `FireEnchantmentDecorator`. It enables adding new behavior (e.g., fire enchantment) to `Character` objects without altering the `Character` class structure.

### 3. Factory Method Pattern
**Description**: Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

**Usage**: Utilized by the `CharacterFactory` interface and its concrete implementations (`MageFactory` and `WarriorFactory`). It's used to create `Character` objects, allowing the instantiation process to be flexible and loosely coupled.

### 4. Abstract Factory
**Description**: A creational design pattern that lets you produce families of related objects without specifying their concrete classes.

**Usage**: Utilised by the main method at runtime, `WarriorFactory` and `MageFactory` implement the Abstract Factory design pattern providing a clean and scalable way to create families of related objects without having to hardcode their concrete classes in the code.

### 5. Template Method Pattern
**Description**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

**Usage**: Seen in the `Character` class's `attack` method. It outlines the structure of the attack process, and subclasses like `Mage` can override methods like `prepareForAttack` and `finalizeAttack` to customize the algorithm.

## Class Diagram
![Screenshot_3](https://github.com/Damyan03/SDE-Assignment-3/assets/112628176/75069404-0b28-48e2-b8dd-532346c42fe0)
