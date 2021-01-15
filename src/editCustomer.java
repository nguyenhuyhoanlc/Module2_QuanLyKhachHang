public class editCustomer implements Command{
    private CustomerBorrow customerBorrow;
    private CustomerSaving customerSaving;

    public editCustomer(CustomerBorrow customerBorrow, CustomerSaving customerSaving) {
        this.customerBorrow = customerBorrow;
        this.customerSaving = customerSaving;
    }

    @Override
    public void exeten() {
        customerBorrow.edit();
        customerSaving.edit();
    }
}
