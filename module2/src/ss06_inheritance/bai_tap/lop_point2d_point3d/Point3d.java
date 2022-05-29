package ss06_inheritance.bai_tap.lop_point2d_point3d;

public class Point3d extends Point2d {
  private float z = 0.0f;

  public Point3d() {}

  public Point3d(float z) {
    this.z = z;
  }

  public Point3d(float x, float y, float z) {
    super(x,y);
    this.z = z;
  }

  public float getZ() {
    return z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public float[] getXYZ() {
    return new float[] {getX(), getY(), z};
  }

  @Override
  public String toString() {
    return "Location: (" + getX() + "," + getY() + "," + z + ")";
  }
}
