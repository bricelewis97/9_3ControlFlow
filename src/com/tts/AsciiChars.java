package com.tts;
import java.util.*;

public class AsciiChars {
    public static void printNumbers()
    {
        for(int i = 48; i <= 57; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
    public static void printLowerCase()
    {
        for(int i = 97; i <= 122; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
    public static void printUpperCase()
    {
        for(int i = 65; i <= 90; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
    public static void main(String[] args) {
        printNumbers();
        printLowerCase();
        printUpperCase();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = scanner.next();
        System.out.printf("Hello %s", name + " Would you like to " +
                "continue? ");
        String decision = scanner.next();
        if (decision.equalsIgnoreCase("yes") ||
                (decision.equalsIgnoreCase("y")))
        {
            do {


                System.out.println("What is the name of your favorite pet?");
                String petName = scanner.next();
                System.out.println("How old is your pet?");
                int petAge = Integer.parseInt(scanner.next());
                System.out.println("What is your lucky number?");
                int luckyNumber = Integer.parseInt(scanner.next());
                System.out.println("Do you have a favorite quarterback?");
                String favQuarter = scanner.next();
                if (favQuarter.equalsIgnoreCase("yes")) {
                    System.out.println("What is his jersey number?");
                    int jerseyNum = Integer.parseInt(scanner.next());
                    //added a statement for if they replied no
                } else System.out.println("Start watching football.");
                System.out.println("What is the two digit model year of your car?");
                int modelYear = Integer.parseInt(scanner.next());
                System.out.println("Who is your favorite actor/actress?");
                String actor = scanner.next();
                System.out.println("Enter a random number between 1-50");
                int randomNumber = Integer.parseInt(scanner.next());
                int magicBall = luckyNumber * randomNumber;
                if (magicBall > 75) {
                    do {
                        magicBall = magicBall / 2;
                    } while (magicBall > 75);
                }
//                                System.out.printf( "Magic Ball Number : %s", magicBall);
                int powerBallOne = 42;
                int powerBallTwo = modelYear + luckyNumber;
                if (powerBallTwo > 65) {
                    do {
                        powerBallTwo = powerBallTwo / 2;
                    } while (powerBallTwo > 65);
                }
                int powerBallThree = petName.charAt(2);
                if (powerBallThree > 65) {
                    do {
                        powerBallThree = powerBallThree / 2;
                    } while (powerBallThree > 65);
                }
                int powerBallFour = actor.charAt(0);
                if (powerBallFour > 65) {
                    do {
                        powerBallFour = powerBallFour / 2;
                    } while (powerBallFour > 65);
                }
                int powerBallFive = petAge + modelYear;
                if (powerBallFive > 65) {
                    do {
                        powerBallFive = powerBallFive / 2;
                    } while (powerBallFive > 65);
                }
                System.out.println("Lottery numbers: " + powerBallOne + " " + powerBallTwo + " " + powerBallThree + " " +
                        powerBallFour + " " + powerBallFive + " Magic Number: " + magicBall);
                System.out.println("\n Would you like to generate another set of numbers? (yes/no)");
                decision = scanner.next();

                if (decision.equalsIgnoreCase("yes")) {
                } else {
                    decision = "n";
                }
            }
            while (!decision.equals("n")) ;
//                    }
//                }
        } else {
            System.out.println("Return later to complete" +
                    " the survey");
            //not needed
//                System.exit(0);
        }
//        }
    }
}
