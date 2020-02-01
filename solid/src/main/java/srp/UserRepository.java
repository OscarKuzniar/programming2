package srp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static srp.Validator.*;

public class UserRepository {

    List<User> findAllUsers() {
        return List.of(new User("Zygfryd"), new User("Zenon"));
    }

}
