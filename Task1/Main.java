package Task1;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Valdemar", "Poulsen", "BingBong"));
        customers.add(new Customer("Lean", "Coke", "LeanCoke69"));

        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}


