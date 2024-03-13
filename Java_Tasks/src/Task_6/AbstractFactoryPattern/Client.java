package Task_6.AbstractFactoryPattern;

public class Client {

    private ServerDevice serverDevice;
    private ClientDevice clientDevice;

    public Client(AbstractFactory factory) {
        serverDevice = factory.createServerDevice();
        clientDevice = factory.createClientDevice();
    }

    public void run() {
        clientDevice.sendRequest();
        serverDevice.acceptRequest();
    }
}
