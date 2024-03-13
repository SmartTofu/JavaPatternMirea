package Task_6.AbstractFactoryPattern;

public class ConcreteFactory implements AbstractFactory {

    @Override
    public ClientDevice createClientDevice() {
        return new Smartphone();
    }

    @Override
    public ServerDevice createServerDevice() {
        return new Server();
    }
}
