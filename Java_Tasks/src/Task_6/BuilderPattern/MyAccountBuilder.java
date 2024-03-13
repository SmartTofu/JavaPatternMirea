package Task_6.BuilderPattern;

public class MyAccountBuilder implements AccountBuilder{

    private String name;
    private String surname;
    private String city;
    private String status;

    public MyAccountBuilder() { super(); }

    @Override
    public AccountBuilder specifyName() {
        this.name = "Kirill";
        return this;
    }

    @Override
    public AccountBuilder specifySurname() {
        this.surname = "Yakobchuk";
        return this;
    }

    @Override
    public AccountBuilder specifyCity() {
        this.city = "Moscow";
        return this;
    }

    @Override
    public AccountBuilder specifyStatus() {
        this.status = "There isn't a secret ingredient";
        return this;
    }

    @Override
    public Account build() {
        Account account = new Account(name, surname, city, status);
        if (account.doQualityCheck()) {
            return account;
        } else {
            System.out.println("Account assembly is incomplete.");
        }
        return null;
    }
}
