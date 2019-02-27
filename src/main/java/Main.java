import components.AgeCalculator;
import components.CelciusToFahrenheit;
import components.LightningCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printHelp();

        Scanner mainScanner = new Scanner(System.in);
        var input = mainScanner.next();
        switch (input) {
            case "1":
                new LightningCalculator().execute();
                break;
            case "2":
                new CelciusToFahrenheit().execute();
                break;
            case "3":
                new AgeCalculator().execute();
                break;
            default:
                printHelp();
                break;
        }
    }

    private static void printHelp() {
        System.out.println("enter a number to start a different part of the Program.");
        System.out.println("==========================================================");
        System.out.println("1 - this program calculates the distance of lightning.");
        System.out.println("2 - this program converts Celcius to Fahrenheit and vice versa.");
        System.out.println("3 - this program calculates the age of a person.");
        System.out.println("==========================================================");
    }
}
