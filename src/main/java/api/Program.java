package api;

import java.util.Scanner;


/**
 * This interface is used to mark a class as a Main Class for a Program
 *
 */
public interface Program {
    /**
     * every Program needs to have some sort of implementation of this Method. this is the method that is executed by
     * in the Main Method.
     */
    void execute();

    /**
     * This returns a Custom Object of type {@Link InternalScanner} this object is able to handle the Console Scanner
     * better and has some more implementations and handles the implementation of the {@link IStopable}.
     * @return
     */
    default InternalScanner getScanner() {
        return new InternalScanner(new Scanner(System.in), this);
    }

}