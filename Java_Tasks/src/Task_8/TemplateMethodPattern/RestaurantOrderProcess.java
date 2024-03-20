package Task_8.TemplateMethodPattern;

public class RestaurantOrderProcess extends OrderProcess{
    @Override
    public void generateInvoice() {
        System.out.println("Creating an order in a restaurant;");
    }

    @Override
    public void performPayment() {
        System.out.println("Paying for an order in a restaurant;");
    }

    @Override
    public void shipOrder() {
        System.out.println("Packaging and shipping of the order.");
    }
}
