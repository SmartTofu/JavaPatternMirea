package Task_6.FactoryPattern;

abstract class Creator {

    public abstract Product createProduct();

    public void displayProduct() {
        Product product = createProduct();
        product.display();
    }
}
