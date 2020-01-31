package srp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> findAllUsers() {
        return new ArrayList<>();
    }

    public void savePostInDb(Post post) {
        System.out.println("post " + post + " has been saved in db");
    }

    public void validate(String msg) {
        //todo
    }

    public void addPost(Post post) {
        String msg = post.getMsg();
        LocalDateTime createdAt = LocalDateTime.now();
        createdAt = createdAt.truncatedTo(ChronoUnit.MINUTES);
        post.setDate(createdAt.toString());

        validate(msg);

        savePostInDb(post);

        MailSender mailSender = new MailSender();
        UserRepository repository = new UserRepository();
        List<User> usersToNotify = repository.findAllUsers();

        usersToNotify.forEach(
                e -> mailSender.sendEmail(e, msg)
        );
    }
}
