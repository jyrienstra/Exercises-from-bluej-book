
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
        if((temperature+=increment) >= max){ //make sure the tempeature can't be higher than the maximum temperature
            System.out.println("The heater has reached it's maximum limit of temperature: " + max + " degrees");
            temperature = max; //set the maximum temperature that is possible
        }else{
            temperature += increment;
        }
    }
    
    /**
     * Decrease the temperature by a certain increment
     */
    public void cooler(){
         if((temperature-=increment) <= min){ //make sure the tempeature can't be lowed than the minimum temperature
            System.out.println("The heater has reached it's mimimum limit of temperature: " + min + " degrees");
            temperature = min; //set the minimum temperature that is possible
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
    
    public void setIncrement(double temperatureIncrement){
        if(temperatureIncrement > 0){ //check if increment is not a negative number
            increment = temperatureIncrement;
        }else{
            System.out.println("The increment should be higher than 0");
        }
    }
}
