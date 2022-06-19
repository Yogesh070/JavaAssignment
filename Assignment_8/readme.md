# In Java, Singleton is a design pattern that ensures that a class can only have one object.

## Singleton Desing pattern 

Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern

- Early Instantiation: creation of instance at load time.
- Lazy Instantiation: creation of instance when required.

## To create a singleton class, a class must implement the following properties:

1. Create a private constructor of the class to restrict object creation outside of the class.
2. Create a private attribute of the class type that refers to the single object.
3. Create a public static method that allows us to create and access the object we created. Inside the method, we will create a condition that restricts us from creating more than one object.

### Class Diagram link :- [Singleton Class Diagram](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#G13P6TICbj2rIJuBHaHqzK2nZfupfQkGx3)