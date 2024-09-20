import java.util.ArrayList;

class MainClass {

  public static void main(String[] args) {
    ArrayList<Patients> patientsList = new ArrayList<>();
    patientsList.add(new Patients("Ram", "Kumar", "Ram123@", 12345));
    patientsList.add(new Patients("Raju", "Ridhi", "RajuRidhi@gmail.com", 94402));

    for (int i = 0; i < patientsList.size(); i++) {
      patientsList.get(i).assignID(i + 1);
    }

    ArrayList<Doctor> doctorsList = new ArrayList<>();
    doctorsList.add(new Doctor("Cardiology", "Night Shift"));
    doctorsList.add(new Doctor("Neurology", "Day Shift"));

    System.out.println("Doctors List:");
    for (Doctor doctor : doctorsList) {
      System.out.println(doctor.displayInfo());
    }

    System.out.println("\nPatients List:");
    for (Patients patient : patientsList) {
      System.out.println(patient.displayInfo());
      System.out.println("Is email valid? " + patient.validateEmail());
      System.out.println();
    }

    System.out.println("Total Patients: " + Patients.getTotalPatients());
    System.out.println("Total Doctors: " + Doctor.getTotalDoctors());
  }
}
