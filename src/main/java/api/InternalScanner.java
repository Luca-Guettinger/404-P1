package api;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InternalScanner {
    private final Scanner scanner;
    private final Program program;

    public InternalScanner(Scanner scanner, Program program) {
        this.scanner = scanner;
        this.program = program;
    }

    public Double nextDouble(String invalidInputMessage) {
        if (!(program instanceof IStopable)) {
            return scanner.nextDouble();

        }else {
            while (true) {
                var r = scanner.next();
                if (r.equalsIgnoreCase("stop")) {
                    IStopable program = (IStopable) this.program;
                    program.stop();
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
     * if program is true, "stop" can not be used as a input string because it is used to stop the program.
     * @return
     */
    public String next() {
        String next = scanner.next();
        if (program instanceof IStopable) {
            if (next.equalsIgnoreCase("stop")) {
                IStopable program = (IStopable) this.program;
                program.stop();
                return null;
            }
        }
        return next;
    }

    public LocalDate getDate(String pattern, String invalidInputMessage) {
        while (true) {
            try {
                String next = scanner.next();
                if (program instanceof IStopable) {
                    if (next.equalsIgnoreCase("stop")) {
                        IStopable program = (IStopable) this.program;
                        program.stop();
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
