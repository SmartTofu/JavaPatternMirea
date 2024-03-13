package Task_6.BuilderPattern;

import Task_6.RandomStringGenerator;

public class RandomAccountBuilder implements AccountBuilder {

    private String name;
    private String surname;
    private String city;
    private String status;

    public RandomAccountBuilder() {
        super();
    }

    @Override
    public AccountBuilder specifyName() {
        this.name = RandomStringGenerator.generateRandomString(5);
        return this;
    }

    @Override
    public AccountBuilder specifySurname() {
        this.surname = RandomStringGenerator.generateRandomString(5);
        return this;
    }

    @Override
    public AccountBuilder specifyCity() {
        this.city = RandomStringGenerator.generateRandomString(5);
        return this;
    }

    @Override
    public AccountBuilder specifyStatus() {
        this.status = RandomStringGenerator.generateRandomString(5);
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
