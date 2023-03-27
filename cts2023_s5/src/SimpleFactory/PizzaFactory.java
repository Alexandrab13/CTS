package SimpleFactory;

public class PizzaFactory {
    public static Pizza crearePizza(PizzaType pizzaType){
        switch (pizzaType){
            case Cheese -> new CheesePizza();
            case Pepperoni -> new PepperoniPizza();
            case Quatro_Stagioni -> new QuatroStagioniPizza();
        }
        return null;
    }
}
