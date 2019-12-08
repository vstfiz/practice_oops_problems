import java.util.Scanner;

public class Student {
    private String name;
    private double percentage;
    public Student(String name,double percentage){
        this.name = name;
        this.percentage = percentage;
        if (Double.compare(percentage, Double.parseDouble("40")) < 0) {
            System.out.println("Name Of Student : " + name + "\nPercentage Of Student : " + percentage + " %");
        } else {
            System.out.print("");
        }
    }

}
class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Student student1 = new Student(scanner.nextLine(),scanner.nextDouble());
       scanner.nextLine();
       Student student2 = new Student(scanner.nextLine(),scanner.nextDouble());
        scanner.nextLine();
       Student student3 = new Student(scanner.nextLine(),scanner.nextDouble());
    }
}
