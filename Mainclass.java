import java.util.ArrayList;

class MainClass {

    public static void main(String[] args) {
        ArrayList<Patients> patientsList = new ArrayList<>();
        patientsList.add(new Patients("Ram", "Kumar", "Ram123@", 12345));
        patientsList.add(new Patients("Raju", "Ridhi", "RajuRidhi@gmail.com", 94402));

        for (int i = 0; i < patientsList.size(); i++) {
            patientsList.get(i).assignID(i + 1);
        }

        ArrayList<Surgeon> surgeonsList = new ArrayList<>();
        surgeonsList.add(new Surgeon("Dr. Asha", "Cardiology", "Night Shift", "Heart Surgery"));
        surgeonsList.add(new Surgeon("Dr. Ravi", "Neurology", "Day Shift", "Brain Surgery"));

        System.out.println("Surgeons List:");
        for (Surgeon surgeon : surgeonsList) {
            System.out.println(surgeon.displayInfo());
            System.out.println();
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
