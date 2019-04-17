package p1.components;

import service.api.AbstractProgram;
import service.api.IStopable;

/**
 * p1.Main Service that is executed on Program start. This determins witch sub Service is started next!
 */
public class MainService extends AbstractProgram implements IStopable {

    public void execute() {
        printHelp();

        String input = this.getScanner().next();

        while (input != null) {
            switch (input) {
                case "1":
                    new LightningCalculatorService().execute();
                    break;
                case "2":
                    new CelsiusToFahrenheitService().execute();
                    break;
                case "3":
                    new AgeCalculatorService().execute();
                    break;
                default:
                    break;
            }
            printHelp();
            input = this.getScanner().next();
        }
    }

    private static void printHelp() {
        System.out.println("==========================================================");
        System.out.println("1 - this program calculates the distance of lightning.");
        System.out.println("2 - this program converts Celsius to Fahrenheit and vice versa.");
        System.out.println("3 - this program calculates the age of a person.");
        System.out.println("==========================================================");
        System.out.println("enter a number to start a different part of the IProgram.");
    }
}
