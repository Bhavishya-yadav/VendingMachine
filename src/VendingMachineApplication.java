public class VendingMachineApplication {
    public static void main(String[] args){
        InventoryService inventory = new InventoryService();
        inventory.addItem(new Item(10, "Frooty", 1), 5);
        inventory.addItem(new Item(20, "Aalu Bhujia", 2), 10);
        inventory.addItem(new Item(15, "Punjabi Tadka", 3), 5);
        inventory.addItem(new Item(5, "Parle G", 4), 10);
        inventory.addItem(new Item(10, "Hingoli", 5), 15);
        inventory.addItem(new Item(2, "Guru chela", 6), 5);
        VendingMachine machine  = new VendingMachine(inventory);

        try {
            machine.insertMoney(50);
            machine.selectItem(2);
            machine.dispenseItem();
            System.out.println("---------");

            machine.insertMoney(2);
            machine.selectItem(6);
            machine.dispenseItem();
            System.out.println("---------");

            machine.insertMoney(2);
            machine.selectItem(5);
            machine.dispenseItem();
            System.out.println("---------");

            machine.insertMoney(2);
            machine.selectItem(90);
            machine.dispenseItem();
            System.out.println("---------");
        } catch(Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
