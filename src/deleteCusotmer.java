public class deleteCusotmer implements Command{
    private CustomerBorrow customerBorrow;
    private CustomerSaving customerSaving;

    public deleteCusotmer(CustomerBorrow customerBorrow, CustomerSaving customerSaving) {
        this.customerBorrow = customerBorrow;
        this.customerSaving = customerSaving;
    }

    @Override
    public void exeten() {
        customerBorrow.delete();
        customerSaving.delete();
    }
}
