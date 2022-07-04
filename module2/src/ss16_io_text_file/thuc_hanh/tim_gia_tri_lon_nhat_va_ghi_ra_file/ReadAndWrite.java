package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
  public List<Integer> readFile(String path) {
    List<Integer> numbers = new ArrayList<>();
    File file = new File(path);
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      if (!file.exists()) {
        throw new FileNotFoundException();
      }

      String line = "";
      while ((line = br.readLine()) != null) {
        numbers.add(Integer.parseInt(line));
        if (line.isEmpty()) {
          continue;
        }
      }
    } catch (Exception e) {
      System.err.println("File not exist or fail contend!");
    }
    return numbers;
  }

  public void writeFile(String path, int max) {
    File file = new File(path);
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false), max)) {
      bw.write("Max value: " + max);
      System.out.println("Done!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
