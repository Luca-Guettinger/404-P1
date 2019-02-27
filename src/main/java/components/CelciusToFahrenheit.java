package components;

import api.IStopable;
import api.InternalScanner;
import api.Program;

public class CelciusToFahrenheit implements Program, IStopable {
    @Override
    public void execute() {

    }

    @Override
    public String getStopMessage() {
        return null;
    }

    @Override
    public InternalScanner getScanner() {
        return null;
    }
}
