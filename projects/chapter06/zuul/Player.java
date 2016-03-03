import java.util.*;
/**
 * A player in the game and his specific settings
 * 
 * @author Jouke Rienstra
 * @version 1.0
 */
public class Player
{
    private Room currentRoom; //the current room a player is in
    private ArrayList<Item> items; //the items the player is holding
    private final static int itemAmmount = 3; //the ammount of items a player may hold
    private int weightAmmount; //The weight the player can hold

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        items = new ArrayList<Item>(); //the ammount of items a player may hold
        weightAmmount = 10; //The weight the player can hold
    }

    /**
     * Set the currentRoom
     * @param Room The room that will be set as the currentRoom.
     */
    public void setCurrentRoom(Room room){
        currentRoom = room;
    }

    /**
     * return currentRoom The room the player is in
     */
    public Room getCurrentRoom(){
        return currentRoom;
    }

    /**
     * Take an item from the ground by name(string)
     * @param itemName The name of an item
     */
    public void takeItem(String itemName){
        Item item = currentRoom.getItemByName(itemName); //convert the name to a item
        if(item != null){
            if(items.size() < itemAmmount){
                if( (getTotalItemWeight() + item.getWeight()) <= weightAmmount){ //als het totale gewicht + het gewicht van de nieuwe item kleiner is dan het toegestaande hoeveelheid gewicht in de backpack.
                    items.add(item);
                    System.out.println("You took the item: " + item.getName() + " in your backpack");
                }else{
                    System.out.println("The backpack can only contain " + weightAmmount + "kilograms of items");
                }
            }else{
                System.out.println("Backpack is full");
            }
        }else{
            System.out.println("Specify a valid item to be taken");
            System.out.println("takeItem validItemNameHere");
        }
    }

    /**
     * Return the total weight of all the items the player is holding
     */
    private int getTotalItemWeight(){
        int totalWeight = 0;
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    /**
     * Drop an item by name
     * It does not check if the item is in the backpack
     * @param Item The item to be dropped
     */
    public void dropItem(String itemName){
        Item item = currentRoom.getItemByName(itemName); //convert the name to a item
        if(item!=null){
            items.remove(item);
            System.out.println("Dropped item: " + item.getName());
        }else{
            System.out.println("Specify a valid item to be dropped from the backpack");
            System.out.println("dropItem validItemNameHere");
        }
    }

    /**
     * Drink certain items by name
     * @param item The item that will be 
     */
    public void drink(String itemName){
        Item item = currentRoom.getItemByName(itemName); //convert the name to a item
        if(item!=null){
            //Drink a weight poison
            //Adds 5kgs of weight to your backpack
            if(item.getName().equals("Weightbooster")){
                weightAmmount += 5;
                dropItem(item.getName()); //delete the item after
                System.out.println("You took a weight booster and increased your weight by 5kg");
                System.out.println("You can now hold: " + weightAmmount + " kilograms");
            }

            
        }
    }

    /**
     * Print the items and the weight of the items the player is holding
     */
    public void printItems(){
        for(Item item : items){
            System.out.println("Name:" + item.getName() + " Weight:" + item.getWeight());
        }
    }
}
