package components;

import api.IStopable;
import api.Program;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator implements Program, IStopable {

    @Override
    public void execute() {
        System.out.println("enter your birthday with the following format: dd-mm-yyyy");

        LocalDate birthday = getScanner().getDate("dd-MM-yyyy",
                "please retry with the following format: dd-mm-yyyy, or type \"stop\" to end the program!");
        var years = Period.between(birthday, LocalDate.now()).getYears();

        System.out.println("you are "+years + " years old!");
    }
}
