import java.util.Scanner; //importing required libraries
class Circle {
    double n; double a; double p;
    //declaring parameterized constructor with parameter n
    Circle(double n){
        this.n=n;
    }
    //declaring and defining method to calculate area
    double area() {
        a=3.14*n*n;
        return a;
    }
//declaring and defining method to calculate circumference

    double circumference() {
        p=3.14*2*n;
        return p;
    }
}
//inside the main class
public class Constructors {
    public static void main(String[] args) {
        double r1; double r2; int choice;
//inputting values of radius of circle 1 and 2
        System.out.println("Enter radius of the first circle:");
//creating object named radius of Scanner class
        Scanner radius=new Scanner(System.in);
        r1=radius.nextDouble();
        System.out.println("Enter radius of the second circle:");
        r2=radius.nextDouble();
//Creating 2 objects of Circle class
        Circle C1=new Circle(r1);
        Circle C2=new Circle(r2);
//Calling methods using objects
        double a1=C1.area();
        double a2=C2.area();
        double p1=C1.circumference();
        double p2=C2.circumference();
//input choice from user
        System.out.println("Compare with respect to :\n1.Area\n2.Circumference");
        choice=radius.nextInt();
//initialising switch case for the values of variable choice
        switch(choice) {
            case 1:
                if(a1>a2) {

                    System.out.println("Circle 1 has a greater area");
                    System.out.println("Area of circle 1 = "+a1);
                }
                else {
                    System.out.println("Circle 2 has a greater area");
                    System.out.println("Area of circle 2 = "+a2);
                }
                break;
            case 2:
                if(p1>p2) {
                    System.out.println("Circle 1 has a greater circumference");
                            System.out.println("Circumference of circle 1 = "+p1);
                }
                else {
                    System.out.println("Circle 2 has a greater circumference");
                            System.out.println("Circumference of circle 2 = "+p2);
                }
                break;
        }}}