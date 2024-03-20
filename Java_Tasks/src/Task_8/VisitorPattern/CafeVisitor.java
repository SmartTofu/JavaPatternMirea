package Task_8.VisitorPattern;

public class CafeVisitor implements Visitor{
    @Override
    public void visit(Cafe cafe) {
        System.out.println("Person visited cafe.");
    }

    @Override
    public void visit(Restaurant restaurant) {}
}
