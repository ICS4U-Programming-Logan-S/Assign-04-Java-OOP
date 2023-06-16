import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
* This is a program that manages a small game inventory
* and allows the user/player to equip items.
*
* @author Logan S
* @version 1.0
* @since 2023-06-12
*/

public final class GameInvSystem {

    /**
    * This is the main method.
    *
    * @param args Unused.
    */

    public static void main(String[] args) {
        // Read input from file
        try {
            final File inputFile = new File("input.txt");
            final Scanner scanner = new Scanner(inputFile);

            // Create sword and shield items
            final Item sword = new Item(scanner.next(),
                    scanner.nextInt(), scanner.nextInt());
            final Item shield = new Item(scanner.next(),
                    scanner.nextInt(), scanner.nextInt());

            // Create a player
            final Player player = new Player(scanner.next());

            // Add items to player's inventory
            player.addItemToInventory(sword);
            player.addItemToInventory(shield);

            // Equip an item
            System.out.println("Available items for " + player.getName());
            displayItems(player.getInventory().getItems());

            final Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter the name of the item to equip: ");
            final String itemName = inputScanner.nextLine();

            Item itemToEquip = null;
            for (Item item : player.getInventory().getItems()) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    itemToEquip = item;
                    break;
                }
            }

            if (itemToEquip != null) {
                player.equipItem(itemToEquip);
            } else {
                System.out.println("Item not found.");
            }

            // Prepare output string
            final String output = "Player: " + player.getName() + " \n"
                    + "Attack: " + player.getAttack() + "\n"
                    + "Defense: " + player.getDefense();

            // Write output to file
            final File outputFile = new File("output.txt");
            final FileWriter writer = new FileWriter(outputFile);
            writer.write(output);
            writer.close();

            System.out.println("Output written to output.txt");
        } catch (IOException exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }
    }

    /**
    * This displays the current items.
    *
    * @param items The items.
    */

    public static void displayItems(List<Item> items) {
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("- " + item.getName());
        }
    }
}
