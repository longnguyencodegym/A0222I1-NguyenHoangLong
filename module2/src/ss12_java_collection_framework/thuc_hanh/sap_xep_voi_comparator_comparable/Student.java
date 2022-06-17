package ss12_java_collection_framework.thuc_hanh.sap_xep_voi_comparator_comparable;

public class Student implements Comparable<Student> {
    public String name;
    public int age;
    public String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.getAge()==student.getAge()){
            return this.getName().compareTo(student.getName());
        }
        return this.getAge()-student.getAge();
    }
}
