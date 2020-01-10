package noob.babysteps;

import java.util.Scanner;

class HalfDollars {
    int[] input = new int[42];
    int average;
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] arguments) {
        HalfDollars kake = new HalfDollars();
        kake.getUserinput();
        kake.average();
    }

    private void getUserinput() {
        boolean haveUserInput = true;
        int counter = 0;
        while (haveUserInput) {
            System.out.println("Hello");
            String userinput = myScanner.next();

            if (userinput.equalsIgnoreCase("q")) {
                haveUserInput = false;
                break;
            }

            input[counter] = Integer.valueOf(userinput);
            counter = counter + 1; // counter++

            System.out.println(
                    "you now have " + input[0] + " and " + input[1] + " and " + input[2] + " amounts of money");

        }
/*
        System.out.print("Welcome to the money average booth, please type in your first number");
        String userinput = myScanner.next();
        System.out.println("you have chosen " + userinput + " amounts of money");
        input[0] = Integer.valueOf(userinput);
        System.out.println("you now have " + input[0] + " amounts of money");
        System.out.println("Please Put in another number");
        userinput = myScanner.next();
        input[1] = Integer.valueOf(userinput);
        System.out.println("you now have " + (input[0] + input[1]) + " amounts of money");
        System.out
                .println("Put in another number, if you wish to calculate your average now or later type in Calculate");
*/
    }

    private void average() {
        average = (input[0] + input[1] + input[2]) / 3;
        System.out.println("This is your average: " + average);
    }

}