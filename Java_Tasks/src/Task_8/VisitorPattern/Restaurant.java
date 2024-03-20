package Task_8.VisitorPattern;

public class Restaurant implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
