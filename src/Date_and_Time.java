import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_and_Time {

    private String datetime;

    public Date_and_Time(){
        this.datetime = "";
    }

    public void setCurrentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        setDatetime(dtf.format(now));
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDatetime() {
        return this.datetime;
    }
}
