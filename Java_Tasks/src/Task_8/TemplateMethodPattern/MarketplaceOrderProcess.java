package Task_8.TemplateMethodPattern;

public class MarketplaceOrderProcess extends OrderProcess{

    @Override
    public void generateInvoice() {
        System.out.println("Selection of goods on the marketplace;");
    }

    @Override
    public void performPayment() {
        System.out.println("Payment for goods on the marketplace website;");
    }

    @Override
    public void shipOrder() {
        System.out.println("Sending goods from the marketplace warehouse.");
    }
}
