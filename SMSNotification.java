public class SMSNotification extends DutyNotification {

  @Override
  public void sendNotification(HospitalStaff staff) {
      System.out.println("Sending SMS to " + staff.name + " about their duties.");
  }
}
