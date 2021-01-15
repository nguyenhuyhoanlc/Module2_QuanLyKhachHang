import java.util.ArrayList;
import java.util.List;

public class CustomerSaving extends Person{
    private String timeSending;
    private String deposits;

    public CustomerSaving(String timeSending, String deposits) {
        this.timeSending = timeSending;
        this.deposits = deposits;
    }

    public CustomerSaving(String name, String id, String phoneNumber, String address, String email, String timeSending, String deposits) {
        super(name, id, phoneNumber, address, email);
        this.timeSending = timeSending;
        this.deposits = deposits;
    }

    public String getTimeSending() {
        return timeSending;
    }

    public void setTimeSending(String timeSending) {
        this.timeSending = timeSending;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    @Override
    public String toString() {
        return "CustomerSaving{" +
                super.toString() +
                "timeSending='" + timeSending + '\'' +
                ", deposits=" + deposits +
                '}';
    }

}
