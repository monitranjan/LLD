package StateDesignPattern;

import StateDesignPattern.VendingStates.impl.State;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("*******filling up the inventory******");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);
            System.out.println("*******Clicking InsertCoinButton******");
            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine,Coin.NICKEL);
            vendingState.insertCoin(vendingMachine,Coin.QUARTER);

            System.out.println("*********Click on Product SelectionButton*****");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine,108);

            displayInventory(vendingMachine);
        } catch (Exception e) {
            displayInventory(vendingMachine);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();

        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();   // Create a new item for each slot
            if (i >= 0 && i < 3) {
                newItem.setProduct(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setProduct(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setProduct(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i >= 7 && i < 10) {
                newItem.setProduct(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);    // Set the new item in the slot
            slots[i].setCode(101 + i);    // Set the code for the slot
            slots[i].setSoldOut(false);   // Mark the slot as not sold out
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            System.out.println("codeNumber" + slots[i].getCode() + " Item: " + slots[i].getItem().getProduct().name() +
                    " Price:" + slots[i].getItem().getPrice() + " isAvailable :" + !slots[i].isSoldOut());

        }
    }
}
