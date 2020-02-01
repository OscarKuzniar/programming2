package srp;

import java.time.LocalDateTime;

public class Validator {

    public static void validatePostMessage(String msg) {
        if (msg == null || msg.isEmpty()) {
            throw new EmptyMessageException();
        }
    }
}
