import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        ArrayList<HospitalStaff> staffList = new ArrayList<>();
        staffList.add(new Doctor("Alice", "Cardiology", "Day Shift"));
        staffList.add(new Surgeon("Dr. Smith", "Orthopedics", "Knee Replacement"));
        staffList.add(new Nurse("John", "Emergency"));

        DutyNotification emailNotification = new EmailNotification();
        DutyNotification smsNotification = new SMSNotification();

        System.out.println("Hospital Staff Duties:");
        for (HospitalStaff staff : staffList) {
            System.out.println(staff.displayInfo());
            staff.performDuty();
            emailNotification.sendNotification(staff);
            smsNotification.sendNotification(staff);
            System.out.println();
        }

        System.out.println("Total Patients: " + Patients.getTotalPatients());
        System.out.println("Total Doctors: " + Doctor.getTotalDoctors());
    }
}
