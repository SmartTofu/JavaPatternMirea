package Task_6.FactoryPattern;

public class BlackPenCreator extends Creator {
    @Override
    public Product createProduct() {
        return new BlackPen();
    }
}
