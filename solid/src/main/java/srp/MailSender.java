package srp;

public class MailSender {

    public void sendEmail(User user, String msg) {
        System.out.println("email has been sent to user: " + user);
        System.out.println("Message:\n" + msg);
    }
}
