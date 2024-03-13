package Task_6.PrototypePattern;

public class InstituteOfInformationTechnologies extends Institute {

    public InstituteOfInformationTechnologies() {
        setSpeciality("Software engineering");
    }

    @Override
    void printSpeciality() {
        System.out.println(this.getSpeciality());
    }
}
