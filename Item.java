/**
* This is the item that manages all the items.
*
* @author Logan S
* @version 1.0
* @since 2023-06-12
*/

public final class Item {

    /**
     * Creating the name.
     */
    private String name;

    /**
     * Creating the attack bonus.
     */
    private int attackBonus;

    /**
     * Creating the defense bonus.
     */
    private int defenseBonus;

    /**
     * Constructor for creating an item.
     *
     * @param name the name.
     * @param attackBonus the attack bonus.
     * @param defenseBonus the defense bonus.
     */
    public Item(String name, int attackBonus, int defenseBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    /**
     * Get the name of the item.
     *
     * @return the name.
     */

    public String getName() {
        return name;
    }

    /**
     * Get the attack bonus on the item.
     *
     * @return the attack bonus.
     */

    public int getAttackBonus() {
        return attackBonus;
    }

    /**
     * Get the defense bonus of the item.
     *
     * @return the defense bonus.
     */

    public int getDefenseBonus() {
        return defenseBonus;
    }
}
