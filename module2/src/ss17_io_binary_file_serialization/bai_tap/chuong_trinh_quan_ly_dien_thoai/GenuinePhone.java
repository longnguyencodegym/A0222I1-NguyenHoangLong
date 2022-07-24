package ss17_io_binary_file_serialization.bai_tap.chuong_trinh_quan_ly_dien_thoai;

public class GenunePhone extends Phone{
    int warrantyPeriod;
    int warrantyNumber;

    public GenunePhone() {
    }

    public GenunePhone(int warrantyPeriod, int warrantyNumber) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyNumber = warrantyNumber;
    }

    public GenunePhone(int id, String name, double price, String company, int warrantyPeriod, int warrantyNumber) {
        super(id, name, price, company);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyNumber = warrantyNumber;
    }
}
