package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(Priority priority, String message ){
        if(Priority.ERROR == priority){
            System.out.println("Error:" +message);
        }else{
            super.log(priority,message);
        }
    }
}
