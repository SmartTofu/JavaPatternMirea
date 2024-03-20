package Task_8.VisitorPattern;

public class Tester {
    public static void main(String[] args) {
        Visitor restaurantVisitor = new RestaurantVisitor();
        Visitor cafeVisitor = new CafeVisitor();

        Restaurant restaurant = new Restaurant();
        Cafe cafe = new Cafe();

        restaurant.accept(restaurantVisitor);
        cafe.accept(cafeVisitor);
    }
}
