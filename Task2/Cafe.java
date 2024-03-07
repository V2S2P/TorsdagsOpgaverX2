package Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Cafe {
    ArrayList<String> coffeeMenu;

   public Cafe(){
       coffeeMenu = new ArrayList<>();
   }

    public void loadMenuData() {
        try {
            File file = new File("cof.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
                //coffeeMenu.add(data);

                while (scanner.hasNextLine()){
                    coffeeMenu.add(scanner.nextLine());
                }

            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
