package components;

import api.IStopable;
import api.InternalScanner;
import api.Program;

import java.util.Scanner;

public class CelciusToFahrenheit implements Program, IStopable {
    @Override
    public void execute() {

    }

    @Override
    public InternalScanner getScanner() {
        return new InternalScanner(new Scanner(System.in), this);
    }

    @Override
    public String getStopMessage() {
        return "shuting down program";
    }
}
