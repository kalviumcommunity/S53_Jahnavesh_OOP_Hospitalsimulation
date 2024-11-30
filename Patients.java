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

    public void assignID(int ID) {
        this.ID = ID;
    }

    public boolean validateEmail() {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public String displayInfo() {
        return "Patient ID: " + ID + "\n" +
               "Name: " + firstName + " " + secondName + "\n" +
               "Email: " + email + "\n" +
               "Contact Number: " + number;
    }
}
