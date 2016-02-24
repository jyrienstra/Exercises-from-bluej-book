
/**
 * Write a description of class MapTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;

public class MapTester
{
    HashMap<String, String> phoneBook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
      phoneBook = new HashMap<String,String>();
    }

    /**
     * Inserts a name and phonenumber in the phoneBook hashmap
     * @param name Enter the key for in the HashMap
     * @param number Enter the value for in the HashMap
     */
    public void enterNumber(String name, String number){
        phoneBook.put(name,number);
    }
    
    /**
     * Gets a phonenumber from the phoneBook hashmap for a given name
     * @param name The key that is searched in the HashMap
     */
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
    
    /**
     * Prints all names and numbers of the phoneBooks
     */
    public void printAll(){
        for(String test : phoneBook.keySet() ){
            String key = test.toString();
            String value = phoneBook.get(test);
            System.out.println(key + value);
        }
    }

}
