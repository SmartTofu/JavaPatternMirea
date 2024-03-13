package Task_6.AbstractFactoryPattern;

public class Smartphone implements ClientDevice{

    @Override
    public void sendRequest() {
        System.out.println("Client smartphone send request;");
    }
}
