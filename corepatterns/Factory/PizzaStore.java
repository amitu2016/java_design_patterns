package corepatterns.Factory;

public class PizzaStore {
    public Pizza orderPizza(String type){
        
       Pizza p = Pizzafactory.createPizza(type);

        p.prepare();
        p.bake();
        p.cut();

        return p;
    }
}
