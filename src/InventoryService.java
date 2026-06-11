import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    Map<Integer, Integer> itemMap; // itemId -> itemCount
    Map<Integer, Item> items;
    public InventoryService() {
        itemMap = new HashMap<>();
        items = new HashMap<>();
    }

    public void addItem(Item item, int count) {
        int itemId = item.getItemId();
        itemMap.putIfAbsent(itemId, 0);
        itemMap.put(itemId, itemMap.get(itemId) + count);
        items.putIfAbsent(itemId, item);
    }

    public void dispenseItem(int itemId) throws Exception {
        if(!itemMap.containsKey(itemId) || itemMap.get(itemId) == 0) {
            throw new Exception("Item not available!!!");
        }
        itemMap.put(itemId, itemMap.get(itemId)-1);
    }

    public int getItemPrice(int itemId) throws Exception {
        if(!itemMap.containsKey(itemId) || itemMap.get(itemId) == 0) {
            throw new Exception("Item not available!!!");
        }
        return items.get(itemId).getPrice();
    }

    public Item getItem(int itemId) {
        return items.get(itemId);
    }

    
}
