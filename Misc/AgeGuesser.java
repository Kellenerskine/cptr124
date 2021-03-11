package Misc;
import java.util.Scanner;

public class AgeGuesser {
  public static void main (String [] Args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Im going to guess your age.");
    System.out.println("I am going to print a block of numbers, if you see the number corresponding to the number of years you have been alive answer accordingly and press enter.");
    System.out.println("If you see your age type: y");
    System.out.println("If your age is not printed in the block of numbers type: n");
    int userAge = 0;

    System.out.println("Now that you understand lets get to the first block of numbers:");
    System.out.println();

    //card 0
    System.out.println("01 03 05 07 09 11");
    System.out.println("13 15 17 19 21 23");
    System.out.println("25 27 29 31 33 35");
    System.out.println("37 39 41 43 45 47");
    System.out.println("49 51 53 55 57 59");
    System.out.println("61 63");

    System.out.print("Is your age in the above block of numbers? Type y or n here: ");
    char userOne = scn.next().charAt(0);
    if (userOne == 'y'){
      userAge = userAge + 1;
    }
          //card 1
    System.out.println("02 03 06 07 10 11");
    System.out.println("14 15 18 19 22 23");
    System.out.println("26 27 30 31 34 35");
    System.out.println("38 39 42 43 45 47");
    System.out.println("50 51 54 55 58 59");
    System.out.println("62 63");

    System.out.print("Is your age in the above block of numbers? Type y or n here: ");
    char userTwo = scn.next().charAt(0);
    if (userTwo == 'y'){
      userAge = userAge + 2;
    }
          //card 2
    System.out.println("04 05 06 07 12 13");
    System.out.println("14 15 20 21 22 23");
    System.out.println("28 29 30 31 36 37");
    System.out.println("38 39 44 45 46 47");
    System.out.println("52 53 54 55 60 61");
    System.out.println("62 63");

    System.out.print("Is your age in the above block of numbers? Type y or n here: ");
    char userThree = scn.next().charAt(0);
    if (userThree == 'y'){
      userAge = userAge + 4;
    }
          //card 3
    System.out.println("08 09 10 11 12 13");
    System.out.println("14 15 24 25 26 27");
    System.out.println("28 29 30 31 40 41");
    System.out.println("42 43 44 45 46 47");
    System.out.println("56 57 58 59 60 61");
    System.out.println("62 63");

    System.out.print("Is your age in the above block of numbers? Type y or n here: ");
    char userFour = scn.next().charAt(0);
    if (userFour == 'y'){
      userAge = userAge + 8;
    }

    //card 4
    System.out.println("16 17 18 19 20 21");
    System.out.println("22 23 24 25 26 27");
    System.out.println("28 29 30 31 48 49");
    System.out.println("50 51 52 53 54 55");
    System.out.println("56 57 58 59 60 61");
    System.out.println("62 63");

    System.out.print("Is your age in the above block of numbers? Type y or n here: ");
    char userFive = scn.next().charAt(0);
    if (userFive == 'y'){
      userAge = userAge + 16;
    }

    //card 5
    System.out.println("32 33 34 35 36 37");
    System.out.println("38 39 40 41 42 43");
    System.out.println("44 45 46 47 48 49");
    System.out.println("50 51 52 53 54 55");
    System.out.println("56 57 58 59 60 61");
    System.out.println("62 63");

    System.out.print("Is your age in the above block of numbers? Type y or n here: ");
    char userSix = scn.next().charAt(0);
    if (userSix == 'y'){
      userAge = userAge + 32;
    }

    System.out.println("Is your age: " + userAge + "?");
    char userOpinion = scn.next().charAt(0);
    if (userOpinion != 'y'){
      System.out.println("Welp, if the age i guessed is not your correct age, you lied at some point! :(");
    }else{
      System.out.println("Nice! Did you like this program? Do you know how I guessed your age?");
    }
    scn.close();
  }
}
