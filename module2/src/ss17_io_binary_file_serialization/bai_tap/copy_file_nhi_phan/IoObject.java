package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IoObject{
    public static void writeObjectFile(List<Country> countries, String path) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(countries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Country> readObjectFile(String path) {

        List<Country> countries = new ArrayList<>();
        File file = new File(path);
        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {

                countries= (List<Country>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return countries;
    }
}
