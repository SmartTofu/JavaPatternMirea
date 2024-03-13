package Task_6.BuilderPattern;

public class Account {

    private String name;
    private String surname;
    private String city;
    private String status;

    public Account() {
        super();
    }

    public Account(String name, String surname, String city, String status) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String city) {
        this.city = city;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean doQualityCheck() {
        return (name != null && !name.trim().isEmpty())
                && (surname != null && !surname.trim().isEmpty())
                && (city != null && !city.trim().isEmpty())
                && (status != null && !status.trim().isEmpty());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Account [name=").append(name).
                append(", surname=").append(surname).
                append(", city=").append(city).
                append(", status=").append(status).
                append("]");
        return builder.toString();
    }
}
