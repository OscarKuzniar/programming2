package srp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Post {

    private String msg;

    private String author;

    private String date;

    public Post(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public String getAuthor() {
        return author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTruncatedDate() {
        LocalDateTime createdAt = LocalDateTime.now();
        createdAt = createdAt.truncatedTo(ChronoUnit.MINUTES);
        this.setDate(createdAt.toString());
    }
}
