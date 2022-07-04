package ss16_io_text_file.bai_tap.read_and_write_file;



import java.util.List;
import java.util.Scanner;

public class TestReadAndWrite {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input link to read file: ");
    String path=sc.nextLine();
    ReadAndWriteFile readAndWrite = new ReadAndWriteFile();
    List<String> list = readAndWrite.readFile(path);
    readAndWrite.writeFile(list,"/Users/HoangLong/CodeGym2022/A0222I1-NguyenHoangLong/module2/src/ss16_io_text_file/bai_tap/read_and_write_file/Result.txt");
  }
}
