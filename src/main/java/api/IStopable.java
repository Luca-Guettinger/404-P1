package api;

public interface IStopable {
    default void stop() {
        System.out.println("shuting down program");
    }
}
