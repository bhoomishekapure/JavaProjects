import java.util.Scanner;
//creating Mydate class
class Mydate{
    int date,month,year;
    Scanner sc = new Scanner(System.in); //creating object named sc in Scanner class
    //declaring a method named display
    void display() {
        System.out.print("Enter Date:");
        date=sc.nextInt();
        System.out.print("Enter Month:");
        month=sc.nextInt();
        System.out.print("Enter Year:");
        year=sc.nextInt();
        if(date>=1&&date<=31&&month>=1&&month<=12) {
            System.out.println("You Entered the date: "+ date +"/"+month+"/"+year);
        }
        else {
            System.out.println("Invalid input! Try again.");
        }
    }
}
public class dates {
    public static void main(String[] args) {

        Mydate o1= new Mydate(); // creating objects of class Mydate
        Mydate o2= new Mydate();
        Mydate o3= new Mydate();
        Mydate o4= new Mydate();
        Mydate o5= new Mydate();
        o1.display(); //calling display function of object
        o2.display();
        o3.display();
        o4.display();
        o5.display();
    }
}
