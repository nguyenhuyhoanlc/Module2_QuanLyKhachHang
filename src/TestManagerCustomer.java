import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestManagerCustomer {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
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
                    showMenuCustomerBorrow();
                    break;
                case 2:
                    showMenuCustomerSaving();
                    break;
                case 3:
                    break;
            }
        }while (choose != 0);
    }

    public static void showMenuCustomerBorrow(){
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
                    System.out.println("Nhập tên khách hàng vay:");
                    String name = sc.nextLine();
                    System.out.println("Nhập số CMT khách hàng vay :");
                    String id = sc1.nextLine();
                    System.out.println("Nhập số điện thoại khách hàng :");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Nhập địa chỉ khách hàng :");
                    String address = sc1.nextLine();
                    System.out.println("Nhập email khách hàng :");
                    String email = sc.nextLine();
                    System.out.println("Nhập thời gian vay ( đơn vị : tháng ) :");
                    String timeBorrow = sc1.nextLine();
                    System.out.println("Nhập số tiền vay ( đơn vị : triệu đồng ) :");
                    String loan = sc.nextLine();
                    System.out.println("Nhập mục đích vay :");
                    String purpose = sc1.nextLine();
                    CustomerBorrow customerBorrow1 = new CustomerBorrow(name,id,phoneNumber,address,email,timeBorrow,loan,purpose);
                    manager.addNew(customerBorrow1);
                    break;
                case 2:
                    System.out.println("Nhập tên khách hàng cần tìm kiếm :");
                    String name3 = sc.nextLine();
                    manager.search(name3);
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

    public static void showMenuCustomerSaving(){
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
                System.out.println("Nhập tên khách hàng gửi tiết kiệm:");
                String name = sc.nextLine();
                System.out.println("Nhập số CMT khách hàng tiết kiệm :");
                String id = sc1.nextLine();
                System.out.println("Nhập số điện thoại khách hàng :");
                String phoneNumber = sc.nextLine();
                System.out.println("Nhập địa chỉ khách hàng :");
                String address = sc1.nextLine();
                System.out.println("Nhập email khách hàng :");
                String email = sc.nextLine();
                System.out.println("Nhập kì hạn ( Đơn vị: tháng )");
                String timeSending = sc1.nextLine();
                System.out.println("Nhập số tiền gửi tiết kiệm");
                String deposits = sc.nextLine();
                CustomerSaving customerSaving1 = new CustomerSaving(name,id,phoneNumber,address,email,timeSending,deposits);
                manager.addNew(customerSaving1);
                break;
            case 2:
                System.out.println("Nhập tên khách hàng cần tìm kiếm :");
                String name3 = sc.nextLine();
                manager.search(name3);
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
