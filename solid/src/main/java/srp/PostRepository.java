package srp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static srp.Validator.validatePostMessage;

public class PostRepository {


    public void savePostInDb(Post post) {
        System.out.println("post " + post + " has been saved in db");
    }

    public void processAddPost(Post post, List<User> usersToNotify) {
        post.setTruncatedDate();
        validatePostMessage(post.getMsg());
        savePostInDb(post);
        MailSender.notifyAllUsers(usersToNotify, post.getMsg());
    }
}
