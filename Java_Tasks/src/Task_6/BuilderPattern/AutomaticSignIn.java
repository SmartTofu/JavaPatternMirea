package Task_6.BuilderPattern;

public class AutomaticSignIn {

    private AccountBuilder builder;

    public AutomaticSignIn(AccountBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("No builder - no account!");
        }
    }

    public Account signIn() {
        return builder.specifyName().specifySurname().
                specifyCity().specifyStatus().build();
    }
}
