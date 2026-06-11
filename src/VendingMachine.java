public class VendingMachine {
    VendingMachineState currState;
    InventoryService inventory;
    int amount;
    int currSelectedItemId;

    public VendingMachine(InventoryService inventory) {
        this.inventory = inventory;
        this.amount = 0;
        this.currState = new IdleState(this);
        this.currSelectedItemId = -1; 
    }

    public void setState(VendingMachineState newState) {
        this.currState = newState;
    }

    public InventoryService getInventory() {
        return this.inventory;
    }
    
    public void setInventory(InventoryService inventory) {
        this.inventory = inventory;
    }

    public int getCurrSelectedItemId() {
        return currSelectedItemId;
    }

    public void setCurrSelectedItemId(int currSelectedItemId) {
        this.currSelectedItemId = currSelectedItemId;
    }

    public int getAmount() {
        return amount;
    }

    public void insertMoney(int amount) {
        this.amount = amount;
        currState.insertMoney(amount);
    }

    public void selectItem(int itemId) throws Exception {
        currState.selectItem(itemId);
    }

    public void dispenseItem() {
        currState.dispenseItem();
    }

    public void decrementAmount(int amount){
        this.amount -= amount;
        returnAmount();
    }

    public void removeFromInventory() throws Exception{
        if(currSelectedItemId != -1) {
            inventory.dispenseItem(currSelectedItemId);
        }
    }

    public void returnAmount() {
        System.out.println("Returning your amount gandu!!! " + this.amount);
        this.amount = 0;
    }

    public void printItemDetails() {
        Item item = inventory.getItem(currSelectedItemId);
        System.out.println("-----------------------");
        System.out.println("Item dispensed: " + item.getItemId() + "   " + item.getItemName());
        System.out.println("-----------------------");
    }
    
    
}
