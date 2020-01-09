package noob.babysteps;

import java.util.Scanner;

class RefTester {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] arguments) {
        new RefTester().startOver();
    }    

    private void startOver() {
        showInfoOnScreen();
        Integer myInt = getUserinput();        
        convert(myInt);
        end();
    }

    private void end() {
        scanner.close();
    }

    private void convert(Integer myInt) {
        if (myInt == 1) {
            System.out.println("You have chosen Farenheit");
        
                        
            System.out.println("State your temperature in Farenheit");
            float farenheitnumber = scanner.nextInt();
            float celciusnumber = (farenheitnumber - 32) * 5 / 9;
            System.out.println("Your temperature in Celcius is: " + celciusnumber);
        
        }
        if (myInt == 2) {
            System.out.println("You have chosen Celcius");


            System.out.println("State your temperature in Celcius");
            float celciusnumber = scanner.nextInt();
            float farenheitnumber = (celciusnumber *9/5) +32;
            System.out.println("Your temperatre in farenheit is: " + farenheitnumber);
        }
      
       
    }

    private Integer getUserinput() {
        Integer ohMy = 0;

        try {
            ohMy = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Choose a valid number, you entered somthing unexpected: " + e.getMessage());
            
        }
        
        if (ohMy != 1 && ohMy != 2 ) { 
            System.out.println("Choose a valid number " + ohMy);
            startOver();                 
        }
        return ohMy;
    }

    private void showInfoOnScreen() {
        // Opptions (Farenheit calculator, or Celcius calculator)

        // Type in 1 for farenheir calculator, or type in 2 for Celcius calculator)

        System.out.println("1 for Farenheit convertion");
        System.out.println("2 for Clecius convertion");
    }

}