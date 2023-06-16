import java.util.ArrayList;
import java.util.List;

/**
* This is the player's inventory functions.
*
* @author Logan S
* @version 1.0
* @since 2023-06-11
*/

public final class Inventory {

    /**
    * The items list.
    */
    private List<Item> items;

    /**
     * The equipped items list.
     */
    private List<Item> equippedItems;

    /**
     * Constructor for creating an inventory.
     */

    public Inventory() {
        this.items = new ArrayList<>();
        this.equippedItems = new ArrayList<>();
    }

    /**
     * Get the items in the inventory.
     *
     * @return the items.
     */

    public List<Item> getItems() {
        return items;
    }

    /**
     * Get the equipped items.
     *
     * @return the equipped items.
     */

    public List<Item> getEquippedItems() {
        return equippedItems;
    }

    /**
     * Add an item to the inventory.
     *
     * @param item item.
     */

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Check if the inventory has a specific item.
     *
     * @param item item.
     * @return the items.contains(item) method.
     */

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    /**
     * Check if the inventory has an equipped item.
     *
     * @param item item.
     * @return the equippedItems.contains(item) method.
     */

    public boolean hasEquippedItem(Item item) {
        return equippedItems.contains(item);
    }

    /**
     * Equip an item from the inventory.
     *
     * @param item item.
     */

    public void equipItem(Item item) {
        items.remove(item);
        equippedItems.add(item);
    }

    /**
     * Unequip an item from the equipped items.
     *
     * @param item item.
     */

    public void unequipItem(Item item) {
        equippedItems.remove(item);
        items.add(item);
    }
}
