
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    private double temperature;

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        temperature = 15;
    }

    /**
     * Increase the temperature by 5 degrees
     */
    public void warmer(){
        temperature += 5;
    }
    
    /**
     * Decrease the temperature by 5 degrees
     */
    public void cooler(){
        temperature -= 5;
    }
    
    /**
     * Return the temperature of the heater
     */
    public double getTemperature(){
        return temperature;
    }
    
}
