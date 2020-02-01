package srp;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        Post post = new Post("Example message");
        UserRepository userRepository = new UserRepository();
        PostRepository postRepository = new PostRepository();
        List<User> userList = userRepository.findAllUsers();

         postRepository.processAddPost(post, userList);
    }
}
