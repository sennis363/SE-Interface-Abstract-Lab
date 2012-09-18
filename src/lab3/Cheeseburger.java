/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Michael
 */
public class Cheeseburger extends Food implements Cheese{
    String cheese;
    
    public void setTemperature(int temperature) {
        //validate
        this.temperature = temperature;
    }
    
    public void setDeliciousness(int deliciousness) {
        //validate
        this.deliciousness = deliciousness;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public int getDeliciousness() {
        return deliciousness;
    }
    
    public void displayCheese(String cheese) {
            System.out.println("This hamburger has digivolved into a "
                    + "cheesburger!");
            }
    
    public void setName(String name) {
        //validate
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}
