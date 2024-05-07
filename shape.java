import java.util.Scanner;
class Shape{
    public double area() {
        return 0.0;
    }
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
        public double circumstance(){
        return 2*Math.PI*radius;
    }
}


class Main{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of radius");
        double radius=s.nextDouble();
        Circle circle=new Circle(radius);

        double area=Math.PI*radius*radius;
        double circumstance=2*Math.PI*radius;

        System.out.println(area);
        System.out.println(circumstance);
    }
}