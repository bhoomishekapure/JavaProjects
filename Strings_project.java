import java.util.Scanner; //importing required libraries

class Wordcount{ //creating a class named Wordcount
    int wordnum=0;
    void Show(String a){ //declaring a method named Show in the class
        int n=a.length(); //storing the length of string in integer n
        for(int i=0;i<n;i++) {
            if(a.charAt(i)==' ') {
                wordnum++;
            }
        }
        System.out.println("Number of words= "+ (wordnum+1));
    }
}

class Charcount{ //creating a class named Charcount
    int charnum=0;
    void show(String L) { //declaring a method named show in the class
        int n=L.length(); //storing the length of string in integer n
        for(int i=0;i<n;i++) {
            if(L.charAt(i)!=' ' && L.charAt(i)>='a'&& L.charAt(i)<='z') {
                charnum++;
            }
        }
        System.out.println("Number of Letters= "+ charnum);
    }
}
class Vowelcount{
    int vowelnum=0;
    void show(String L) {
        int n=L.length();
        for(int i=0;i<n;i++) {
            if(L.charAt(i)=='a'||L.charAt(i)=='e'||L.charAt(i)=='i'||L.charAt(i)
                    =='o'||L.charAt(i)=='u') {
                vowelnum++;
            }

        }
        System.out.println("Number of Vowels= "+ vowelnum);
    }
}
class Consonantcount{
    int consonantnum=0;
    void show(String L) {
        int n=L.length();
        for(int i=0;i<n;i++) {
            if(L.charAt(i)!=' ' && L.charAt(i)>='a'&& L.charAt(i)<='z')
            {
                if(L.charAt(i)!='a'&& L.charAt(i)!='e'&&
                        L.charAt(i)!='i'&&L.charAt(i)!='o'&&L.charAt(i)!='u') {
                    consonantnum++;
                }
            }
        }
        System.out.println("Number of Consonants= "+consonantnum);
    }}
public class Strings_project {
    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner s =new Scanner(System.in);
        String a=s.nextLine(); // input string form user
        String L=a.toLowerCase(); //converting string to lowercase

//creating objects for each class
        Charcount C=new Charcount();
        Wordcount W=new Wordcount();
        Vowelcount V=new Vowelcount();
        Consonantcount c=new Consonantcount();

        int option;
        do {
            System.out.println("Enter Choice:");
            System.out.println("1.Wordcount\n2.Lettercount\n3.VowelCount\n4.Consonants Count\n5.Exit");
                    Scanner choice=new Scanner(System.in);
            option=choice.nextInt();
            switch(option) {
                case 1:
                    W.Show(a); //calling method of class Wordcount using object W
                    break;
                case 2:

                    C.show(L); //calling method of class Charcount using object C
                    break;
                case 3:
                    V.show(L);
                    break;
                case 4:
                    c.show(L);
                    break;
                case 5:
                    System.out.println("Exiting.");
            }
            System.out.println();
        }
        while(option!=5);

    }
}