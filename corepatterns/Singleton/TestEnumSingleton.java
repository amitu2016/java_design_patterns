package corepatterns.Singleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Amit Upadhyay");
        System.out.println(instance.getName());
    }
}
