package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(Priority.ERROR,"Error Happens");
        logObject.log(Priority.DEBUG, "Need to debug this");
        logObject.log(Priority.INFO,"Info message provided");
    }
}
