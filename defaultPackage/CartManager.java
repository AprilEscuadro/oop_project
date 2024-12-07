/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defaultPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to manage the cart functionality.
 * This class allows adding items to the cart and retrieving cart contents.
 */
public class CartManager {

    // A static list to hold cart items
    private static final List<String> cart = new ArrayList<>();

    /**
     * Adds an item to the cart.
     * 
     * @param item The item to be added to the cart.
     */
    public static void addToCart(String item) {
        cart.add(item);
    }

    /**
     * Retrieves all items currently in the cart.
     * 
     * @return A list of items in the cart.
     */
    public static List<String> getCartItems() {
        return new ArrayList<>(cart); // Return a copy to avoid external modification
    }
}
