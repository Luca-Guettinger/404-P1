package components;

import api.IStopable;
import api.InternalScanner;
import api.Program;

import java.util.Scanner;

public class LightningCalculator implements Program, IStopable {
    @Override
    public void execute() {
        System.out.println("enter the time in seconds between the lightning and the thunder:");

        var time = getScanner().nextDouble("ungültige Zahl.");

        double distance = time / 3;

        System.out.println("distance: " + distance + " km");
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
