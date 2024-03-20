package Task_7.LinkerPattern;

public class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf action completed");
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "|-- " + name);
    }

    @Override
    public String toString() {
        return "Leaf{" + "name= " + name  + '}';
    }
}
