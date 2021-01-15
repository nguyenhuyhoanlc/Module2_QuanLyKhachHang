public class CustomerBorrow extends Person{
    private String timeBorrow;
    private String loan;
    private String purpose;

    public CustomerBorrow(String timeBorrow, String loan, String purpose) {
        this.timeBorrow = timeBorrow;
        this.loan = loan;
        this.purpose = purpose;
    }

    public CustomerBorrow(String name, String id, String phoneNumber, String address, String email, String timeBorrow, String loan, String purpose) {
        super(name, id, phoneNumber, address, email);
        this.timeBorrow = timeBorrow;
        this.loan = loan;
        this.purpose = purpose;
    }

    public String getTimeBorrow() {
        return timeBorrow;
    }

    public void setTimeBorrow(String timeBorrow) {
        this.timeBorrow = timeBorrow;
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "CustomerBorrow{" +
                super.toString() +
                "timeBorrow=" + timeBorrow +
                ", loan=" + loan +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
