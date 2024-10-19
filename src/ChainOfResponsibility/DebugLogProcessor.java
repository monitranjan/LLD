package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(Priority priority, String message ){
        if(Priority.DEBUG == priority){
            System.out.println("DEBUG:" +message);
        }else{
            super.log(priority,message);
        }
    }
}
