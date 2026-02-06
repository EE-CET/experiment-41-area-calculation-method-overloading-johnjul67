import java.util.Scanner;
public class AreaCalculator 
{
    double calculateArea(float radius)
    {
        return Math.PI*radius*radius;
    }

    double calculateArea(float length, float breadth)
    {
        return length*breadth;
    }

    double calculateArea(double base, double height)
    {
        return 0.5*base*height;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float radius, length, breadth;
        double base, height;
        radius=sc.nextFloat();
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        base=sc.nextDouble();
        height=sc.nextDouble();
        AreaCalculator ob = new AreaCalculator();
        System.out.printf("%.2f\n", ob.calculateArea(radius));
        System.out.printf("%.2f\n", ob.calculateArea(length, breadth));
        System.out.printf("%.2f\n", ob.calculateArea(base, height));
    }
}
