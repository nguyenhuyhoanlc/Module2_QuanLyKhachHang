public class addNewCustomer implements Command{
        private CustomerBorrow customerBorrow;
        private CustomerSaving customerSaving;

    public addNewCustomer(CustomerBorrow customerBorrow, CustomerSaving customerSaving) {
        this.customerBorrow = customerBorrow;
        this.customerSaving = customerSaving;
    }

    @Override
    public void exeten() {
        customerBorrow.addNew();
        customerSaving.addNew();
    }
}
