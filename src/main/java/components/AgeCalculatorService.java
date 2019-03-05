package components;

import api.IStopable;
import api.IProgram;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorService implements IProgram, IStopable {

    @Override
    public void execute() {
        System.out.println("enter your birthday with the following format: dd-mm-yyyy");

        LocalDate birthday = getScanner().getDate("dd-MM-yyyy",
                "please retry with the following format: dd-mm-yyyy, or type \"stop\" to end the program!");
        if (birthday == null)
            return;

        var years = Period.between(birthday, LocalDate.now()).getYears();

        System.out.println("you are " + years + " years old!");
    }
}
