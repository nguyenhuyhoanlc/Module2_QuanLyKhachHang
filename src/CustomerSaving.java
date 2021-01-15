public class CustomerSaving extends Person{
    private String timeSending;
    private double deposits;

    public CustomerSaving(String timeSending, double deposits) {
        this.timeSending = timeSending;
        this.deposits = deposits;
    }

    public CustomerSaving(String name, String id, String phoneNumber, String address, String email, String timeSending, double deposits) {
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

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    @Override
    public String toString() {
        return "CustomerSaving{" +
                "timeSending='" + timeSending + '\'' +
                ", deposits=" + deposits +
                '}';
    }

    @Override
    public void addNew() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void seach() {

    }
}