
/**
 * Items in the game.
 * 
 * @author Jouke Rienstra
 * @version 1.0
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description; //The description of the item
    private String name; //The name of the item
    private int weight; //The weight of the item

    /**
     * Constructor for objects of class item
     * @param name The name of the item
     * @param description The description of the item
     * @param weight The weight of the item
     */
    public Item(String name, String description, int weight)
    {
        this.description = description;
        this.weight = weight;
        this.name = name;
    }
    
    /**
     * Constructor for objects of class item
     * With default values(for testing)
     */
    public Item()
    {
        this.description = "description";
        this.weight = 5;
        this.name = "name";
    }


    /**
     * Display the weight of an item
     * @return weight The weight of the item
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Get the name of an item
     * @return name The name of the item
     */
    public String getName(){
        return name;
    }
    
    /**
     * Display the description of the item
     * @return description The description of the item
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Set the weight of an item
     * @param weight The weight of the item
     */
    public void setWeight(int weight){
        this.weight = weight;
    }

    /**
     * Set the description of an item
     * @param description The description of the item
     */
    public void setDescription(String description){
        this.description = description;
    }
}
