package Task_7.LinkerPattern;

public class Tester {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("cool_Object");
        Leaf leaf2 = new Leaf("beautiful_Object");
        Leaf leaf3 = new Leaf("cute_Object");
        Leaf leaf4 = new Leaf("stupid_Object");
        Leaf leaf5 = new Leaf("english_Object");

        Composite composite_1 = new Composite("bad_head_Object");
        composite_1.add(leaf1);
        composite_1.add(leaf2);

        Composite composite_2 = new Composite("ugly_head_Object");
        composite_2.add(leaf3);
        composite_2.add(leaf4);

        composite_1.add(composite_2);
        composite_1.add(leaf5);

        composite_1.operation();
        System.out.println("Tree structure:");
        composite_1.display("");

        System.out.println(composite_2.getChild(0));
    }
}
