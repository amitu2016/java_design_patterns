package corepatterns.Factory;

public class VegitablePizza implements Pizza{

    @Override
    public void prepare() {
       System.out.println("Preparing Vegitable Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Vegitable Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Vegitable Pizza");
    }
    
}
