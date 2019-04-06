package p1.components;

import service.api.IProgram;

/**
 * This service allows us to investigate the distance of a storm by calculating time "t"
 * (amount of seconds between lightning and thunder) by 3 (since the sound is around 1km / 3 seconds fast
 * (t/3 = distance in km))
 */
public class LightningCalculatorService implements IProgram {
    @Override
    public void execute() {
        System.out.println("enter the time in seconds between the lightning and the thunder:");

        var time = getScanner().nextDouble("ungültige Zahl.");

        System.out.println("distance: " + time / 3 + " km");
    }
}