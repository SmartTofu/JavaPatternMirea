package Task_6.BuilderPattern;

public class Tester {

    public static void main(String[] args) {
        AccountBuilder randomBuilder = new RandomAccountBuilder();
        AutomaticSignIn randomRegistration = new AutomaticSignIn(randomBuilder);

        AccountBuilder myBuilder = new MyAccountBuilder();
        AutomaticSignIn myRegistration = new AutomaticSignIn(myBuilder);

        Account account1 = randomRegistration.signIn();
        Account account2 = randomRegistration.signIn();
        Account account3 = myRegistration.signIn();

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}
