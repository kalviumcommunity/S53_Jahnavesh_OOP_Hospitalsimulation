public abstract class HospitalStaff {
    protected String name;
    protected String role;

    public HospitalStaff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public abstract void performDuty();

    public String displayInfo() {
        return "Name: " + name + "\nRole: " + role;
    }
}
