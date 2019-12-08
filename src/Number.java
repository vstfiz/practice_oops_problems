public class Number {
    private double number;
    public Number(double number){
        this.number = number;
    }
    public boolean isZero(double number){
        return number==0;
    }
    public boolean isPositive(double number){
        return number==0;
    }
    public boolean isNegative(double number){
        return number==0;
    }
    public boolean isOdd(double number){
        return number==0;
    }
    public boolean isEven(double number){
        return number==0;
    }
    public boolean isPrime(double number){
        boolean primeFlag = false;
        int count = 0;
        for(int i = 2;i < number/2;i++){
            if(number % i == 0){
                count++;
            }
        }
//        count == 1?primeFlag = true:primeFlag = false;
        return primeFlag;
    }
    public boolean isArmstrong(double number){
        return number==0;
    }
}
