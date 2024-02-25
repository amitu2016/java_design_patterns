package corepatterns.Factory;

public class Pizzafactory {
        public static Pizza createPizza(String type){
            Pizza p = null;
            if (type.equalsIgnoreCase("cheese")) {
                p = new CheesePizza();
            }else if (type.equalsIgnoreCase("chicken")) {
                p = new ChickenPizza();
            }else if (type.equalsIgnoreCase("vegitable")) {
                p = new VegitablePizza();
            }
            return p;
        }
}
