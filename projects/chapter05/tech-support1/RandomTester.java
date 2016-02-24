
/**
 * Write a description of class RandomTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;

public class RandomTester
{
    // instance variables - replace the example below with your own
    
    
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
       
    }

    public void printOneRandom(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
    }
    public void printMultiRandom(int howMany){
        for(int i=0; i < howMany; i++){
            printOneRandom();
        }
    }
    public void testRandom(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(100));
    }
    public void Random(int max){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(max) + 1);
    }
    public void Random2(int min, int max){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(max - min) + min); //bv max 5 min 2 = 5 - 2 + 2
    }
    
    public void throwDice(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(6) + 1);
    }
    
    public String getResponse(){
        ArrayList<String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        Random rnd = new Random();
        
        return array.get(rnd.nextInt(array.size()));
        
    }
}
