package order;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("email has been sent!");
    }
}
