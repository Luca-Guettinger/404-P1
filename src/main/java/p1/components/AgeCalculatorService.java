package p1.components;

import service.api.AbstractProgram;
import service.api.IStopable;

import java.time.LocalDate;
import java.time.Period;

/**
 * This service allows us to calculate the age of a person in years. We gather the birth date with the Pattern "dd-mm-yyyy"
 * and calculate the space between then and now by java integrated LocalDate class. We return the amount of years.
 */
public class AgeCalculatorService extends AbstractProgram implements IStopable {

    @Override
    public void execute() {
        System.out.println("enter your birthday with the following format: dd-mm-yyyy");

        LocalDate birthday = getScanner().getDate("dd-MM-yyyy",
                "please retry with the following format: dd-mm-yyyy, or type \"stop\" to end the program!");
        if (birthday == null)
            return;

        int years = Period.between(birthday, LocalDate.now()).getYears();

        System.out.println("you are " + years + " years old!");
    }
}
