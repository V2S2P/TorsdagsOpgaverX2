package Task2;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        Cafe myCafe = new Cafe();
        


        System.out.println("Coffee Menu:");
        myCafe.loadMenuData();
        for (String coffee : myCafe.coffeeMenu){
            System.out.println(coffee);
        }
    }
}
