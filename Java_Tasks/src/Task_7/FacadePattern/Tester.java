package Task_7.FacadePattern;

public class Tester {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
        carFacade.stopCar();
    }
}
