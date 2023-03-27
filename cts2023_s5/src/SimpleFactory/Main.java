package SimpleFactory;

public class Main {
    public static void main(String[] args) {
       Pizza cheesePizza=PizzaFactory.crearePizza(PizzaType.Cheese);
       Pizza pepperoniPizza=PizzaFactory.crearePizza(PizzaType.Pepperoni);
       Pizza quatroStagioniPizza=PizzaFactory.crearePizza(PizzaType.Quatro_Stagioni);
    }
}