package singleton;

public class SingletonEager {
    private static SingletonEager singleton = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getSingleton() {
        return singleton;
    }
}
