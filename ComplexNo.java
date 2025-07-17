import java.util.Scanner;
//import the required libraries
class Operations{
    float i,r;
    Operations(){
    }
    Operations(float r,float i)
//parameterized constructor
    {
        this.r=r;
        this.i=i;
    }
    //performing operations on the complex nos.
    void add(Operations o1,Operations o2) {
        System.out.println("Addition= "+(o1.r+o2.r)+(" + ")+(o1.i+o2.i)+("i"));
    }
    void sub(Operations o1,Operations o2) {
        System.out.println("Subtraction= "+(o1.r-o2.r)+(" + ")+(o1.i-o2.i)+("i"));
    }
    void multi(Operations o1,Operations o2) {
        System.out.println("Multiplication= "+((o1.r*o2.r)-
                (o1.i*o2.i))+(" + ")+((o1.r*o2.i)+(o1.i*o2.r))+("i"));
    }
    void div(Operations o1,Operations o2) {
        float D=(o2.r*o2.r)-(o2.i*o2.i);
        System.out.println("Division="+(((o1.r*o2.r)+(o1.i*o2.r))/D)+(" + ")+(((o1.r*o2.i)+(o1.i*o2.i))/D)+("i"));
    }
}
public class ComplexNo {
    public static void main(String[] args) {
        System.out.print("Enter Real part of number 1: ");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.print("Enter Imaginary part of number 1: ");
        float b=sc.nextFloat();

        Operations o1=new Operations(a,b); //creating object
        System.out.print("Enter Real part of number 2: ");
        float c=sc.nextFloat();
        System.out.print("Enter Imaginary part of number 2: ");
        float d=sc.nextFloat();
        Operations o2=new Operations(c,d);
        Operations call=new Operations();
        int choice;
        do {
            System.out.println("Enter Choice:");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
                    choice=sc.nextInt();
            System.out.println("");
//initializing switch case
            switch(choice) {
                case 1:
                    call.add(o1, o2); //calling method and passing objects
                    System.out.println("");
                    break;
                case 2:
                    call.sub(o1, o2);
                    System.out.println("");
                    break;
                case 3:
                    call.multi(o1, o2);
                    System.out.println("");
                    break;
                case 4:
                    call.div(o1, o2);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
            }
        }while(choice!=5);
    }
}