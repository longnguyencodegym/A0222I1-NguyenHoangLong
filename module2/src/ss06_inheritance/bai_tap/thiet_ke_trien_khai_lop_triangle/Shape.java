package ss06_inheritance.bai_tap.thiet_ke_trien_khai_lop_triangle;

public class Shape {
  private String colour = "Green";
  private Boolean filled = true;

  public Shape() {}

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
    return (getColour().equals("")) ? "filled" : "Not Filled";
  }

  public void setFilled(Boolean filled) {
    this.filled = filled;
  }

  public String toString() {
    return "A Shape with color of " + colour + " and " + isFilled();
  }
}
