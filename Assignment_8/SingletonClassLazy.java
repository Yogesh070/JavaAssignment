package Assignment_8;

//Implementation of singleton class in lazymethod
public class SingletonClassLazy {
    private static SingletonClassLazy  obj;
    private SingletonClassLazy(){}
    public static SingletonClassLazy getInstance(){
        if (obj==null) {
          obj  = new SingletonClassLazy();
          return obj;
        } else {
        return obj;
        }
    }

    public static void main(String[] args) {
        SingletonClassLazy obj1=SingletonClassLazy.getInstance();
        SingletonClassLazy obj2=SingletonClassLazy.getInstance();
        if (obj1.hashCode()==obj2.hashCode()) {
            System.out.println("Successfully implemented singleton class in lazy way ");
        }else{
            System.out.println("Error Implementing Singleton class");

        }
    }
}