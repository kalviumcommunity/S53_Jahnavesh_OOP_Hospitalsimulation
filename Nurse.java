public class Nurse extends HospitalStaff {
  private String department;

  public Nurse(String name, String department) {
      super(name, "Nurse");
      this.department = department;
  }

  @Override
  public void performDuty() {
      System.out.println(name + " assists patients in the " + department + " department.");
  }

  @Override
  public String displayInfo() {
      return super.displayInfo() + "\nDepartment: " + department;
  }
}
