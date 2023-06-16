/**
* This is the player object.
*
* @author Logan S
* @version 1.0
* @since 2023-06-11
*/

public final class Player {

    /**
     * Creating the name.
     */
    private String name;

    /**
     * Creating the attack power.
     */
    private int attack;

    /**
     * Creating the defense power.
     */
    private int defense;

    /**
     * Creating the inventory.
     */
    private Inventory inventory;

    /**
     * Constructor for creating a player.
     *
     * @param name the name.
     */

    public Player(String name) {
        this.name = name;
        this.attack = 10;
        this.defense = 10;
        this.inventory = new Inventory();
    }

    /**
     * Get the name of the player.
     *
     * @return the name.
     */

    public String getName() {
        return name;
    }

    /**
     * Get the attack of the player.
     *
     * @return the attack power.
     */

    public int getAttack() {
        return attack;
    }

    /**
     * Get the defense of the player.
     *
     * @return the defense power.
     */

    public int getDefense() {
        return defense;
    }

    /**
     * Get the inventory.
     *
     * @return the inventory.
     */

    public Inventory getInventory() {
        return this.inventory;
    }

    /**
     * Add an item to the player's inventory.
     *
     * @param item the item being added.
     */

    public void addItemToInventory(Item item) {
        inventory.addItem(item);
    }

    /**
     * Equip an item from the player's inventory.
     *
     * @param item The item being equipped.
     */

    public void equipItem(Item item) {
        if (inventory.hasItem(item)) {
            inventory.equipItem(item);
            updateStats();
            System.out.println("Equipped item: " + item.getName());
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    /**
     * Unequip an item from the player's equipped items.
     *
     * @param item the item being unequipped.
     */

    public void unequipItem(Item item) {
        if (inventory.hasEquippedItem(item)) {
            inventory.unequipItem(item);
            updateStats();
            System.out.println("Unequipped item: " + item.getName());
        } else {
            System.out.println("Item not found in equipped items.");
        }
    }

    /**
     * Updating the player's stats based on equipped items.
     */

    private void updateStats() {
        attack = 10;
        defense = 10;

        for (Item item : inventory.getEquippedItems()) {
            attack += item.getAttackBonus();
            defense += item.getDefenseBonus();
        }
    }
}
