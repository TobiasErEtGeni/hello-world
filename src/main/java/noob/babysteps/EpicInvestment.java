package noob.babysteps;

public class EpicInvestment {
    public static void main(final String[] arguments) {
        float investments = 14000;
        System.out.println(investments + "your investment");
        investments = (float) (investments * (1.0 + 40.0 / 100.0));
        System.out.println("your investment after first year: " + investments);

        System.out.println("reminder: " + (40 % 100));
        investments = investments - 1500;
        System.out.println("your investment after second year: " + investments);
        investments = (float) (investments * (1.0 + 12.0 / 100.0));
        System.out.println("your investment after third year: " + investments);



        System.out.println("reminder: " + (40 % 100));
        System.out.println("reminder: " + (400 % 100));

    }
}
