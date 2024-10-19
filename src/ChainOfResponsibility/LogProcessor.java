package ChainOfResponsibility;

public class LogProcessor {
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void log(Priority priority, String message){
        if(nextLogProcessor !=null){
            nextLogProcessor.log(priority,message);
        }
    }
}
