package singleton;

public class SingleTonClient {
    public static void main(String[] args) {
        SingletonEager singleton=SingletonEager.getSingleton();
        System.out.println(singleton.hashCode());

        SingletonEager singleton2=SingletonEager.getSingleton();
        System.out.println(singleton2.hashCode());

        System.out.println("-------------lazy object creation---------------");
        SingletonLazy singletonLazy = SingletonLazy.getSingleton();
        System.out.println(singletonLazy.hashCode());

        SingletonLazy singletonLazy2 = SingletonLazy.getSingleton();
        System.out.println(singletonLazy.hashCode());

        System.out.println("-------------for multithreading---------------");
        SingletonLazyMultithreaded singletonLazyMultithreaded = SingletonLazyMultithreaded.getSingletonLazyMultithreaded();
        System.out.println(singletonLazyMultithreaded.hashCode());

        SingletonLazyMultithreaded singletonLazyMultithreaded2 = SingletonLazyMultithreaded.getSingletonLazyMultithreaded();
        System.out.println(singletonLazyMultithreaded2.hashCode());

        System.out.println("-------------multithreading double check---------------");
        SingletonLazyDoubleCheck singletonLazyDoubleCheck=SingletonLazyDoubleCheck.getSingletonLazyDoubleCheck();
        System.out.println(singletonLazyDoubleCheck.hashCode());

        SingletonLazyDoubleCheck singletonLazyDoubleCheck2=SingletonLazyDoubleCheck.getSingletonLazyDoubleCheck();
        System.out.println(singletonLazyDoubleCheck2.hashCode());

        System.out.println("-----------Using serializer.......");
        Singleton singletonS=Singleton.getSingleton();
        System.out.println(singletonS.hashCode());

        Singleton singletonSS=Singleton.getSingleton();
        System.out.println(singletonSS.hashCode());

    }
}
