package com.example;

import java.util.Scanner;

public class gymTime {
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);

        String workout[][] = {{"Bench Press","Incline Bench Press","Barbell Curl","Dumbbell Curl",},
        {"Lunge","Leg Press","Leg Curl","Squat"},{"Shoulder Press","Lateral Raises","Skull Crusher","Triceps Extension"},
                {"Wide Grip Pulldown","Close Grip Pulldown","Dumbbell Row","Calf Raises"}};

        String day;
        String dayCap;
        int menu;
        Boolean exit = false;
        double age;
        double weight;
        double heartRate;
        String gender;
        double time;
        double caloriesBurned;



        System.out.println("");
        System.out.print("What Day is today?: ");
        day = inputDevice.next();
        System.out.println("");

        // this is so it always displays capital
        dayCap = day.toUpperCase();


        // if the day is not wednesday or saturday or sunday the program takes you through the following options
        if(day.equalsIgnoreCase("Wednesday") == false && day.equalsIgnoreCase("Saturday") == false && day.equalsIgnoreCase("Sunday") == false){

            // I want a menu to chose from so I'm using a do while loop
            do{
                // this displays the menu selection
                System.out.println("Please Choose One of the Following:");
                System.out.println("1: Check Todays Workout");
                System.out.println("2: Check Calories Burned");
                System.out.println("3: Exit");
                menu = inputDevice.nextInt();

                // this makes sure that numbers greater or less than  1 or 3 are not chosen
                while(menu < 1 || menu > 3){
                    System.out.print("Please Chose 1. 2. or 3.: ");
                    menu = inputDevice.nextInt();
                }

                    // this checks the menu option chosen and displays either workout for the day,
                    // calculates their calories burned, or exits the program
                    switch (menu) {

                        case 1:
                            System.out.println("");
                            System.out.println("        Day: " + dayCap);
                            System.out.println("");
                            System.out.println("Workout: ");
                            System.out.println("");

                            if (day.equalsIgnoreCase("Monday")) {

                                for (int i = 0; i < workout.length; i++) {
                                    System.out.println(workout[0][i]);
                                }
                            }
                            if (day.equalsIgnoreCase("Tuesday")) {

                                for (int i = 0; i < workout.length; i++) {
                                    System.out.println(workout[1][i]);
                                }
                            }
                            if (day.equalsIgnoreCase("Thursday")) {

                                for (int i = 0; i < workout.length; i++) {

                                    System.out.println(workout[2][i]);
                                }
                            }
                            if (day.equalsIgnoreCase("Friday")) {

                                for (int i = 0; i < workout.length; i++) {

                                    System.out.println(workout[3][i]);
                                }
                            }
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            break;

                        case 2:
                        // this has to ask if you are male or female because
                        // the calculations are different for each
                            System.out.println("");
                            System.out.print("Are you Male or Female: ");
                            gender = inputDevice.next();
                            System.out.println("");

                            // checks to make sure you wrote either male or female regardless of case
                            while (gender.equalsIgnoreCase("Male") == false && gender.equalsIgnoreCase("Female") == false) {
                                System.out.println("Please enter either 'Male' or 'Female': ");
                                gender = inputDevice.next();
                            }

                            // this gathers other necessary info like age weight heart rate and workout time
                            System.out.println("");
                            System.out.print("What is your age: ");
                            age = inputDevice.nextDouble();
                            System.out.println("");
                            System.out.print("What is your weight (in pounds): ");
                            weight = inputDevice.nextDouble();
                            System.out.println("");
                            System.out.print("What was your average heart Rate: ");
                            heartRate = inputDevice.nextDouble();
                            System.out.println("");
                            System.out.print("How long was your Workout(in minutes): ");
                            time = inputDevice.nextDouble();
                            System.out.println("");

                            if (gender.equalsIgnoreCase("Male") == true) {

                                caloriesBurned = (((age * .2017) - (weight * .09036) + (heartRate * .6309) - 55.0969) * time) / 4.184;

                                System.out.println("You burned " + caloriesBurned + " calories.");
                            }
                            if (gender.equalsIgnoreCase("Female") == true) {

                                caloriesBurned = (((age * .074) - (weight * .05741) + (heartRate * .4472) - 20.4022) * time) / 4.184;

                                System.out.println("You burned " + caloriesBurned + " calories.");
                            }

                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            break;

                        // this exits the program when chosen
                        case 3:

                            exit = true;
                            break;
                    }

                }while(exit == false);

            // if the day is wednesday or saturday or sunday then you get a day off.
        } else{
            System.out.println("It's "+dayCap+" you get the day off!");
        }

    }
}
