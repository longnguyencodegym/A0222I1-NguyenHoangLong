package ss04_class_and_object.bai_tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColour("yellow");
        fan1.isOn(true);
        System.out.println(fan1.toSring());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setSpeed(5);
        fan2.setColour("blue");
        fan2.isOn(false);
        System.out.println(fan2.toSring());

    }


}
