package ss05_access_modifier_static_method_static_property.bai_tap.access_modifier_2;

public class Student {
    private String name="John";
    private String classes="C02";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }
}
