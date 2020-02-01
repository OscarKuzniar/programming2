package srp;

import java.util.List;

public class MailSender {

    public static void sendEmail(User user, String msg) {
        System.out.println("email has been sent to user: " + user);
        System.out.println("Message:\n" + msg);
    }

    public static void notifyAllUsers(List<User> usersToNotify, String msg) {
        usersToNotify.forEach(
                e -> sendEmail(e, msg)
        );
    }
}
