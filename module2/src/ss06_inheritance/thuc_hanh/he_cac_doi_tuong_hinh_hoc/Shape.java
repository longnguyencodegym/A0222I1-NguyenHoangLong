package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

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
