import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestManagerCustomer {
    static Scanner sc = new Scanner(System.in);
    static int choose = 0;
    static Manager manager = new Manager();
    static List<Person> personList = new ArrayList<>();
    static CustomerBorrow customerBorrow;
    static CustomerSaving customerSaving;
    public static void main(String[] args) {


        System.out.println("------Lựa chọn đối tượng khách hàng------");
        System.out.println("1. Khách hàng vay");
        System.out.println("2. Khách hàng gửi tiết kiệm");
        System.out.println("3. Thoát chương trình");
        System.out.println("Mời nhập sự lựa chọn :");
        do {
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }while (choose != 0);
    }

    public void showMenuCustomerBorrow(){
        do {
            System.out.println("------ Khách hàng vay ------");
            System.out.println("1. Thêm mới khách hàng vay");
            System.out.println("2. Tìm kiếm khách hàng vay");
            System.out.println("3. Sửa thông tin khách hàng vay");
            System.out.println("4. Hiển thị thông tin toàn bộ khách hàng vay");
            System.out.println("5. Xoá thông tin khách hàng đã tất toán khoản vay");
            System.out.println("   Mời nhập sự lựa chọn :");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    manager.addNew(customerBorrow);
                    break;
                case 2:
                    System.out.println("Nhập tên khách hàng cần tìm kiếm :");
                    String name = sc.nextLine();
                    manager.search(name);
                    break;
                case 3:
                    System.out.println("Nhập tên khách hàng cần thay đổi thông tin :");
                    String name1 = sc.nextLine();
                    manager.edit(name1,customerBorrow);
                    break;
                case 4:
                    manager.showAll();
                    break;
                case 5:
                    System.out.println("Nhập tên khách hàng đã tất toán khoản vay :");
                    String name2 =sc.nextLine();
                    manager.delete(name2);
                    break;
            }
        }while (choose != 0);
    }

    public void showMenuCustomerSaving(){
        System.out.println("------ Khách hàng gửi tiết kiệm ------");
        System.out.println("1. Thêm mới khách hàng gửi tiết kiệm");
        System.out.println("2. Tìm kiếm thông tin khách hàng gửi tiết kiệm");
        System.out.println("3. Sửa chữa thông tin khách hàng gửi tiết kiệm");
        System.out.println("4. Hiển thị toàn bộ thông tin khách hàng gửi tiết kiệm");
        System.out.println("5. Xoá thông tin khách hàng đã tất toán số tiết kiệm");
        System.out.println("   Mời nhập sự lựa chọn :");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                manager.addNew(customerSaving);
                break;
            case 2:
                System.out.println("Nhập tên khách hàng cần tìm kiếm :");
                String name = sc.nextLine();
                manager.search(name);
                break;
            case 3:
                System.out.println("Nhập tên khách hàng cần thay đổi thông tin :");
                String name1 = sc.nextLine();
                manager.edit(name1,customerSaving);
                break;
            case 4:
                manager.showAll();
                break;
            case 5:
                System.out.println("Nhập tên khách hàng đã tất toán sổ tiết kiệm :");
                String name2 = sc.nextLine();
                manager.delete(name2);
        }
    }


}
