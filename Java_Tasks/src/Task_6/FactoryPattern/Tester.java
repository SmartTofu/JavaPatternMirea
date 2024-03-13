package Task_6.FactoryPattern;

public class Tester {

    public static void main(String[] args) {
        Creator bluePen = new BluePenCreator();
        bluePen.displayProduct();

        Creator blackPen = new BlackPenCreator();
        blackPen.displayProduct() ;
    }
}
