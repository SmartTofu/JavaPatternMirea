package Task_6.BuilderPattern;

public interface AccountBuilder {

    // Этап 1
    public AccountBuilder specifyName();

    // Этап 2
    public AccountBuilder specifySurname();

    // Этап 3
    public AccountBuilder specifyCity();

    // Этап 4

    public AccountBuilder specifyStatus();

    // Создание аккаунта
    public Account build();
}
