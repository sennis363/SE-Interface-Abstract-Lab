/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Michael
 */
public abstract class Food {
    //The abstract class should come first, because the interface can be brought
    //in at any of the sub-classes.
    
    //These variables are something that all foods have in common, so therefore
    //they are in the super abstract class. The only variable that is not in the
    //super class is cheese, because that is unique to Cheeseburger.
    int temperature;
    int deliciousness;
    String name;
    //I couldn't come up with something that would work with all food, so I used
    //abstract methods and overided them.
    abstract void setTemperature(int temperature);
    abstract void setDeliciousness(int deliciousness);
    abstract void setName(String name);
}
