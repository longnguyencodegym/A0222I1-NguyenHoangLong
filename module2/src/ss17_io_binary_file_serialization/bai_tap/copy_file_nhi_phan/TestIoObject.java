package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestIoObject {
    static List<Country> outputCountries=new ArrayList<>();
    static String inputLink="src/ss17_io_binary_file_serialization/bai_tap/copy_file_nhi_phan/source.bin";
    static String outputLink="src/ss17_io_binary_file_serialization/bai_tap/copy_file_nhi_phan/target.bin";
  public static void main(String[] args) {
    List<Country> countries=new ArrayList<>();
    countries.add(new Country(1,"84","Viet Nam"));
    countries.add(new Country(2,"85","Laos"));
    IoObject.writeObjectFile(countries,inputLink);
    List<Country> tempCountries=IoObject.readObjectFile(inputLink);
    IoObject.writeObjectFile(tempCountries,outputLink);
    File outputFile=new File(outputLink);
    outputCountries=IoObject.readObjectFile(outputLink);
    for (Country country :outputCountries ) {
      System.out.println(country);
    }
    System.out.println("Byte: "+outputFile.length());
    }

  }

