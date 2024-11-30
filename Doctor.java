public class Doctor extends HospitalStaff {
    private String specialization;
    private String duty;
    private static int totalDoctors = 0;

    public Doctor(String name, String specialization, String duty) {
        super(name, "Doctor");
        this.specialization = specialization;
        this.duty = duty;
        totalDoctors++;
    }

    @Override
    public void performDuty() {
        System.out.println(name + " treats patients in the " + specialization + " department.");
    }

    public static int getTotalDoctors() {
        return totalDoctors;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nSpecialization: " + specialization + "\nDuty: " + duty;
    }
}
