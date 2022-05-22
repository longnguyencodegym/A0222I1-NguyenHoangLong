package ss04_class_and_object.bai_tap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String colour = "blue";

    public Fan() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void isOn(boolean status) {
        this.on = status;
    }

    public boolean getStatus() {
        return this.on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
    public String toSring(){
        if(this.getStatus()) {
            return "Fan is On,speed:"+this.getSpeed()+",colour:"+this.getColour()+",radius:"+this.getRadius();
        }else {
            return "Fan is Off,colour:"+this.getColour()+",radius:"+this.getRadius();
        }
    }
}
