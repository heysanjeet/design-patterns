package singleton;

public class SingletonLazyDoubleCheck {
    private static SingletonLazyDoubleCheck singletonLazyDoubleCheck = null;

    private SingletonLazyDoubleCheck() {
    }

    public static SingletonLazyDoubleCheck getSingletonLazyDoubleCheck() {
        if (singletonLazyDoubleCheck == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (singletonLazyDoubleCheck == null) {
                    singletonLazyDoubleCheck = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singletonLazyDoubleCheck;
    }
}
