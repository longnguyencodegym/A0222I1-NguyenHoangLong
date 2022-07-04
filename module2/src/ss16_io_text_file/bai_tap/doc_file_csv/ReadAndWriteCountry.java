package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteCountry {
  public static final String DELIMITER = ";";

  public void writeToFile(List<Country> countries) {
    try (BufferedWriter bufferedWriter =
        new BufferedWriter(
            new FileWriter(
                "src/ss16_io_text_file/bai_tap/doc_file_csv/result.txt"))) {
      for (Country ct : countries) {
        bufferedWriter.write(ct.toData(DELIMITER));
        bufferedWriter.write("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<Country> getCountryFromFile(String filePath) {
    List<Country> countries = new ArrayList<>();
    try  {
      BufferedReader reader = new BufferedReader(new FileReader(filePath));

      String line;
      while ((line = reader.readLine()) != null) {

        if(!line.trim().isEmpty()){
          String[] result = line.split(DELIMITER);
          String sid = result[0];
          int id = Integer.parseInt(sid);

          countries.add(new Country(Integer.parseInt(result[0]), result[1], result[2]));
        }
      }

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return countries;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input file path to read:");
    String filePath = sc.nextLine();

    ReadAndWriteCountry readAndWriteCountry = new ReadAndWriteCountry();

    List<Country> list = readAndWriteCountry.getCountryFromFile(filePath);
    System.out.println("Done!");
    readAndWriteCountry.writeToFile(list);
  }
}
