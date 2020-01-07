package noob.babysteps;

public class Weather {
    public static void main(String[] arguments) {
        float Nuts = 86;
        System.out.println(Nuts + " degrees Fahrenheit is ...");
        // To convert Fahrenheit into Celsius
        // begin by subtracting 32
        Nuts = Nuts - 32;
        // Divide the answer by 9
        Nuts = Nuts / 9;
        // Multiply that answer by 5
        Nuts = Nuts * 5;
        System.out.println(Nuts + " degrees Celsius\n");

        float deez = 33;
        System.out.println(deez + " degrees Celsius is ...");
        // To convert Celsius into Fahrenheit
        // begin by multiplying by 9
        deez = deez * 9;
        // Divide the answer by 5
        deez = deez / 5;
        // Add 32 to the answer
        deez = deez + 32;
        System.out.println(deez + deez + " degrees Fahrenheit");
    }
}