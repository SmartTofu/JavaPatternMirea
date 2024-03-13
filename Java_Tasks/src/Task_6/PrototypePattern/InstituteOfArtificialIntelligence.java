package Task_6.PrototypePattern;

public class InstituteOfArtificialIntelligence extends Institute {

    public InstituteOfArtificialIntelligence() {
        setSpeciality("Applied mathematics and computer science");
    }

    @Override
    void printSpeciality() { System.out.println(this.getSpeciality()); }
}
