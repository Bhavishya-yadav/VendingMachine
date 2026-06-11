public class IdleState extends VendingMachineState {

    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void insertMoney(int amount) {
        if(amount < 0) {
            System.out.println("BKL fata note kyu daala!!!");
            vendingMachine.amount = 0;
            vendingMachine.setState(new IdleState(vendingMachine));
        }
        vendingMachine.setState(new SelectItemState(vendingMachine));
    }

    @Override
    public void selectItem(int itemId) {
        throw new UnsupportedOperationException("Functionality not supported as per current state!!!");
    }

    @Override
    public void dispenseItem() {
        throw new UnsupportedOperationException("Functionality not supported as per current state!!!");
    }

    
    
}
