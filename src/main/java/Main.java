import components.AgeCalculator;
import components.LightningCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        var input = mainScanner.next();
        switch (input) {
            case "1":
                new LightningCalculator().execute();
                break;
            case "3":
                new AgeCalculator().execute();
                break;
        }


    }
}
