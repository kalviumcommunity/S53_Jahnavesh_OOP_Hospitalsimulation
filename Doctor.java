public class Doctor {
  private String specialization;
  private String duty;
  
  private static int totalDoctors = 0;

  public Doctor(String specialization, String duty) {
      this.specialization = specialization;
      this.duty = duty;
      totalDoctors++;
  }

  public Doctor() {
    this.specialization = "Unknown";
    this.duty = "Not Assigned";
    System.out.println("Default constructor called");
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

  public String displayInfo() {
      return "Specialization: " + specialization + "\nDuty: " + duty;
  }

  public void assignDuty(String duty) {
      this.duty = duty;
      System.out.println("Doctor with specialization in " + specialization + " assigned to " + duty + ".");
  }

  public static int getTotalDoctors() {
      return totalDoctors;
  }
}
