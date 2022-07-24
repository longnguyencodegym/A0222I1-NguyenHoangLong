package thi;

public abstract class NhanSu implements Comparable<NhanSu>{
    String maDinhDanh;
    String hoVaTen;
    String ngaySinh;
    String diaChi;
    String soDienThoai;

    public NhanSu() {
    }

    public NhanSu(String maDinhDanh, String hoVaTen, String ngaySinh, String diaChi, String soDienThoai) {
        this.maDinhDanh = maDinhDanh;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaDinhDanh() {
        return maDinhDanh;
    }

    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "NhanSu{" +
                "maDinhDanh=" + maDinhDanh +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }

    public abstract String toData();

    @Override
    public int compareTo(NhanSu nhanSu) {
        return this.hoVaTen.compareTo(nhanSu.hoVaTen);
    }
}
