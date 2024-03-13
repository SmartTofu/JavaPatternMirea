package Task_6.PrototypePattern;

public class Tester {

    public static void main(String[] args) {
        InstituteOfInformationTechnologies iit = new InstituteOfInformationTechnologies();
        iit.printSpeciality();
        InstituteOfInformationTechnologies clonedIit = (InstituteOfInformationTechnologies)
                iit.clone();
        clonedIit.printSpeciality();

        InstituteOfArtificialIntelligence iai = new InstituteOfArtificialIntelligence();
        iai.printSpeciality();;
        InstituteOfArtificialIntelligence clonedIai = (InstituteOfArtificialIntelligence)
                iai.clone();
        clonedIai.printSpeciality();
    }
}
