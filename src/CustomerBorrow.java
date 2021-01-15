import java.util.ArrayList;
import java.util.List;

public class CustomerBorrow extends Person{
    private int timeBorrow;
    private double loan;
    private String purpose;
    List<CustomerBorrow> customerBorrowList = new ArrayList<>();

    public CustomerBorrow(int timeBorrow, double loan, String purpose) {
        this.timeBorrow = timeBorrow;
        this.loan = loan;
        this.purpose = purpose;
    }

    public CustomerBorrow(String name, String id, String phoneNumber, String address, String email, int timeBorrow, double loan, String purpose) {
        super(name, id, phoneNumber, address, email);
        this.timeBorrow = timeBorrow;
        this.loan = loan;
        this.purpose = purpose;
    }

    public int getTimeBorrow() {
        return timeBorrow;
    }

    public void setTimeBorrow(int timeBorrow) {
        this.timeBorrow = timeBorrow;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
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
                "timeBorrow=" + timeBorrow +
                ", loan=" + loan +
                ", purpose='" + purpose + '\'' +
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