public class Surgeon extends Doctor {
  private String surgeryType;

  public Surgeon(String name, String specialization, String duty, String surgeryType) {
      super(name, specialization, duty);
      this.surgeryType = surgeryType;
  }

  public Surgeon() {
      super();
      this.surgeryType = "General Surgery";
      System.out.println("Default constructor for Surgeon called");
  }

  public String getSurgeryType() {
      return surgeryType;
  }

  public void setSurgeryType(String surgeryType) {
      this.surgeryType = surgeryType;
  }

  @Override
  public String displayInfo() {
      return super.displayInfo() + "\nSurgery Type: " + surgeryType;
  }

  public void performSurgery() {
      System.out.println(getName() + " is performing a " + surgeryType + ".");
  }
}
