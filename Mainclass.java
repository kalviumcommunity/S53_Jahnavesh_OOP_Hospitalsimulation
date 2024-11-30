import java.util.ArrayList;

class MainClass {
    public static void main(String[] args) {
        // Using HospitalStaff type but substituting the actual staff classes (Doctor, Nurse, etc.)
        ArrayList<HospitalStaff> staffList = new ArrayList<>();
        
        // We can add different types of hospital staff
        staffList.add(new Doctor("Alice", "Cardiology", "Day Shift"));
        staffList.add(new Surgeon("Dr. Smith", "Orthopedics", "Knee Replacement"));
        staffList.add(new Nurse("John", "Emergency"));

        // Liskov Substitution: We can replace one subclass with another
        // without affecting the correct functioning of the program.
        HospitalStaff staff = new Nurse("Peter", "ICU");
        
        // Now, regardless of the type of staff (Doctor, Nurse, or Surgeon), 
        // the performDuty method can be called without issue, demonstrating LSP
        staffList.add(staff);

        System.out.println("Hospital Staff Duties:");
        for (HospitalStaff staffMember : staffList) {
            System.out.println(staffMember.displayInfo());
            staffMember.performDuty();
            System.out.println();
        }
    }
}
