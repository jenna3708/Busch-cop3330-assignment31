/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;

public class exercise31 {

    static double targetHeart(double convResting, double convAge, double intensity)
    {
        double TargetHeartRate;
        TargetHeartRate = (((220 - convAge - convResting) * intensity) + convResting);

        return TargetHeartRate;
    }


    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Resting pulse:");
        String resting = input.next();
        double convResting = Double.parseDouble(resting);

        System.out.println("Age:");
        String age = input.next();
        double convAge = Double .parseDouble(age);


        System.out.println("Intensity | Rate");
        System.out.println("----------|--------");

        for(double i = 55; i <= 95; i+=5)
        {
            double intensity;
            intensity = i/100;

            double target = 0;
            target = targetHeart(convResting, convAge, intensity);

            System.out.println(Math.round(intensity*100)+"%       | "+Math.round(target)+" bpm");
        }

    }

}
