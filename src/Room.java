import java.util.Scanner;

public class Room {
    boolean AC_ON;
    boolean HOME_THEATRE_ON;
    boolean FAN_ON;
    boolean LIGHTS_ON;
    public Room(boolean ac ,boolean ht ,boolean fn ,boolean lt){
        this.AC_ON = ac;
        this.HOME_THEATRE_ON = ht;
        this.FAN_ON = fn;
        this.LIGHTS_ON = lt;
        int sum = 0;
        sum += AC_ON?1200:0;
        sum += HOME_THEATRE_ON?600:0;
        sum += FAN_ON?400:0;
        sum += LIGHTS_ON?100:0;
        if (sum > 2000) {
            System.out.print("Overload");
        }
    }
}
class Testing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        Room room = new Room(scanner.nextBoolean(),scanner.nextBoolean(),scanner.nextBoolean(),scanner.nextBoolean());
    }
        }
