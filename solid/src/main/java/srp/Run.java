package srp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        Post post = new Post();
        User user = new User("asd");
        UserRepository repo = new UserRepository();

        repo.addPost(post);

    }
}
