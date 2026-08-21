import java.util.Scanner;

abstract class  shape{
    abstract void calculate_area();

}
class rectangle extends shape{
    double length;
    double width;
    void calculate_area(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length");
        length = scn.nextDouble();
        System.out.println("Enter the width ");
        width = scn.nextDouble();
        double area = length*width;
        System.out.println("Area of rectange will be : " + area );

    }
}

class circle extends shape{
    double radius;
    void calculate_area(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = scn.nextDouble();

        double area = 3.14*radius*radius;
        System.out.println("Area of circle will be " + area);
    }
}
class area{
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.calculate_area();
        rectangle r1 = new rectangle();
        r1.calculate_area();
    }
}