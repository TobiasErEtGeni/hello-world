package noob.babysteps;

import java.util.Scanner;

class HalfDollars {
    int[] input = new int[42];
    int average;
    int counter = 0;
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] arguments) {
        HalfDollars kake = new HalfDollars();
        kake.getUserinput();
        kake.average();
    }

    private void getUserinput() {
        boolean haveUserInput = true;

        while (haveUserInput) {
            System.out.println("Type your " + (counter + 1) + ". Number");
            System.out.println("If you want to submit type submit");
            String userinput = myScanner.next();

            if (userinput.equalsIgnoreCase("submit")) {
                haveUserInput = false;
                break;
            }

            input[counter] = Integer.valueOf(userinput);
            counter = counter + 1; // counter++

        }
    }

    private void average() {
        int sum = 0;
        for (int i = 0; i < counter; ++i) {
            sum = sum + input[i];
        }

        average = sum / counter;
        System.out.println("This is your average: " + average);
    }

}