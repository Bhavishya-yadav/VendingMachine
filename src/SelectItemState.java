public class SelectItemState extends VendingMachineState{

    public SelectItemState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertMoney(int amount) {
        throw new UnsupportedOperationException("Functionality not supported as per current state!!!");
    }

    @Override
    public void selectItem(int itemId) throws Exception{
        int itemPrice = vendingMachine.getInventory().getItemPrice(itemId);
        if(vendingMachine.getAmount() < itemPrice) {
            System.out.println("MC paisa to pura de!!!!");
            vendingMachine.returnAmount();
            vendingMachine.setState(new IdleState(vendingMachine));
        } else {
            vendingMachine.decrementAmount(itemPrice);
            vendingMachine.setCurrSelectedItemId(itemId);
            vendingMachine.removeFromInventory();
            vendingMachine.setState(new DispenseItemState(vendingMachine));
        }

    }

    @Override
    public void dispenseItem() {
        throw new UnsupportedOperationException("Functionality not supported as per current state!!!");
    }
    
}
