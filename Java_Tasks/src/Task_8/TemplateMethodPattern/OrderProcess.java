package Task_8.TemplateMethodPattern;

abstract class OrderProcess {
    public void processOrder() {
        generateInvoice();
        performPayment();
        shipOrder();
    }

    public abstract void generateInvoice();
    public abstract void performPayment();
    public abstract void shipOrder();
}
