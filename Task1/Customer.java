package Task1;
import java.util.*;
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = ++counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        String result = "";
        result = "\nName: " + firstName + " " + lastName + "\nUsername: " + username;
        return result;
    }
}

