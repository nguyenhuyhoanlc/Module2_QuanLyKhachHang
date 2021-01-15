public class searchCustomer implements Command{
    private CustomerBorrow customerBorrow;
    private CustomerSaving customerSaving;

    public searchCustomer(CustomerBorrow customerBorrow, CustomerSaving customerSaving) {
        this.customerBorrow = customerBorrow;
        this.customerSaving = customerSaving;
    }

    @Override
    public void exeten() {
        customerBorrow.seach();
        customerSaving.seach();
    }
}
