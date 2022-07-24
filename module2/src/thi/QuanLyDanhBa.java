package thi;





import ss16_io_text_file.bai_tap.quan_ly_dien_thoai.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanSu {
  Scanner sc=new Scanner(System.in);
  private List<DanhBa> danhSachDanhBa;
  private FileHelper fileHelper = new FileHelper();
  private static final String PATH = "src/thi/codegym.csv";

  public QuanLyNhanSu() {
    danhSachDanhBa = mapToPhones();
  }

  public void themMoiNhanSu(DanhBa danhBa) {
    danhSachDanhBa.add(danhBa);
    fileHelper.write(PATH, danhSachDanhBa, false);
  }

  public List<DanhBa> findAll() {
    Collections.sort(danhSachDanhBa);
    return danhSachDanhBa;
  }

  public void delete(String soDienThoai)  {
    boolean flag=false;

    for (int i = 0; i < danhSachDanhBa.size(); i++) {
      if (danhSachDanhBa.get(i).getSoDienThoai().equals(soDienThoai) ) {
        System.out.println("Ban chac chan muon xoa?");
        System.out.println("1.Chac chan  2.Khong muon xoa");
        int choice=Menu.getChoice();
        if (choice==2){
          return;
        }else if (choice==1){
          danhSachDanhBa.remove(i);
          fileHelper.write(PATH, danhSachDanhBa, false);
          System.out.println("Xoa thanh cong");
          return;
        }else {
          System.out.println("Khong co lua chon nay");
          return;
        }

      }
      flag=true;
    }
    if (flag){
      System.out.println("So nay khong ton tai");
    }

  }

  

  private List<DanhBa> mapToPhones() {
    List<DanhBa> danhSachTraVe = new ArrayList<>();

    List<String> lines = fileHelper.read(PATH);

    for (int i = 0; i < lines.size(); i++) {
      String[] tmp = lines.get(i).split(",");
     ;
      String hoVaTen = tmp[0];
      String soDienThoai = tmp[1];

      String diaChi = tmp[2];
      String email=tmp[3];
      String faceBook=tmp[4];



        DanhBa danhBa =
            new DanhBa( hoVaTen, soDienThoai, diaChi,email, faceBook);
        danhSachTraVe.add(danhBa);

    }

    return danhSachTraVe;
  }
  public List<DanhBa> search(String name) {
    List<DanhBa> result = new ArrayList<>();

    for (int i = 0; i < danhSachDanhBa.size(); i++) {
      if (danhSachDanhBa.get(i).getHoVaTen().contains(name)) {
        result.add(danhSachDanhBa.get(i));
      }
    }

    return result;
  }
}
