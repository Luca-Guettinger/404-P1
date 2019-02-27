package api;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

@RequiredArgsConstructor
public class InternalScanner {
    private final Scanner scanner;
    private final Program stopable;

    public Double nextDouble(String invalidInputMessage) {
        if (!(stopable instanceof IStopable)) {
            return scanner.nextDouble();

        }else {
            while (true) {
                var r = scanner.next();
                if (r.equalsIgnoreCase("stop")) {
                    System.out.println(((IStopable)stopable).getStopMessage());
                    break;
                }

                try {
                    return Double.parseDouble(r);
                }catch (NumberFormatException ex) {
                    System.out.println(invalidInputMessage + "\n" + ex.getMessage());
                }

            }
            return null;
        }
    }

    /**
     * if stopable is true, "stop" can not be used as a input string because it is used to stop the program.
     * @return
     */
    public String next() {
        String next = scanner.next();
        if (stopable instanceof IStopable) {
            if (next.equalsIgnoreCase("stop")) {
                System.out.println(((IStopable)stopable).getStopMessage());
                return null;
            }
        }
        return next;
    }

    public LocalDate getDate(String pattern, String invalidInputMessage) {
        while (true) {
            try {
                String next = scanner.next();
                if (stopable instanceof IStopable) {
                    if (next.equalsIgnoreCase("stop")) {
                        System.out.println(((IStopable)stopable).getStopMessage());
                        break;
                    }
                }
                return LocalDate.parse(
                        next,
                        DateTimeFormatter.ofPattern(pattern));
            }catch (DateTimeParseException ex) {
                System.out.println(invalidInputMessage + "\n" + ex.getMessage());
                break;
            }
        }
        return null;
    }
}
