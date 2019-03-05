package components;

import api.IProgram;

public class LightningCalculatorService implements IProgram {
    @Override
    public void execute() {
        System.out.println("enter the time in seconds between the lightning and the thunder:");

        var time = getScanner().nextDouble("ungültige Zahl.");

        System.out.println("distance: " + time / 3 + " km");
    }
}