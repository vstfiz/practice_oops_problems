import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling{
    private int age;
    private String name;
    public ExceptionHandling(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void display() {
        System.out.println("Name of the student is: "+name);
        System.out.println("Age of the student is: "+age);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // For InputMismatchException
        try {
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            ExceptionHandling exceptionHandling = new ExceptionHandling(name, age);
            exceptionHandling.display();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter proper values for name and age.");
        }
        // For NumberFormatException
        try{
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            ExceptionHandling exceptionHandling1 = new ExceptionHandling(name, age);
            System.out.println(Integer.parseInt(name));
        }
        catch (NumberFormatException e){
            System.out.println("Please Do Not try to cast name to number");
        }
        // For AirthmeticException
        try{
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            ExceptionHandling exceptionHandling1 = new ExceptionHandling(name, age);
            System.out.println(age/0);
        }
        catch (ArithmeticException e){
            System.out.println("Please Do Not divide the number by zero");
        }
    }
}