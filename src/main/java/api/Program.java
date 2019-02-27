package api;

import java.util.Scanner;

public interface Program {
    void execute();
    default InternalScanner getScanner() {
        return new InternalScanner(new Scanner(System.in), this);
    }

}