package Task_8.VisitorPattern;

public class Cafe implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
