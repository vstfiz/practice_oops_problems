import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomNumberArrayClass {
    public int[] populatePsuedoRandomIntArray(int arrayLength){
        int[] solutionArray = new int[arrayLength];
        Random random = new Random();
        int tempRandom = 0;
        int randomLimit = 10*arrayLength-1;
        ArrayList<Integer> listt = new ArrayList<Integer>();
        while(listt.size() != arrayLength){
            tempRandom = random.nextInt(randomLimit);
            if(!listt.contains(tempRandom)){
                listt.add(tempRandom);
            }
        }
        for (int i = 0 ; i< arrayLength;i++){
            solutionArray[i] = listt.get(i);
        }
        return solutionArray;
    }
    //Driver Code to check the Definition Class Code.
    // Un-comment it to check.


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        RandomNumberArrayClass r = new RandomNumberArrayClass();
//        int[] solutionArray = r.populatePsuedoRandomIntArray(scanner.nextInt());
//        for (int i=0;i<solutionArray.length;i++){
//            System.out.print(solutionArray[i]+"\t");
//        }
//    }
}
