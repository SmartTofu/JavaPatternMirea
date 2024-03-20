package Task_8.VisitorPattern;

public class RestaurantVisitor implements Visitor{
    @Override
    public void visit(Cafe cafe) {}

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Person visited restaurant.");
    }
}
