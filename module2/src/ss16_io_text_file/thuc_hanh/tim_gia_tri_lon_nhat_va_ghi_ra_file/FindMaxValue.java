package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
  public static int findMax(List<Integer> list) {
    int max = list.get(0);
    for (int element : list) {
      if (max < element) {
        max = element;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    List<Integer> numbers =
        readAndWrite.readFile(
            "/Users/HoangLong/CodeGym2022/A0222I1-NguyenHoangLong/module2/src/ss16_io_text_file/thuc_hanh/tim_gia_tri_lon_nhat_va_ghi_ra_file/MyText.txt");
    int max = findMax(numbers);
    readAndWrite.writeFile(
        "/Users/HoangLong/CodeGym2022/A0222I1-NguyenHoangLong/module2/src/ss16_io_text_file/thuc_hanh/tim_gia_tri_lon_nhat_va_ghi_ra_file/Result.txt",
        max);
  }
}
