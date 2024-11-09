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

    public Doctor() {
        super("Unknown", "Doctor");
        this.specialization = "Unknown";
        this.duty = "Not Assigned";
        System.out.println("Default constructor called");
        totalDoctors++;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nSpecialization: " + specialization + "\nDuty: " + duty;
    }

    public void assignDuty(String duty) {
        this.duty = duty;
        System.out.println("Doctor with specialization in " + specialization + " assigned to " + duty + ".");
    }

    public static int getTotalDoctors() {
        return totalDoctors;
    }

    @Override
    public void workingHours() {
        System.out.println(super.name + " works for 12 hours a day.");
    }
}
