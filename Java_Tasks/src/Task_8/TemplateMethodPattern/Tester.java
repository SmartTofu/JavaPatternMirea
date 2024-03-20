package Task_8.TemplateMethodPattern;

public class Tester {
    public static void main(String[] args) {
        OrderProcess restaurantOrder = new RestaurantOrderProcess();
        restaurantOrder.processOrder();

        System.out.println("\n");

        OrderProcess marketplaceOrder = new MarketplaceOrderProcess();
        marketplaceOrder.processOrder();
    }
}
