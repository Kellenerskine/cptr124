package Misc;

import java.util.Scanner;

public class SchooBudge {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        //Monthly income:
        System.out.print("How many jobs do you have? ");
        float numJobs = scn.nextFloat();
        float monthlyPay = 0;

        int cycle = 1;
        while (cycle <= numJobs) {
            System.out.println("How much do you make in job " + cycle);
            float incomePerJob = scn.nextFloat();
            System.out.println("How many hours a week do you work?");
            float weeklyHours = scn.nextFloat();
            float moneyPerWeek = (incomePerJob * weeklyHours);
            float monthlyIncome = (moneyPerWeek * 4);
            monthlyPay = monthlyPay + monthlyIncome;
            System.out.println("you make $" + monthlyIncome + " every month in job " + cycle);
            cycle++;
        }
        System.out.println("You will make $" + monthlyPay + " every month from work.");


        //Monthly payment:
        System.out.print("Enter in the total bill: ");
        float totalBill = scn.nextFloat();
        System.out.print("Please enter the number of months you will be paying over: ");
        float numMonths = scn.nextFloat();
        float payPerMonth = (totalBill / numMonths);
        System.out.println("You need to pay $" + (payPerMonth + 5/*spotify*/) + " every month.");

        float diffPerMonth = (payPerMonth - monthlyPay);
        System.out.println(" ");
        System.out.println("You need to make up $" + diffPerMonth + " every month.");

        scn.close();
    }
}