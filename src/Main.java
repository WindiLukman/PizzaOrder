public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory myFactory = new SimplePizzaFactory();
        PizzaStore myPizzaStore = new PizzaStore(myFactory);

        Pizza order1 = myPizzaStore.orderPizza("cheese");
        System.out.println("You ordered a " + order1.getName() + "\n");

        Pizza order2 = myPizzaStore.orderPizza("meat");
        System.out.println("You ordered a " + order2.getName() + "\n");

        Pizza order3 = myPizzaStore.orderPizza("pepperoni");
        System.out.println("You ordered a " + order3.getName() + "\n");
    }
}
