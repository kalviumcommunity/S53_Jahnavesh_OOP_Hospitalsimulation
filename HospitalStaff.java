public class HospitalStaff {
  String name;
  String role;

  public HospitalStaff(String name, String role) {
      this.name = name;
      this.role = role;
  }

  public void workingHours() {
      System.out.println(name + " works for 8 hours a day.");
  }

  public String displayInfo() {
      return "Name: " + name + "\nRole: " + role;
  }
}
