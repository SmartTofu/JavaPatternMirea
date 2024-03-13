package Task_6.AbstractFactoryPattern;

public class Tester {

    public static void main(String[] args) {
        Client client1 = new Client(new ConcreteFactory());
        System.out.println("Achieving client-server connection:");
        client1.run();
        System.out.println("Connection achieved!");
    }
}
