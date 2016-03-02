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

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        items = new ArrayList<Item>(); //the ammount of items a player may hold
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
     * Take an item
     * @param Item The item that has to be taken
     */
    public void takeItem(Item item){
        if(item != null){
            if(items.size() < itemAmmount){
                items.add(item);
            }else{
                System.out.println("Backpack is full");
            }
        }
    }

    /**
     * Drop an item
     * @param Item The item to be dropped
     */
    public void dropItem(Item item){
        if(item!=null){
            items.remove(item);
        }
    }

    /**
     * Print all the items a player is holding
     */
    public void printItems(){
        for(Item item : items){
            System.out.println(item + " ");
        }
    }
}
