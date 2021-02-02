package Lab2;
import java.util.Scanner;

public class Hms2s{
    public static void main(String[] args){
        int hours;
        int minutes;
        int seconds;
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter in the hours, minutes, and seconds separated by spaces: ");
        hours = scn.nextInt();
        minutes = scn.nextInt();
        seconds = scn.nextInt();

        int hoursToSeconds = ((hours*60)*60);
        int minutesToSeconds = (minutes*60);

        System.out.println("That is " + (hoursToSeconds + minutesToSeconds + seconds) + " seconds.");
        scn.close();
    }

}
