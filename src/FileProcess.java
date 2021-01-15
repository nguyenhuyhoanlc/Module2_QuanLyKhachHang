import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcess {
    public static final String FILEPATH = "CUSTOMERBORROW.dat";
    public static final String FILEPATH1 = "CUSTOMERSAVING.dat";

    public static void writeObjectToFile(List<Object> objectList,String filepath){
        try {
            FileOutputStream KhachHang = new FileOutputStream(filepath);
            ObjectOutputStream QuanLyKhachHang = new ObjectOutputStream(KhachHang);
            QuanLyKhachHang.writeObject(objectList);
//            QuanLyKhachHang.flush();
            QuanLyKhachHang.close();
            KhachHang.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> readObjectFromFile(String filepath){
        List<Object> objectList = new ArrayList<>();
        try {
            FileInputStream KhachHang = new FileInputStream(filepath);
            ObjectInputStream QuanLyKhachHang = new ObjectInputStream(KhachHang);
            objectList = (List<Object>) QuanLyKhachHang.readObject();
            QuanLyKhachHang.close();
            KhachHang.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objectList;
    }
}
