package singleton;

public class SingleTonClient {
    public static void main(String[] args) {
        /*SingletonEager singleton=SingletonEager.getSingleton();
        System.out.println(singleton.hashCode());

        SingletonEager singleton2=SingletonEager.getSingleton();
        System.out.println(singleton2.hashCode());*/
        //

        SingletonLazy singletonLazy=SingletonLazy.getSingleton();
        System.out.println(singletonLazy.hashCode());

        SingletonLazy singletonLazy2=SingletonLazy.getSingleton();
        System.out.println(singletonLazy.hashCode());
    }
}
