import java.util.Scanner; //importing required libraries
import java.util.ArrayList;
import java.util.List;
//Declaring a class to input student data
class Data {

int roll;
String name;
int m1,m2,m3,m4,m5;
double pointer;
char grade;
//method to input the details
void input() {
System.out.print("Enter name of Student: ");
Scanner b=new Scanner(System.in);
name=b.nextLine();
System.out.print("Enter the roll no. of Student: ");
roll=b.nextInt();
System.out.print("Enter the marks of Subject 1: ");
m1=b.nextInt();
System.out.print("Enter the marks of Subject 2: ");
m2=b.nextInt();
System.out.print("Enter the marks of Subject 3: ");
m3=b.nextInt();
System.out.print("Enter the marks of Subject 4: ");
m4=b.nextInt();
System.out.print("Enter the marks of Subject 5: ");
m5=b.nextInt();
}
// method to calculate pointer
double pointer() {
pointer=(m1+m2+m3+m4+m5)*0.02;
return pointer;
}
//method to calculate grade
void grade() {
if (pointer >= 9) grade = 'A';
else if (pointer >= 7) grade = 'B';
else if (pointer >= 5) grade = 'C';
else grade = 'D';
}
//method to display details of students with pointer>8
void show() {
if(pointer>=8) {

System.out.println("Name: " + name.toUpperCase());
System.out.println("Roll No: " + roll);
System.out.println("Marks: " + m1 + " " + m2 + " " + m3 +
" " + m4 + " " + m5);
System.out.println("Pointer: " + pointer);
System.out.println("Grade: " + grade);
}
}
}

public class Students_String {
public static void main(String[] args) {
System.out.print("Enter number of Student: ");
Scanner r=new Scanner(System.in);
int x=r.nextInt();
Data O[]=new Data[x]; //creating array of objects of class Data
for(int i=0;i<x;i++) {
System.out.println("Student "+(i+1));
O[i]=new Data(); //creating objects of class Data
O[i].input(); //calling methods using object
O[i].pointer();
O[i].grade();
System.out.println("");
}
//displaying details of topband students
System.out.println("Details of top band students:\n");
for(int i=0;i<x;i++) {
O[i].show();
System.out.println("");
}
//displaying names of topband students
System.out.println("Names of top band students:");
List<String> topstudent = new ArrayList<>(); //creating a list of topband students
for(int i=0;i<x;i++) {
if(O[i].pointer()>=8) {
    topstudent.add(O[i].name);
    System.out.print(topstudent);
}}
}
}