package order;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        sendMail(user);
    }

    public void sendMail(User user) {
        System.out.println("email has been sent: " + user.getEmail());
    }
}
