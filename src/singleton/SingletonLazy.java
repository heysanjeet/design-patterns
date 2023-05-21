package singleton;

public class SingletonLazy {
    private static SingletonLazy singleton = null;

    private SingletonLazy() {

    }
    //create object on first request and send same object on successive calls.
    public static SingletonLazy getSingleton() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }

    public synchronized static SingletonLazy getSingletonThreadSafe() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
