package ss16_io_text_file.bai_tap.read_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
  public void writeFile(List<String> list,String resultPath) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultPath, false))) {
      for (String element : list) {
        bw.write(element);
      }
      System.out.println("Done!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<String> readFile(String filePath) {
    List<String> strings = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line = "";
      while ((line = br.readLine()) != null) {
        if (line.isEmpty()){
          continue;
        }
        strings.add(line);
        strings.add("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return strings;
  }
}
