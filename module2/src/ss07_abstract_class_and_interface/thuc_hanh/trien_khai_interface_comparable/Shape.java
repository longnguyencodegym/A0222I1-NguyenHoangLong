package ss07_abstract_class_and_interface.thuc_hanh.trien_khai_interface_comparable;

public class Shape {
    private String colour="Green";
    private Boolean filled=true;

    public Shape() {
    }

    public Shape(String colour, Boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String isFilled() {
        return filled ? "filled" : "Not Filled" ;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "A Shape with color of "+colour+" and "+isFilled();
    }

}
