public class Patients {
  private int ID;
  private String firstName;
  private String secondName;
  private String email;
  private int number;

  private static int totalPatients = 0;

  public Patients(String firstName, String secondName, String email, int number) {
      this.firstName = firstName;
      this.secondName = secondName;
      this.email = email;
      this.number = number;
      totalPatients++;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public String getFirstName() {
      return firstName;
  }

  public void setSecondName(String secondName) {
      this.secondName = secondName;
  }

  public String getSecondName() {
      return secondName;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getEmail() {
      return email;
  }

  public int getNumber() {
      return number;
  }

  public void setNumber(int number) {
      this.number = number;
  }

  public String getFullName() {
      return firstName + " " + secondName;
  }

  public String displayInfo() {
      return "Patient ID: " + ID + "\n" +
             "Name: " + getFullName() + "\n" +
             "Email: " + email + "\n" +
             "Contact Number: " + number;
  }

  public void assignID(int ID) {
      this.ID = ID;
  }

  public boolean validateEmail() {
      return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
  }

  public static int getTotalPatients() {
      return totalPatients;
  }
}
