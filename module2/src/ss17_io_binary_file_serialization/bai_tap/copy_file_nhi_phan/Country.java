package ss17_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.Serializable;

public class Country implements Serializable {
  int id;
  String code;
  String name;

  public Country() {}

  public Country(int id, String code, String name) {
    this.id = id;
    this.code = code;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toData(String delimeter) {
    return id + delimeter + code + delimeter + name;
  }

  @Override
  public String toString() {
    return "Country{" + "id=" + id + ", code='" + code + '\'' + ", name='" + name + '\'' + '}';
  }
}