import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        ArrayList<HospitalStaff> staffList = new ArrayList<>();

        staffList.add(new Doctor("Alice", "Cardiology", "Day Shift"));
        staffList.add(new Surgeon("Dr. Smith", "Orthopedics", "Knee Replacement"));

        System.out.println("Hospital Staff Duties:");
        for (HospitalStaff staff : staffList) {
            System.out.println(staff.displayInfo());
            staff.performDuty();
            System.out.println();
        }

        ArrayList<Patients> patientsList = new ArrayList<>();
        patientsList.add(new Patients("Ram", "Kumar", "Ram123@gmail.com", 12345));
        patientsList.add(new Patients("Raju", "Ridhi", "RajuRidhi@gmail.com", 94402));

        for (int i = 0; i < patientsList.size(); i++) {
            patientsList.get(i).assignID(i + 1);
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
