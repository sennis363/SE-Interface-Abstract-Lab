package lab3;

public class Startup {

    public static void main(String[] args) {
        Hamburger burger = new Hamburger();
        Cheeseburger cBurger = new Cheeseburger();
        
        burger.setName("Hamburger");
        burger.setDeliciousness(7);
        burger.setTemperature(90);
        System.out.println(burger.getName());
        System.out.println("Food Rating : " + burger.getDeliciousness());
        System.out.println("Temperature (F) : " + burger.getTemperature());
        System.out.println("");
        
        cBurger.setName("Cheeseburger");
        cBurger.setDeliciousness(8);
        cBurger.setTemperature(95);
        System.out.println(cBurger.getName());
        System.out.println("Food Rating : " + cBurger.getDeliciousness());
        System.out.println("Temperature (F) : " + cBurger.getTemperature());
        cBurger.displayCheese(cBurger.cheese);
        
    }
}
