public class EmailNotification extends DutyNotification {

  @Override
  public void sendNotification(HospitalStaff staff) {
      System.out.println("Sending email to " + staff.name + " about their duties.");
  }
}
