package components;

import api.IProgram;

public class LightningCalculatorService implements IProgram {
    @Override
    public void execute() {
        System.out.println("enter the time in seconds between the lightning and the thunder:");

        var time = getScanner().nextDouble("ungültige Zahl.");

        double distance = time / 3;

        System.out.println("distance: " + distance + " km");
    }
}