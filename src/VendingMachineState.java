public abstract class VendingMachineState {
    public VendingMachine vendingMachine;

    public VendingMachineState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void insertMoney(int amount);

    public abstract void selectItem(int itemId) throws Exception;

    public abstract void dispenseItem();

}
