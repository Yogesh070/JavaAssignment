# Design Pattern

Patterns are an excellent way to document design understanding, and to pass that understanding on to others who are learning how to design. By thinking about relevant patterns as they design, designers can work more rapidly and produce higher-quality work because they are reusing the experience of others.

## Design patterns proposed by the  Gang of Four:

- Creational patterns
- Structural patterns
- Behavioral patterns

### Creational Pattern

Creational patterns are associated with control mechanisms of creating objects. The basic mode of forming an object may be problematic in some projects and may lead to unnecessary complexity in some areas. Creational patterns are supposed to prevent from occurring problems and introduce more control over creating objects. Their task is to separate the processes of creation, completion and representation of an object.

There are five well-known design patterns possible to implement in a wide scope of programming languages:

- Abstract Factory Pattern
- Builder Pattern
- Factory Method Pattern
- Prototype Pattern
- Singleton Pattern

### 1. Singleton Pattern

#### Context:

In software systems, it is very common to find classes for which you want only one instance to exist Such a class is called a singleton.
For example, the Company or University classes in systems that run the business of that company or university might be singletons. Another example is the MainWindow class in a graphical user interface for systems that can only have one main window open.

#### How to create singleton class ? 

1. A private class variable, often called theInstance. This stores the single instance.
2. A public class method (static method), often called getInstance. The first time this method is called, it creates the single instance and stores it in theInstance. Subsequent calls simply return theInstance.
3. A private constructor, which ensures that no other class will be able to create an instance of the singleton class.

#### Example

In an employee management system (Figure 6.7), the Company class might be the central class that encapsulates several important features related to the system as a whole. The Singleton implementation ensures that only one instance of this important class can exist. The public class method getInstance makes this instance globally accessible.

#### Note:

The Singleton pattern should not be overused, since the singleton instance is effectively a global variable, and the use of global variables should be minimized.

#### Reference Links: 
[Singleton Pattern](Assignment_8/readme.md)

### The FACTORY METHOD Pattern
The Factory Method pattern is one of the best known design patterns.

Its task is to hide details of creating objects from clients and, at the same time, provide interface to generate them. Classes implementing interface decide about class of creating object.
A client expects a secured implementation of an interface or abstract class, but is not interested in a specific implementation. However, a programmer can easily expand the portfolio of a factory with additional object classes.

When designing your application it is worth considering whether and application actually needs the objectives factory. If a product has many classes with a similar base class and you manipulate objects in the interface or abstract class, then Factory Method Patter would definitely be useful.

#### Context:
You have a reusable framework that needs to create objects as part of its work. However, the class of the created objects will depend on the application.

#### Problem

How do you enable a programmer to add a new application-specific class «ApplSpecificClass» into a system built on such a framework? And how do you arrange for the framework to instantiate this class, without modifying the framework?

#### Solution
The framework delegates the creation of instances of «ApplSpecificClass» to a specialized class «ApplSpecificFactory». The «ApplSpecificFactory» imple- ments a generic interface «Factory» defined in the framework. The «Factory» declares a method whose purpose is to create some subclass «AppSpecificClass» of a class we will call «GenericClass». This is illustrated in Figure below:


#### Abstract Factory

The Abstract Factory Pattern goes a step further and moves to a higher level of abstraction (hence the name). In this case, a client has no clue what kind of factory is used. Abstract factory provides an interface for creating groups of dependent objects, which are used by the client, without giving their exact implementation.
The main difference between Factory Method Pattern and Abstract Factory Pattern is the fact that in the former a client receives one product, whereas in the latter a client gets the whole group of products.



### STRUCTURAL PATTERNS
The most important feature of these patterns is to facilitate the operation and design applications through finding an easy way to realize dependencies between entities. Due to this patterns it is easier to design applications which contain independent class libraries.

The following structural patterns are one of the best well-known ones:

- Adapter Pattern
- Decorator Pattern
- Facade Pattern
- Proxy Pattern
- Composite Pattern

### Adapter Pattern