package Task_7.LinkerPattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> children = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int index) {
        if (index >= 0 && index < children.size()) {
            return children.get(index);
        } else {
            return null;
        }
    }

    @Override
    public void operation() {
        System.out.println("Composite action completed");
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "|-- " + name);
        for (Component component : children) {
            component.display(indent + "    ");
        }
    }

    @Override
    public String toString() {
        return "Composite{" + "name= " + name  + '}';
    }
}
