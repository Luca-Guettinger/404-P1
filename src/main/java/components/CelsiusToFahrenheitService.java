package components;

import api.IStopable;
import api.IProgram;

public class CelsiusToFahrenheitService implements IProgram, IStopable {
    @Override
    public void execute() {
        System.out.println("1 - from Celsius to Fahrenheit");
        System.out.println("2 - from Fahrenheit to Celsius");

        var input = getScanner().next();
        double temperature = getScanner().nextDouble("invalid Number!");
        switch (input) {
            case "1":
                System.out.println("Enter temperature in Celsius");
                System.out.println("temperature in Fahrenheit = " + (32 + 9* temperature /5));
                break;
            case "2":
                System.out.println("Enter temperature in Fahrenheit");
                System.out.println("temperature in Celsius = " + (((temperature - 32)*5)/9));
                break;
            default:
                System.out.println("invalid input!");
                break;
        }


    }
}
