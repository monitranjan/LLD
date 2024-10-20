package StateDesignPattern.VendingStates.impl;

import StateDesignPattern.Coin;
import StateDesignPattern.Item;
import StateDesignPattern.VendingMachine;

import java.util.List;

public class DispenseState implements State{
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Current vending machine is in Dispense state");
        dispenseProduct(machine,codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can't click in dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("you can't select product in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can't insert coin in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can't choose product in dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can't money in dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {

        Item item = machine.getInventory().getItem(codeNumber);
        System.out.println("Product has been dispensed: " + item.getProduct());
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState());
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you can't get refund in dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can't update inventory in dispense state");
    }
}
