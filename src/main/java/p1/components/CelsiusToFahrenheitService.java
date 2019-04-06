package p1.components;

import service.api.IProgram;
import service.api.IStopable;

public class CelsiusToFahrenheitService implements IProgram, IStopable {
    @Override
    public void execute() {
        System.out.println("1 - from Celsius to Fahrenheit");
        System.out.println("2 - from Fahrenheit to Celsius");

        var input = getScanner().next();
        switch (input) {
            case "1":
                System.out.println("Enter temperature in Celsius");
                double t1 = getScanner().nextDouble("invalid Number!");
                System.out.println("temperature in Fahrenheit = " + (32 + 9* t1 /5));
                break;
            case "2":
                System.out.println("Enter temperature in Fahrenheit");
                double t2= getScanner().nextDouble("invalid Number!");
                System.out.println("temperature in Celsius = " + (((t2 - 32)*5)/9));
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
    }
}