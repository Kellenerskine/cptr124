package Misc;
//import java.time.DayOfWeek;
import java.util.Scanner;

public class Attendance1{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);{
        int daysOfWeek[] = new int[4];
        int GaryNeby[] = new int[4];
        int CindyPlatt[] = new int[4];
        int FlabNeby[] = new int[4];
        int GaryCloud[] = new int[4];
        
        //folowing two lines written just to get rid of the stupid yellow lines
        System.out.println(daysOfWeek + "" + CindyPlatt + "" + FlabNeby + "" + GaryCloud);
        scn.close();

        for(int i = 0; i < 5; ++i){
            System.out.println("Today is monday, was Gary Neby in class today? y/n");
            char userInput = scn.next().charAt(0);
            if(userInput == 'y'){
                GaryNeby[i] = 1;
            }else{
                GaryNeby[i] = 0;
            }
        }
    }
}
}