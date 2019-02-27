package api;

public interface IStopable {
    default String getStopMessage() {
        return "shuting down program";
    }
}
