package MementoDesignPattern;

public class Client {
    public static void main(String[] args) {
        //Initial state of Originator
        ConfigurationCareTaker careTakerObj = new ConfigurationCareTaker();
        //Initial State of Originator
        ConfigurationOriginator originatorobj = new ConfigurationOriginator(5,10);
        //save it
        ConfigurationMemento snapshot1 = originatorobj.createMemento();
        //add to history
        careTakerObj.addMemento(snapshot1);

        originatorobj.setWidth(12);
        originatorobj.setHeight(7);

        ConfigurationMemento snapshot2 = originatorobj.createMemento();
        //add to history
        careTakerObj.addMemento(snapshot2);

        originatorobj.setWidth(15);
        originatorobj.setHeight(9);

        System.out.println("Height before restore :" + originatorobj.height + ", width :" + originatorobj.width);
        ConfigurationMemento restoreLastMemento = careTakerObj.undo();
        originatorobj.restoreMemento(restoreLastMemento);

        System.out.println("Height after restore :" + originatorobj.height + ", width :" + originatorobj.width);
    }
}
