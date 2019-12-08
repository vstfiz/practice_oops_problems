import java.util.Scanner;

public class MyCalculator {
    public int n;
    public int p;
    public MyCalculator(int n , int p){
        this.n = n;
        this.p = p;
    }
    long power(int n,int p) throws ZeroInputException, NegativeInputException {
        int result = 0;
        if(n==0 || p==0){
            throw new ZeroInputException("n and p should not be zero");
        }
        else if(n < 0 || p <0){
            throw new NegativeInputException("n and p should not be negative");
        }
        else
            result = (int) Math.pow(n,p);
        return result;
    }
}
class NegativeInputException extends Exception {
    public NegativeInputException(String message){
        super(message);
    }

}
class ZeroInputException extends Exception {
    public ZeroInputException(String message){
        super(message);
    }
}
class Testing1{
    public static void main(String[] args) throws NegativeInputException, ZeroInputException {
        Scanner scanner = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator(scanner.nextInt(),scanner.nextInt());
        myCalculator.power(myCalculator.n,myCalculator.p);
    }
}