package class27;

public class Pet extends Insurance {
    String petType;

    Pet(String petType, String insuranceName) {
        this.petType=petType;
        super.insuranceName=insuranceName;

    }
}