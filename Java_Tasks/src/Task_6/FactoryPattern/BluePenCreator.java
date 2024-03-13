package Task_6.FactoryPattern;

public class BluePenCreator extends Creator {
    @Override
    public Product createProduct() {
        return new BluePen();
    }
}
