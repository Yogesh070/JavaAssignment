# How to create your own exception class

Java provides us facility to create our own exceptions which are basically derived classes of Exception. For example MyException in below code extends the Exception class.

We pass the string to the constructor of the super class- Exception which is obtained using “getMessage()” function on the object created.

```javascript
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
  
// A Class that uses above MyException 
public class Main 
{ 
    // Driver Program 
    public static void main(String args[]) 
    { 
        try
        { 
            // Throw an object of user defined exception 
            throw new MyException("You!!"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
    } 
} 
```

### Output

Caught
You!!

# Difficult Question 

* How is abstract class different from interface
* What is benefit of Java