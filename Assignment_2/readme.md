# Default method in interface

Default method is a new feature in Java which allows the developer to add new methods to the interfaces without breaking their existing implementation.If a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.


### Code for implementation  of Default method in Java

```javascript
public interface Vehicle {
     
    String getBrand();
     
    String speedUp();
     
    String slowDown();
     
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
     
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
```

# Inheritance in interface

An interface contains variables and methods like a class but the methods in an interface are abstract by default unlike a class. Multiple inheritance by interface occurs if a class implements multiple interfaces or also if an interface itself extends multiple interfaces.

```javascript
interface AnimalEat {
   void eat();
}
interface AnimalTravel {
   void travel();
}
class Animal implements AnimalEat, AnimalTravel {
   public void eat() {
      System.out.println("Animal is eating");
   }
   public void travel() {
      System.out.println("Animal is travelling");
   }
}
public class Demo {
   public static void main(String args[]) {
      Animal a = new Animal();
      a.eat();
      a.travel();
   }
}
```
### Output

Animal is eating/
Animal is travelling

# Nested interface

An interface i.e. declared within another interface or class is known as nested interface. The nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It can't be accessed directly.

```javascript
import java.util.*; 
class Test 
{ 
    interface Yes 
    { 
        void show(); 
    } 
} 
  
class Testing implements Test.Yes 
{ 
    public void show() 
    { 
        System.out.println("show method of interface"); 
    } 
} 
  
class A 
{ 
    public static void main(String[] args) 
    { 
        Test.Yes obj; 
        Testing t = new Testing(); 
        obj=t; 
        obj.show(); 
    } 
} 
```