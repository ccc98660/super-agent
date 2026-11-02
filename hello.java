import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class hello {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current time: " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));
    }
}
