public class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, String specialization, String surgeryType) {
        super(name, specialization, "Performing Surgery");
        this.surgeryType = surgeryType;
    }

    @Override
    public void performDuty() {
        System.out.println(name + " performs " + surgeryType + " surgeries.");
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nSurgery Type: " + surgeryType;
    }
}
