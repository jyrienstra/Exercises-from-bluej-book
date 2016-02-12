
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    private double temperature; //The temperature of the heater
    private double min; //The minimum temperature of the heater
    private double max; //The maximum temperature of the heater
    private double increment; 

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double minTemperature, double maxTemperature)
    {
        min = minTemperature;
        max = maxTemperature;
        increment = 5;
        temperature = 15;
    }

    /**
     * Increase the temperature by a certain increment
     */
    public void warmer(){
        if(temperature == max){ //check if the temperature is equal to the maximum alllowed temperature
            System.out.println("The heater has reached it's maximum limit of temperature: " + max + " degrees");
        }else{
            temperature += increment;
        }
    }
    
    /**
     * Decrease the temperature by a certain increment
     */
    public void cooler(){
         if(temperature == min){ //check if the temperature is equal to the minimum allowed temperature
            System.out.println("The heater has reached it's mimimum limit of temperature: " + min + " degrees");
        }else{
            temperature -= increment;
        }
    }
    
    /**
     * Return the temperature of the heater
     */
    public double getTemperature(){
        return temperature;
    }
    
}
