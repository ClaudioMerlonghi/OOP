import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. System.out.println("My name is Claudio Merlonghi");
        //2. System.out.println("Hello World!");
        //System.out.println("(And all the people of the world");
        //3.int year=365;
        //int hour=year*24;
        //int min=hour*60;
        //int sec=min*60;
        //System.out.println(sec);

        //4.Scanner sc = new Scanner(System.in);
        //int a= sc.nextInt();
        //int b= sc.nextInt();
        //System.out.println(a+b);

        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //if(a%2==0){
        //  System.out.println("Positive");
        //}
        //else{
        //System.out.println("Negative");
        //}
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            System.out.println(a);
        }
        else if(a>b){
            System.out.println(b);
        }
        else{
            System.out.println("they are equal");
        }







        }
    }
