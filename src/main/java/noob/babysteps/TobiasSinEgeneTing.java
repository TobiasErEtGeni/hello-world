package noob.babysteps;

import java.util.Scanner;

class TobiasSinEgeneTing {
    String string = new String("dfdfg");

    public static void main(String[] arguments) {
        System.out.println(new TobiasSinEgeneTing().jada());
    }

    Integer jada() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("1 for pluss kalkulator, 2 for multiplikajons kalkulator");
        Integer plussMul = myScanner.nextInt();

        if (plussMul != 1 && plussMul != 2 ) {
            System.out.println("Jeg gir opp :-(");
            myScanner.close();
            return 0;
        }

        System.out.println("Skriv inn et tall");
        Integer tall1 = myScanner.nextInt();
        System.out.println("og et tall til");
        Integer tall2 = myScanner.nextInt();
        myScanner.close();

        if (plussMul == 2) {
            System.out.println(tall1 + " ganger " + tall2 + " er lik:");
            return tall1 * tall2;
        }

        if (plussMul == 1) {
            
            return tall1 + tall2;
        }

        
        return 0;
    }

}
