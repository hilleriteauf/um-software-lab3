public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        order.addItem(new Item("Chicken", 100));
        order.addItem(new Item("Beef", 50));
        order.addItem(new Item("Fish", 10));
        order.addItem(new Item("Potatoes", 20));
        System.out.println(order.toString());

        order.addItem(new Item("Carrots", 25));
        System.out.println(order.toString());

        order.addItem(new Item("Onions", 60));
        System.out.println(order.toString());
    }
}