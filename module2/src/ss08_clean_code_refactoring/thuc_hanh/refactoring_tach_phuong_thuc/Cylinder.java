package ss08_clean_code_refactoring.thuc_hanh.refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea=getBaseArea(radius);
        double getPerimeter=getPerimeter(radius);
        return  getPerimeter * height + 2 * baseArea;

    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }


}
