public class DispenseItemState extends VendingMachineState {

    public DispenseItemState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertMoney(int amount) {
        throw new UnsupportedOperationException("Functionality not supported as per current state!!!");
    }

    @Override
    public void selectItem(int itemId) {
        throw new UnsupportedOperationException("Functionality not supported as per current state!!!");
    }

    @Override
    public void dispenseItem() {
        if(vendingMachine.getCurrSelectedItemId() == -1) {
            System.out.println("Bhkk bsdk!!!!");
        } else {
            System.out.println("Le Pakad apna samaan!!!!");
        }

        vendingMachine.setState(new IdleState(vendingMachine));
    }
    
}
