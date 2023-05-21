package singleton;

public class SingletonLazyMultithreaded {
    private static SingletonLazyMultithreaded singletonLazyMultithreaded = null;

    private SingletonLazyMultithreaded() {
    }

    public synchronized static SingletonLazyMultithreaded getSingletonLazyMultithreaded() {
        if (singletonLazyMultithreaded == null) {
            singletonLazyMultithreaded = new SingletonLazyMultithreaded();
        }
        return singletonLazyMultithreaded;
    }

}
