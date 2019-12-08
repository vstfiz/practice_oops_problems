import java.util.Scanner;

public class Number {
    private double number;
    public Number(double number){
        this.number = number;
    }
    public boolean isZero(double number){
        boolean isZero;
        isZero = Double.compare(number,Double.parseDouble("0"))==0?true:false;
        return isZero;
    }
    public boolean isPositive(double number){
        boolean isPositive;
        isPositive = Double.compare(number, Double.parseDouble("0")) > 0;
        return isPositive;
    }
    public boolean isNegative(double number){
        boolean isNegative;
        isNegative = Double.compare(number, Double.parseDouble("0")) < 0;
        return isNegative;
    }
    public boolean isOdd(double number){
        boolean isOdd;
        isOdd = (Math.floor(number) % 2) != 0;
        return isOdd;
    }
    public boolean isEven(double number){
        boolean isEven;
        isEven = (Math.floor(number) % 2) == 0;
        return isEven;
    }
    public boolean isPrime(double number){
        boolean primeFlag = false;
        int count = 0;
        for(int i = 2;i < number/2;i++){
            if(number % i == 0){
                count++;
            }
        }
        primeFlag = count == 0;
        return primeFlag;
    }
    public boolean isArmstrong(double number){
        boolean isArmstrong;
        int originalNumber = (int)number;
        int originalNumber1 = (int)number;
        int remainder, result = 0;
        int lengthNumber = 0;
        while(originalNumber1 != 0){
            originalNumber1 = originalNumber1/10;
            lengthNumber++;
        }
        System.out.println(lengthNumber);
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, lengthNumber);
            originalNumber /= 10;
        }
        isArmstrong = result == Math.floor(number);
        return isArmstrong;
    }
    //Driver Code to check the Definition Class Code.
    // Un-comment it to check.

//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Number number = new Number(scanner.nextDouble());
//        System.out.println(number.isArmstrong(number.number));
//    }
}
