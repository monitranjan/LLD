package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(Priority priority, String message ){
        if(Priority.INFO == priority){
            System.out.println("INFO:" +message);
        }else{
            super.log(priority,message);
        }
    }
}
