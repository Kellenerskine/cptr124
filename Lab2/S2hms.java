package Lab2;
import java.util.Scanner;

public class S2hms {
    public static void main(String[] args){
        int secondsIn;
        Scanner scn = new Scanner(System.in);
        System.out.print("Type in the time in seconds: ");
        secondsIn = scn.nextInt();
        int hours = ((secondsIn / 60)/60);
        int minutes = (((secondsIn - hours)/60) % 60);
        int seconds = ((secondsIn - (hours * 60 * 60) - (minutes * 60)) % 60);

        System.out.println(hours + " Hours" + " " + minutes + " Minutes" + " " + seconds + " seconds");

        scn.close();
    }
}
