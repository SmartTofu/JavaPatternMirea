package Task_6.AbstractFactoryPattern;

public interface AbstractFactory {
    ClientDevice createClientDevice();
    ServerDevice createServerDevice();
}
