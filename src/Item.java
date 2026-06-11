public class Item {
    int price;
    String itemName;
    int itemId;
    
    public Item(int price, String itemName, int itemId) {
        this.price = price;
        this.itemName = itemName;
        this.itemId = itemId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

}
