package Task_6.AbstractFactoryPattern;

public class Server implements ServerDevice{
    @Override
    public void acceptRequest() {
        System.out.println("Server accept request;");
    }
}
