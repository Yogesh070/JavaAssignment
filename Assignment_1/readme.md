# ANONYMOUS ARRAY:

An array in Java without any name is called anonymous array.It is created for using instantly.It is passed as argument of method.

## Syntax:
* new int[] {1,2,3} //anonymous int array
* new String[] {'hello', 'world'}

## Example:
```javascript
class Test { 
    public static void main(String[] args) 
    { 
          // anonymous array 
          sum(new int[]{ 1, 2, 3 }); 
    } 
    public static void sum(int[] a) 
    { 
        int total = 0; 
  
        // using for-each loop 
        for (int i : a)  
            total = total + i; 
          
        System.out.println("The sum is:" + total); 
    } 
} 
```
### output:
The sum is 6