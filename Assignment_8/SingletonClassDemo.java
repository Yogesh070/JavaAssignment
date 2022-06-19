package Assignment_8;

public class SingletonClassDemo {
    private static SingletonClassDemo  obj= new SingletonClassDemo();
    private SingletonClassDemo(){}
    public static SingletonClassDemo getInstance(){
        return obj;
    }

    public static void main(String[] args) {
        SingletonClassDemo obj1=SingletonClassDemo.getInstance();
        SingletonClassDemo obj2=SingletonClassDemo.getInstance();
        if (obj1.hashCode()==obj2.hashCode()) {
            System.out.println("Successfully implemented singleton class");
        }else{
            System.out.println("Error Implementing Singleton class");

        }
    }
}
