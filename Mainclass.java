class MainClass {

  public static void main(String[] args) {
    Patients Ram = new Patients("Ram", "Kumar" , "Ram123@" ,12345);
    System.out.println(Ram.getEmail());
    System.out.println(Ram.getFullName());

  }
}