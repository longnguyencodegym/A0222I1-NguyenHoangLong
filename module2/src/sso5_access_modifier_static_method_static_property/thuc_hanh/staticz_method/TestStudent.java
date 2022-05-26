package sso5_access_modifier_static_method_static_property.thuc_hanh.staticz_method;

public class TestStudent {
  public static void main(String[] args) {
    Student.change();
    Student s1 = new Student(1, "Long");
    Student s2 = new Student(2, "Vuong");
    Student s3 = new Student(3, "Duyet");
    s1.display();
    s2.display();
    s3.display();
  }
}
