class MainClass {

  public static void main(String[] args) {
    Patients Ram = new Patients("Ram", "Kumar" , "Ram123@" ,12345);
    Patients Raju = new Patients("Raju", "Ridhi" , "RajuRidhi@gmail.com" ,94402);
    Doctor doctor1 = new Doctor("Cardiology", "Night Shift");
    Doctor doctor2 = new Doctor("Neurology", "Day Shift");
    System.out.println(doctor1.displayInfo());
    System.out.println(Ram.getEmail());
    System.out.println(Ram.getFullName());
    System.out.println(Ram.validateEmail());
    System.out.println(Raju.validateEmail());
    System.out.println();

  }
}